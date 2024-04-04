package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzex extends BroadcastReceiver {
    private boolean zzyn = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzex(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzcb() {
        return this.zzyn;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.zzyn = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.zzyn = false;
        }
    }
}
