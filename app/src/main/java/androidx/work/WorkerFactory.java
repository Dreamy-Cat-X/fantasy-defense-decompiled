package androidx.work;

import android.content.Context;

/* loaded from: D:\decomp\classes.dex */
public abstract class WorkerFactory {
    private static final String TAG = Logger.tagWithPrefix("WorkerFactory");

    public abstract ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker createWorkerWithDefaultFallback(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker createWorker = createWorker(context, str, workerParameters);
        if (createWorker != null) {
            return createWorker;
        }
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Exception e) {
                Logger.get().error(TAG, "Could not instantiate " + str, e);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            Logger.get().error(TAG, "Class not found: " + str, new Throwable[0]);
            return null;
        }
    }

    public static WorkerFactory getDefaultWorkerFactory() {
        return new WorkerFactory() { // from class: androidx.work.WorkerFactory.1
            @Override // androidx.work.WorkerFactory
            public ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
                return null;
            }
        };
    }
}
