package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: D:\decomp\classes.dex */
public class ForceStopRunnable implements Runnable {
    static final String ACTION_FORCE_STOP_RESCHEDULE = "ACTION_FORCE_STOP_RESCHEDULE";
    private static final int ALARM_ID = -1;
    private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable");
    private static final long TEN_YEARS = TimeUnit.DAYS.toMillis(3650);
    private final Context mContext;
    private final WorkManagerImpl mWorkManager;

    public ForceStopRunnable(Context context, WorkManagerImpl workManagerImpl) {
        this.mContext = context.getApplicationContext();
        this.mWorkManager = workManagerImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger.get().debug(TAG, "Performing cleanup operations.", new Throwable[0]);
        boolean cleanUp = cleanUp();
        if (shouldRescheduleWorkers()) {
            Logger.get().debug(TAG, "Rescheduling Workers.", new Throwable[0]);
            this.mWorkManager.rescheduleEligibleWork();
            this.mWorkManager.getPreferences().setNeedsReschedule(false);
        } else if (isForceStopped()) {
            Logger.get().debug(TAG, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.mWorkManager.rescheduleEligibleWork();
        } else if (cleanUp) {
            Logger.get().debug(TAG, "Found unfinished work, scheduling it.", new Throwable[0]);
            Schedulers.schedule(this.mWorkManager.getConfiguration(), this.mWorkManager.getWorkDatabase(), this.mWorkManager.getSchedulers());
        }
        this.mWorkManager.onForceStopRunnableCompleted();
    }

    public boolean isForceStopped() {
        if (getPendingIntent(this.mContext, 536870912) != null) {
            return false;
        }
        setAlarm(this.mContext);
        return true;
    }

    public boolean cleanUp() {
        if (Build.VERSION.SDK_INT >= 23) {
            SystemJobScheduler.cancelInvalidJobs(this.mContext);
        }
        WorkDatabase workDatabase = this.mWorkManager.getWorkDatabase();
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> runningWork = workSpecDao.getRunningWork();
            boolean z = (runningWork == null || runningWork.isEmpty()) ? false : true;
            if (z) {
                for (WorkSpec workSpec : runningWork) {
                    workSpecDao.setState(WorkInfo.State.ENQUEUED, workSpec.id);
                    workSpecDao.markWorkSpecScheduled(workSpec.id, -1L);
                }
            }
            workDatabase.setTransactionSuccessful();
            return z;
        } finally {
            workDatabase.endTransaction();
        }
    }

    boolean shouldRescheduleWorkers() {
        return this.mWorkManager.getPreferences().needsReschedule();
    }

    private static PendingIntent getPendingIntent(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, getIntent(context), i);
    }

    static Intent getIntent(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction(ACTION_FORCE_STOP_RESCHEDULE);
        return intent;
    }

    static void setAlarm(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent pendingIntent = getPendingIntent(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + TEN_YEARS;
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, pendingIntent);
            } else {
                alarmManager.set(0, currentTimeMillis, pendingIntent);
            }
        }
    }

    /* loaded from: D:\decomp\classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String TAG = Logger.tagWithPrefix("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !ForceStopRunnable.ACTION_FORCE_STOP_RESCHEDULE.equals(intent.getAction())) {
                return;
            }
            Logger.get().verbose(TAG, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.setAlarm(context);
        }
    }
}
