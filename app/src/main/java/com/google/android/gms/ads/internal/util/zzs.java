package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.zzayg;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzs extends BroadcastReceiver {
    private zzs(zzm zzmVar) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzayg.zzzx();
        zzb.zzak(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzs(zzm zzmVar, zzo zzoVar) {
        this(zzmVar);
    }
}
