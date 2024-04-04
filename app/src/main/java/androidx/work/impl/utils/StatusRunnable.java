package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* loaded from: D:\decomp\classes.dex */
public abstract class StatusRunnable<T> implements Runnable {
    private final SettableFuture<T> mFuture = SettableFuture.create();

    abstract T runInternal();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.mFuture.set(runInternal());
        } catch (Throwable th) {
            this.mFuture.setException(th);
        }
    }

    public ListenableFuture<T> getFuture() {
        return this.mFuture;
    }

    public static StatusRunnable<List<WorkInfo>> forStringIds(final WorkManagerImpl workManagerImpl, final List<String> list) {
        return new StatusRunnable<List<WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.1
            @Override // androidx.work.impl.utils.StatusRunnable
            public List<WorkInfo> runInternal() {
                return WorkSpec.WORK_INFO_MAPPER.apply(WorkManagerImpl.this.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(list));
            }
        };
    }

    public static StatusRunnable<WorkInfo> forUUID(final WorkManagerImpl workManagerImpl, final UUID uuid) {
        return new StatusRunnable<WorkInfo>() { // from class: androidx.work.impl.utils.StatusRunnable.2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.work.impl.utils.StatusRunnable
            public WorkInfo runInternal() {
                WorkSpec.WorkInfoPojo workStatusPojoForId = WorkManagerImpl.this.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(uuid.toString());
                if (workStatusPojoForId != null) {
                    return workStatusPojoForId.toWorkInfo();
                }
                return null;
            }
        };
    }

    public static StatusRunnable<List<WorkInfo>> forTag(final WorkManagerImpl workManagerImpl, final String str) {
        return new StatusRunnable<List<WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.work.impl.utils.StatusRunnable
            public List<WorkInfo> runInternal() {
                return WorkSpec.WORK_INFO_MAPPER.apply(WorkManagerImpl.this.getWorkDatabase().workSpecDao().getWorkStatusPojoForTag(str));
            }
        };
    }

    public static StatusRunnable<List<WorkInfo>> forUniqueWork(final WorkManagerImpl workManagerImpl, final String str) {
        return new StatusRunnable<List<WorkInfo>>() { // from class: androidx.work.impl.utils.StatusRunnable.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.work.impl.utils.StatusRunnable
            public List<WorkInfo> runInternal() {
                return WorkSpec.WORK_INFO_MAPPER.apply(WorkManagerImpl.this.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(str));
            }
        };
    }
}
