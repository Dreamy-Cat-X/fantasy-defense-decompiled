package androidx.work.impl.utils;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* loaded from: D:\decomp\classes.dex */
public class LiveDataUtils {
    public static <In, Out> LiveData<Out> dedupedMappedLiveDataFor(LiveData<In> liveData, Function<In, Out> function, TaskExecutor taskExecutor) {
        Object obj = new Object();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new AnonymousClass1(taskExecutor, obj, function, mediatorLiveData));
        return mediatorLiveData;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [In] */
    /* renamed from: androidx.work.impl.utils.LiveDataUtils$1, reason: invalid class name */
    /* loaded from: D:\decomp\classes.dex */
    public static class AnonymousClass1<In> implements Observer<In> {
        Out mCurrentOutput = null;
        final /* synthetic */ Object val$lock;
        final /* synthetic */ Function val$mappingMethod;
        final /* synthetic */ MediatorLiveData val$outputLiveData;
        final /* synthetic */ TaskExecutor val$workTaskExecutor;

        AnonymousClass1(TaskExecutor taskExecutor, Object obj, Function function, MediatorLiveData mediatorLiveData) {
            this.val$workTaskExecutor = taskExecutor;
            this.val$lock = obj;
            this.val$mappingMethod = function;
            this.val$outputLiveData = mediatorLiveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(final In in) {
            this.val$workTaskExecutor.executeOnBackgroundThread(new Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, Out] */
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (AnonymousClass1.this.val$lock) {
                        ?? apply = AnonymousClass1.this.val$mappingMethod.apply(in);
                        if (AnonymousClass1.this.mCurrentOutput == 0 && apply != 0) {
                            AnonymousClass1.this.mCurrentOutput = apply;
                            AnonymousClass1.this.val$outputLiveData.postValue(apply);
                        } else if (AnonymousClass1.this.mCurrentOutput != 0 && !AnonymousClass1.this.mCurrentOutput.equals(apply)) {
                            AnonymousClass1.this.mCurrentOutput = apply;
                            AnonymousClass1.this.val$outputLiveData.postValue(apply);
                        }
                    }
                }
            });
        }
    }

    private LiveDataUtils() {
    }
}
