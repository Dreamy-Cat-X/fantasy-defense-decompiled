package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: D:\decomp\classes.dex */
public class ConstraintsCommandHandler {
    private static final String TAG = Logger.tagWithPrefix("ConstraintsCmdHandler");
    private final Context mContext;
    private final SystemAlarmDispatcher mDispatcher;
    private final int mStartId;
    private final WorkConstraintsTracker mWorkConstraintsTracker;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConstraintsCommandHandler(Context context, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.mContext = context;
        this.mStartId = i;
        this.mDispatcher = systemAlarmDispatcher;
        this.mWorkConstraintsTracker = new WorkConstraintsTracker(this.mContext, systemAlarmDispatcher.getTaskExecutor(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void handleConstraintsChanged() {
        List<WorkSpec> scheduledWork = this.mDispatcher.getWorkManager().getWorkDatabase().workSpecDao().getScheduledWork();
        ConstraintProxy.updateAll(this.mContext, scheduledWork);
        this.mWorkConstraintsTracker.replace(scheduledWork);
        ArrayList arrayList = new ArrayList(scheduledWork.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (WorkSpec workSpec : scheduledWork) {
            String str = workSpec.id;
            if (currentTimeMillis >= workSpec.calculateNextRunTime() && (!workSpec.hasConstraints() || this.mWorkConstraintsTracker.areAllConstraintsMet(str))) {
                arrayList.add(workSpec);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((WorkSpec) it.next()).id;
            Intent createDelayMetIntent = CommandHandler.createDelayMetIntent(this.mContext, str2);
            Logger.get().debug(TAG, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            this.mDispatcher.postOnMainThread(new SystemAlarmDispatcher.AddRunnable(this.mDispatcher, createDelayMetIntent, this.mStartId));
        }
        this.mWorkConstraintsTracker.reset();
    }
}
