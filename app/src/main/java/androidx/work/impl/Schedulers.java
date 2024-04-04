package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmScheduler;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.PackageManagerHelper;
import java.util.Iterator;
import java.util.List;

/* loaded from: D:\decomp\classes.dex */
public class Schedulers {
    public static final String GCM_SCHEDULER = "androidx.work.impl.background.gcm.GcmScheduler";
    private static final String TAG = Logger.tagWithPrefix("Schedulers");

    public static void schedule(Configuration configuration, WorkDatabase workDatabase, List<Scheduler> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> eligibleWorkForScheduling = workSpecDao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit());
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator<WorkSpec> it = eligibleWorkForScheduling.iterator();
                while (it.hasNext()) {
                    workSpecDao.markWorkSpecScheduled(it.next().id, currentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            if (eligibleWorkForScheduling == null || eligibleWorkForScheduling.size() <= 0) {
                return;
            }
            WorkSpec[] workSpecArr = (WorkSpec[]) eligibleWorkForScheduling.toArray(new WorkSpec[0]);
            Iterator<Scheduler> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().schedule(workSpecArr);
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Scheduler createBestAvailableBackgroundScheduler(Context context, WorkManagerImpl workManagerImpl) {
        if (Build.VERSION.SDK_INT >= 23) {
            SystemJobScheduler systemJobScheduler = new SystemJobScheduler(context, workManagerImpl);
            PackageManagerHelper.setComponentEnabled(context, SystemJobService.class, true);
            Logger.get().debug(TAG, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return systemJobScheduler;
        }
        Scheduler tryCreateGcmBasedScheduler = tryCreateGcmBasedScheduler(context);
        if (tryCreateGcmBasedScheduler != null) {
            return tryCreateGcmBasedScheduler;
        }
        SystemAlarmScheduler systemAlarmScheduler = new SystemAlarmScheduler(context);
        PackageManagerHelper.setComponentEnabled(context, SystemAlarmService.class, true);
        Logger.get().debug(TAG, "Created SystemAlarmScheduler", new Throwable[0]);
        return systemAlarmScheduler;
    }

    private static Scheduler tryCreateGcmBasedScheduler(Context context) {
        try {
            Scheduler scheduler = (Scheduler) Class.forName(GCM_SCHEDULER).getConstructor(Context.class).newInstance(context);
            Logger.get().debug(TAG, String.format("Created %s", GCM_SCHEDULER), new Throwable[0]);
            return scheduler;
        } catch (Throwable th) {
            Logger.get().debug(TAG, "Unable to create GCM Scheduler", th);
            return null;
        }
    }

    private Schedulers() {
    }
}
