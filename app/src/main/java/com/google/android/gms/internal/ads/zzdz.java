package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdz implements Runnable {
    private final /* synthetic */ Context zzxi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdz(zzdx zzdxVar, Context context) {
        this.zzxi = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdsn zzdsnVar;
        zzdp zzdpVar;
        try {
            zzdpVar = zzdx.zzwe;
            zzdpVar.zzb(this.zzxi);
        } catch (Exception e) {
            zzdsnVar = zzdx.zzwg;
            zzdsnVar.zza(2019, -1L, e);
        }
    }
}
