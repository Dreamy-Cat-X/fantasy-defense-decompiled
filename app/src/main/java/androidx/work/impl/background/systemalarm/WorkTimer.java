package androidx.work.impl.background.systemalarm;

import androidx.work.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: D:\decomp\classes.dex */
class WorkTimer {
    private static final String TAG = Logger.tagWithPrefix("WorkTimer");
    private final ThreadFactory mBackgroundThreadFactory = new ThreadFactory() { // from class: androidx.work.impl.background.systemalarm.WorkTimer.1
        private int mThreadsCreated = 0;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.mThreadsCreated);
            this.mThreadsCreated = this.mThreadsCreated + 1;
            return newThread;
        }
    };
    final Map<String, WorkTimerRunnable> mTimerMap = new HashMap();
    final Map<String, TimeLimitExceededListener> mListeners = new HashMap();
    final Object mLock = new Object();
    private final ScheduledExecutorService mExecutorService = Executors.newSingleThreadScheduledExecutor(this.mBackgroundThreadFactory);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: D:\decomp\classes.dex */
    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void startTimer(String str, long j, TimeLimitExceededListener timeLimitExceededListener) {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, String.format("Starting timer for %s", str), new Throwable[0]);
            stopTimer(str);
            WorkTimerRunnable workTimerRunnable = new WorkTimerRunnable(this, str);
            this.mTimerMap.put(str, workTimerRunnable);
            this.mListeners.put(str, timeLimitExceededListener);
            this.mExecutorService.schedule(workTimerRunnable, j, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stopTimer(String str) {
        synchronized (this.mLock) {
            if (this.mTimerMap.remove(str) != null) {
                Logger.get().debug(TAG, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.mListeners.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDestroy() {
        if (this.mExecutorService.isShutdown()) {
            return;
        }
        this.mExecutorService.shutdownNow();
    }

    synchronized Map<String, WorkTimerRunnable> getTimerMap() {
        return this.mTimerMap;
    }

    synchronized Map<String, TimeLimitExceededListener> getListeners() {
        return this.mListeners;
    }

    ScheduledExecutorService getExecutorService() {
        return this.mExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: D:\decomp\classes.dex */
    public static class WorkTimerRunnable implements Runnable {
        static final String TAG = "WrkTimerRunnable";
        private final String mWorkSpecId;
        private final WorkTimer mWorkTimer;

        WorkTimerRunnable(WorkTimer workTimer, String str) {
            this.mWorkTimer = workTimer;
            this.mWorkSpecId = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.mWorkTimer.mLock) {
                if (this.mWorkTimer.mTimerMap.remove(this.mWorkSpecId) != null) {
                    TimeLimitExceededListener remove = this.mWorkTimer.mListeners.remove(this.mWorkSpecId);
                    if (remove != null) {
                        remove.onTimeLimitExceeded(this.mWorkSpecId);
                    }
                } else {
                    Logger.get().debug(TAG, String.format("Timer with %s is already marked as complete.", this.mWorkSpecId), new Throwable[0]);
                }
            }
        }
    }
}
