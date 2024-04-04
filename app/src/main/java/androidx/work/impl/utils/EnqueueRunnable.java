package androidx.work.impl.utils;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: D:\decomp\classes.dex */
public class EnqueueRunnable implements Runnable {
    private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");
    private final OperationImpl mOperation = new OperationImpl();
    private final WorkContinuationImpl mWorkContinuation;

    public EnqueueRunnable(WorkContinuationImpl workContinuationImpl) {
        this.mWorkContinuation = workContinuationImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.mWorkContinuation.hasCycles()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.mWorkContinuation));
            }
            if (addToDatabase()) {
                PackageManagerHelper.setComponentEnabled(this.mWorkContinuation.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
                scheduleWorkInBackground();
            }
            this.mOperation.setState(Operation.SUCCESS);
        } catch (Throwable th) {
            this.mOperation.setState(new Operation.State.FAILURE(th));
        }
    }

    public Operation getOperation() {
        return this.mOperation;
    }

    public boolean addToDatabase() {
        WorkDatabase workDatabase = this.mWorkContinuation.getWorkManagerImpl().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            boolean processContinuation = processContinuation(this.mWorkContinuation);
            workDatabase.setTransactionSuccessful();
            return processContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public void scheduleWorkInBackground() {
        WorkManagerImpl workManagerImpl = this.mWorkContinuation.getWorkManagerImpl();
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private static boolean processContinuation(WorkContinuationImpl workContinuationImpl) {
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        boolean z = false;
        if (parents != null) {
            boolean z2 = false;
            for (WorkContinuationImpl workContinuationImpl2 : parents) {
                if (!workContinuationImpl2.isEnqueued()) {
                    z2 |= processContinuation(workContinuationImpl2);
                } else {
                    Logger.get().warning(TAG, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", workContinuationImpl2.getIds())), new Throwable[0]);
                }
            }
            z = z2;
        }
        return enqueueContinuation(workContinuationImpl) | z;
    }

    private static boolean enqueueContinuation(WorkContinuationImpl workContinuationImpl) {
        boolean enqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workContinuationImpl.getWorkManagerImpl(), workContinuationImpl.getWork(), (String[]) WorkContinuationImpl.prerequisitesFor(workContinuationImpl).toArray(new String[0]), workContinuationImpl.getName(), workContinuationImpl.getExistingWorkPolicy());
        workContinuationImpl.markEnqueued();
        return enqueueWorkWithPrerequisites;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ae A[LOOP:6: B:108:0x01a8->B:110:0x01ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean enqueueWorkWithPrerequisites(WorkManagerImpl workManagerImpl, List<? extends WorkRequest> list, String[] strArr, String str, ExistingWorkPolicy existingWorkPolicy) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        Iterator<String> it;
        String[] strArr2 = strArr;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        boolean z5 = strArr2 != null && strArr2.length > 0;
        if (z5) {
            z = true;
            z2 = false;
            z3 = false;
            for (String str2 : strArr2) {
                WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(str2);
                if (workSpec == null) {
                    Logger.get().error(TAG, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    return false;
                }
                WorkInfo.State state = workSpec.state;
                z &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z2 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z3 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean z6 = !TextUtils.isEmpty(str);
        if (z6 && !z5) {
            List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workDatabase.workSpecDao().getWorkSpecIdAndStatesForName(str);
            if (!workSpecIdAndStatesForName.isEmpty()) {
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND) {
                    DependencyDao dependencyDao = workDatabase.dependencyDao();
                    ArrayList arrayList = new ArrayList();
                    for (WorkSpec.IdAndState idAndState : workSpecIdAndStatesForName) {
                        if (!dependencyDao.hasDependents(idAndState.id)) {
                            boolean z7 = (idAndState.state == WorkInfo.State.SUCCEEDED) & z;
                            if (idAndState.state == WorkInfo.State.FAILED) {
                                z2 = true;
                            } else if (idAndState.state == WorkInfo.State.CANCELLED) {
                                z3 = true;
                            }
                            arrayList.add(idAndState.id);
                            z = z7;
                        }
                    }
                    strArr2 = (String[]) arrayList.toArray(strArr2);
                    z5 = strArr2.length > 0;
                } else {
                    if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                        for (WorkSpec.IdAndState idAndState2 : workSpecIdAndStatesForName) {
                            if (idAndState2.state == WorkInfo.State.ENQUEUED || idAndState2.state == WorkInfo.State.RUNNING) {
                                return false;
                            }
                        }
                    }
                    CancelWorkRunnable.forName(str, workManagerImpl, false).run();
                    WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                    Iterator<WorkSpec.IdAndState> it2 = workSpecIdAndStatesForName.iterator();
                    while (it2.hasNext()) {
                        workSpecDao.delete(it2.next().id);
                    }
                    z4 = true;
                    for (WorkRequest workRequest : list) {
                        WorkSpec workSpec2 = workRequest.getWorkSpec();
                        if (!z5 || z) {
                            if (!workSpec2.isPeriodic()) {
                                workSpec2.periodStartTime = currentTimeMillis;
                            } else {
                                j = currentTimeMillis;
                                workSpec2.periodStartTime = 0L;
                                if (Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT <= 25) {
                                    tryDelegateConstrainedWorkSpec(workSpec2);
                                } else if (Build.VERSION.SDK_INT <= 22 && usesScheduler(workManagerImpl, Schedulers.GCM_SCHEDULER)) {
                                    tryDelegateConstrainedWorkSpec(workSpec2);
                                }
                                if (workSpec2.state == WorkInfo.State.ENQUEUED) {
                                    z4 = true;
                                }
                                workDatabase.workSpecDao().insertWorkSpec(workSpec2);
                                if (z5) {
                                    for (String str3 : strArr2) {
                                        workDatabase.dependencyDao().insertDependency(new Dependency(workRequest.getStringId(), str3));
                                    }
                                }
                                it = workRequest.getTags().iterator();
                                while (it.hasNext()) {
                                    workDatabase.workTagDao().insert(new WorkTag(it.next(), workRequest.getStringId()));
                                }
                                if (!z6) {
                                    workDatabase.workNameDao().insert(new WorkName(str, workRequest.getStringId()));
                                }
                                currentTimeMillis = j;
                            }
                        } else if (z2) {
                            workSpec2.state = WorkInfo.State.FAILED;
                        } else if (z3) {
                            workSpec2.state = WorkInfo.State.CANCELLED;
                        } else {
                            workSpec2.state = WorkInfo.State.BLOCKED;
                        }
                        j = currentTimeMillis;
                        if (Build.VERSION.SDK_INT < 23) {
                        }
                        if (Build.VERSION.SDK_INT <= 22) {
                            tryDelegateConstrainedWorkSpec(workSpec2);
                        }
                        if (workSpec2.state == WorkInfo.State.ENQUEUED) {
                        }
                        workDatabase.workSpecDao().insertWorkSpec(workSpec2);
                        if (z5) {
                        }
                        it = workRequest.getTags().iterator();
                        while (it.hasNext()) {
                        }
                        if (!z6) {
                        }
                        currentTimeMillis = j;
                    }
                    return z4;
                }
            }
        }
        z4 = false;
        while (r8.hasNext()) {
        }
        return z4;
    }

    private static void tryDelegateConstrainedWorkSpec(WorkSpec workSpec) {
        Constraints constraints = workSpec.constraints;
        if (constraints.requiresBatteryNotLow() || constraints.requiresStorageNotLow()) {
            String str = workSpec.workerClassName;
            Data.Builder builder = new Data.Builder();
            builder.putAll(workSpec.input).putString(ConstraintTrackingWorker.ARGUMENT_CLASS_NAME, str);
            workSpec.workerClassName = ConstraintTrackingWorker.class.getName();
            workSpec.input = builder.build();
        }
    }

    private static boolean usesScheduler(WorkManagerImpl workManagerImpl, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterator<Scheduler> it = workManagerImpl.getSchedulers().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }
}
