package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: D:\decomp\classes.dex */
public class SystemAlarmDispatcher implements ExecutionListener {
    private static final int DEFAULT_START_ID = 0;
    private static final String KEY_START_ID = "KEY_START_ID";
    private static final String PROCESS_COMMAND_TAG = "ProcessCommand";
    static final String TAG = Logger.tagWithPrefix("SystemAlarmDispatcher");
    final CommandHandler mCommandHandler;
    private CommandsCompletedListener mCompletedListener;
    final Context mContext;
    Intent mCurrentIntent;
    final List<Intent> mIntents;
    private final Handler mMainHandler;
    private final Processor mProcessor;
    private final TaskExecutor mTaskExecutor;
    private final WorkManagerImpl mWorkManager;
    private final WorkTimer mWorkTimer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: D:\decomp\classes.dex */
    public interface CommandsCompletedListener {
        void onAllCommandsCompleted();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SystemAlarmDispatcher(Context context) {
        this(context, null, null);
    }

    SystemAlarmDispatcher(Context context, Processor processor, WorkManagerImpl workManagerImpl) {
        this.mContext = context.getApplicationContext();
        this.mCommandHandler = new CommandHandler(this.mContext);
        this.mWorkTimer = new WorkTimer();
        workManagerImpl = workManagerImpl == null ? WorkManagerImpl.getInstance(context) : workManagerImpl;
        this.mWorkManager = workManagerImpl;
        this.mProcessor = processor == null ? workManagerImpl.getProcessor() : processor;
        this.mTaskExecutor = this.mWorkManager.getWorkTaskExecutor();
        this.mProcessor.addExecutionListener(this);
        this.mIntents = new ArrayList();
        this.mCurrentIntent = null;
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDestroy() {
        Logger.get().debug(TAG, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.mProcessor.removeExecutionListener(this);
        this.mWorkTimer.onDestroy();
        this.mCompletedListener = null;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(String str, boolean z) {
        postOnMainThread(new AddRunnable(this, CommandHandler.createExecutionCompletedIntent(this.mContext, str, z), 0));
    }

    public boolean add(Intent intent, int i) {
        Logger.get().debug(TAG, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        assertMainThread();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.get().warning(TAG, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && hasIntentWithAction("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra(KEY_START_ID, i);
        synchronized (this.mIntents) {
            boolean z = this.mIntents.isEmpty() ? false : true;
            this.mIntents.add(intent);
            if (!z) {
                processCommand();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCompletedListener(CommandsCompletedListener commandsCompletedListener) {
        if (this.mCompletedListener != null) {
            Logger.get().error(TAG, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.mCompletedListener = commandsCompletedListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Processor getProcessor() {
        return this.mProcessor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WorkTimer getWorkTimer() {
        return this.mWorkTimer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WorkManagerImpl getWorkManager() {
        return this.mWorkManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskExecutor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void postOnMainThread(Runnable runnable) {
        this.mMainHandler.post(runnable);
    }

    void dequeueAndCheckForCompletion() {
        Logger.get().debug(TAG, "Checking if commands are complete.", new Throwable[0]);
        assertMainThread();
        synchronized (this.mIntents) {
            if (this.mCurrentIntent != null) {
                Logger.get().debug(TAG, String.format("Removing command %s", this.mCurrentIntent), new Throwable[0]);
                if (!this.mIntents.remove(0).equals(this.mCurrentIntent)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.mCurrentIntent = null;
            }
            if (!this.mCommandHandler.hasPendingCommands() && this.mIntents.isEmpty()) {
                Logger.get().debug(TAG, "No more commands & intents.", new Throwable[0]);
                if (this.mCompletedListener != null) {
                    this.mCompletedListener.onAllCommandsCompleted();
                }
            } else if (!this.mIntents.isEmpty()) {
                processCommand();
            }
        }
    }

    private void processCommand() {
        assertMainThread();
        PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(this.mContext, PROCESS_COMMAND_TAG);
        try {
            newWakeLock.acquire();
            this.mWorkManager.getWorkTaskExecutor().executeOnBackgroundThread(new Runnable() { // from class: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
                @Override // java.lang.Runnable
                public void run() {
                    SystemAlarmDispatcher systemAlarmDispatcher;
                    DequeueAndCheckForCompletion dequeueAndCheckForCompletion;
                    synchronized (SystemAlarmDispatcher.this.mIntents) {
                        SystemAlarmDispatcher.this.mCurrentIntent = SystemAlarmDispatcher.this.mIntents.get(0);
                    }
                    if (SystemAlarmDispatcher.this.mCurrentIntent != null) {
                        String action = SystemAlarmDispatcher.this.mCurrentIntent.getAction();
                        int intExtra = SystemAlarmDispatcher.this.mCurrentIntent.getIntExtra(SystemAlarmDispatcher.KEY_START_ID, 0);
                        Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Processing command %s, %s", SystemAlarmDispatcher.this.mCurrentIntent, Integer.valueOf(intExtra)), new Throwable[0]);
                        PowerManager.WakeLock newWakeLock2 = WakeLocks.newWakeLock(SystemAlarmDispatcher.this.mContext, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                        try {
                            Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Acquiring operation wake lock (%s) %s", action, newWakeLock2), new Throwable[0]);
                            newWakeLock2.acquire();
                            SystemAlarmDispatcher.this.mCommandHandler.onHandleIntent(SystemAlarmDispatcher.this.mCurrentIntent, intExtra, SystemAlarmDispatcher.this);
                            Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Releasing operation wake lock (%s) %s", action, newWakeLock2), new Throwable[0]);
                            newWakeLock2.release();
                            systemAlarmDispatcher = SystemAlarmDispatcher.this;
                            dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                        } catch (Throwable th) {
                            try {
                                Logger.get().error(SystemAlarmDispatcher.TAG, "Unexpected error in onHandleIntent", th);
                                Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Releasing operation wake lock (%s) %s", action, newWakeLock2), new Throwable[0]);
                                newWakeLock2.release();
                                systemAlarmDispatcher = SystemAlarmDispatcher.this;
                                dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                            } catch (Throwable th2) {
                                Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Releasing operation wake lock (%s) %s", action, newWakeLock2), new Throwable[0]);
                                newWakeLock2.release();
                                SystemAlarmDispatcher.this.postOnMainThread(new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this));
                                throw th2;
                            }
                        }
                        systemAlarmDispatcher.postOnMainThread(dequeueAndCheckForCompletion);
                    }
                }
            });
        } finally {
            newWakeLock.release();
        }
    }

    private boolean hasIntentWithAction(String str) {
        assertMainThread();
        synchronized (this.mIntents) {
            Iterator<Intent> it = this.mIntents.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void assertMainThread() {
        if (this.mMainHandler.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* loaded from: D:\decomp\classes.dex */
    static class DequeueAndCheckForCompletion implements Runnable {
        private final SystemAlarmDispatcher mDispatcher;

        DequeueAndCheckForCompletion(SystemAlarmDispatcher systemAlarmDispatcher) {
            this.mDispatcher = systemAlarmDispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.dequeueAndCheckForCompletion();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: D:\decomp\classes.dex */
    public static class AddRunnable implements Runnable {
        private final SystemAlarmDispatcher mDispatcher;
        private final Intent mIntent;
        private final int mStartId;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AddRunnable(SystemAlarmDispatcher systemAlarmDispatcher, Intent intent, int i) {
            this.mDispatcher = systemAlarmDispatcher;
            this.mIntent = intent;
            this.mStartId = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.add(this.mIntent, this.mStartId);
        }
    }
}
