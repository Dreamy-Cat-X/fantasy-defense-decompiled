package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzr extends BroadcastReceiver {
    private final /* synthetic */ zzm zzedb;

    private zzr(zzm zzmVar) {
        this.zzedb = zzmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzm.zza(this.zzedb, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzm.zza(this.zzedb, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzr(zzm zzmVar, zzo zzoVar) {
        this(zzmVar);
    }
}
