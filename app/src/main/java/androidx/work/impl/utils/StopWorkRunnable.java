package androidx.work.impl.utils;

import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;

/* loaded from: D:\decomp\classes.dex */
public class StopWorkRunnable implements Runnable {
    private static final String TAG = Logger.tagWithPrefix("StopWorkRunnable");
    private WorkManagerImpl mWorkManagerImpl;
    private String mWorkSpecId;

    public StopWorkRunnable(WorkManagerImpl workManagerImpl, String str) {
        this.mWorkManagerImpl = workManagerImpl;
        this.mWorkSpecId = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        WorkDatabase workDatabase = this.mWorkManagerImpl.getWorkDatabase();
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            if (workSpecDao.getState(this.mWorkSpecId) == WorkInfo.State.RUNNING) {
                workSpecDao.setState(WorkInfo.State.ENQUEUED, this.mWorkSpecId);
            }
            Logger.get().debug(TAG, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.mWorkSpecId, Boolean.valueOf(this.mWorkManagerImpl.getProcessor().stopWork(this.mWorkSpecId))), new Throwable[0]);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
        }
    }
}
