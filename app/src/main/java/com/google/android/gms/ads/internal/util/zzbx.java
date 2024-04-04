package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbx extends BroadcastReceiver {
    private final /* synthetic */ zzby zzefe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbx(zzby zzbyVar) {
        this.zzefe = zzbyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzefe.zzc(context, intent);
    }
}
