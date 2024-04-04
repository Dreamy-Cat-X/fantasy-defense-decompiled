package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqt extends BroadcastReceiver {
    private final /* synthetic */ zzqr zzbri;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqt(zzqr zzqrVar) {
        this.zzbri = zzqrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzbri.zzbr(3);
    }
}
