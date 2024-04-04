package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* loaded from: D:\decomp\classes.dex */
public class BatteryNotLowTracker extends BroadcastReceiverConstraintTracker<Boolean> {
    static final float BATTERY_LOW_PERCENTAGE = 0.15f;
    static final int BATTERY_PLUGGED_NONE = 0;
    private static final String TAG = Logger.tagWithPrefix("BatteryNotLowTracker");

    public BatteryNotLowTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Boolean getInitialState() {
        Intent registerReceiver = this.mAppContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            Logger.get().error(TAG, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf(registerReceiver.getIntExtra("plugged", 0) != 0 || registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        Logger.get().debug(TAG, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        char c = 65535;
        int hashCode = action.hashCode();
        if (hashCode != -1980154005) {
            if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                c = 1;
            }
        } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c = 0;
        }
        if (c == 0) {
            setState(true);
        } else {
            if (c != 1) {
                return;
            }
            setState(false);
        }
    }
}
