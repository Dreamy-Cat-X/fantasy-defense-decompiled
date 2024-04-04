package androidx.work;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: D:\decomp\classes.dex */
public class DelegatingWorkerFactory extends WorkerFactory {
    private static final String TAG = Logger.tagWithPrefix("DelegatingWkrFctry");
    private final List<WorkerFactory> mFactories = new LinkedList();

    List<WorkerFactory> getFactories() {
        return this.mFactories;
    }

    public final void addFactory(WorkerFactory workerFactory) {
        this.mFactories.add(workerFactory);
    }

    @Override // androidx.work.WorkerFactory
    public final ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
        Iterator<WorkerFactory> it = this.mFactories.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker createWorker = it.next().createWorker(context, str, workerParameters);
                if (createWorker != null) {
                    return createWorker;
                }
            } catch (Throwable th) {
                Logger.get().error(TAG, String.format("Unable to instantiate a ListenableWorker (%s)", str), th);
                throw th;
            }
        }
        return null;
    }
}
