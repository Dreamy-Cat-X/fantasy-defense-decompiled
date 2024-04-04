package androidx.work.impl.utils.taskexecutor;

import java.util.concurrent.Executor;

/* loaded from: D:\decomp\classes.dex */
public interface TaskExecutor {
    void executeOnBackgroundThread(Runnable runnable);

    Executor getBackgroundExecutor();

    Executor getMainThreadExecutor();

    void postToMainThread(Runnable runnable);
}
