package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: D:\decomp\classes.dex */
public class Processor implements ExecutionListener {
    private static final String TAG = Logger.tagWithPrefix("Processor");
    private Context mAppContext;
    private Configuration mConfiguration;
    private List<Scheduler> mSchedulers;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;
    private Map<String, WorkerWrapper> mEnqueuedWorkMap = new HashMap();
    private Set<String> mCancelledIds = new HashSet();
    private final List<ExecutionListener> mOuterListeners = new ArrayList();
    private final Object mLock = new Object();

    public Processor(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, List<Scheduler> list) {
        this.mAppContext = context;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
        this.mSchedulers = list;
    }

    public boolean startWork(String str) {
        return startWork(str, null);
    }

    public boolean startWork(String str, WorkerParameters.RuntimeExtras runtimeExtras) {
        synchronized (this.mLock) {
            if (this.mEnqueuedWorkMap.containsKey(str)) {
                Logger.get().debug(TAG, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            WorkerWrapper build = new WorkerWrapper.Builder(this.mAppContext, this.mConfiguration, this.mWorkTaskExecutor, this.mWorkDatabase, str).withSchedulers(this.mSchedulers).withRuntimeExtras(runtimeExtras).build();
            ListenableFuture<Boolean> future = build.getFuture();
            future.addListener(new FutureListener(this, str, future), this.mWorkTaskExecutor.getMainThreadExecutor());
            this.mEnqueuedWorkMap.put(str, build);
            this.mWorkTaskExecutor.getBackgroundExecutor().execute(build);
            Logger.get().debug(TAG, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean stopWork(String str) {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, String.format("Processor stopping %s", str), new Throwable[0]);
            WorkerWrapper remove = this.mEnqueuedWorkMap.remove(str);
            if (remove != null) {
                remove.interrupt(false);
                Logger.get().debug(TAG, String.format("WorkerWrapper stopped for %s", str), new Throwable[0]);
                return true;
            }
            Logger.get().debug(TAG, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
    }

    public boolean stopAndCancelWork(String str) {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.mCancelledIds.add(str);
            WorkerWrapper remove = this.mEnqueuedWorkMap.remove(str);
            if (remove != null) {
                remove.interrupt(true);
                Logger.get().debug(TAG, String.format("WorkerWrapper cancelled for %s", str), new Throwable[0]);
                return true;
            }
            Logger.get().debug(TAG, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
    }

    public boolean isCancelled(String str) {
        boolean contains;
        synchronized (this.mLock) {
            contains = this.mCancelledIds.contains(str);
        }
        return contains;
    }

    public boolean hasWork() {
        boolean z;
        synchronized (this.mLock) {
            z = !this.mEnqueuedWorkMap.isEmpty();
        }
        return z;
    }

    public boolean isEnqueued(String str) {
        boolean containsKey;
        synchronized (this.mLock) {
            containsKey = this.mEnqueuedWorkMap.containsKey(str);
        }
        return containsKey;
    }

    public void addExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.add(executionListener);
        }
    }

    public void removeExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(String str, boolean z) {
        synchronized (this.mLock) {
            this.mEnqueuedWorkMap.remove(str);
            Logger.get().debug(TAG, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            Iterator<ExecutionListener> it = this.mOuterListeners.iterator();
            while (it.hasNext()) {
                it.next().onExecuted(str, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: D:\decomp\classes.dex */
    public static class FutureListener implements Runnable {
        private ExecutionListener mExecutionListener;
        private ListenableFuture<Boolean> mFuture;
        private String mWorkSpecId;

        FutureListener(ExecutionListener executionListener, String str, ListenableFuture<Boolean> listenableFuture) {
            this.mExecutionListener = executionListener;
            this.mWorkSpecId = str;
            this.mFuture = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.mFuture.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.mExecutionListener.onExecuted(this.mWorkSpecId, z);
        }
    }
}
