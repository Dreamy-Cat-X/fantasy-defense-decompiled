package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfe implements Runnable {
    private final /* synthetic */ zzez zzzh;
    private final /* synthetic */ int zzzk;
    private final /* synthetic */ boolean zzzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfe(zzez zzezVar, int i, boolean z) {
        this.zzzh = zzezVar;
        this.zzzk = i;
        this.zzzl = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zza;
        zzcf.zza zzb = this.zzzh.zzb(this.zzzk, this.zzzl);
        this.zzzh.zzyy = zzb;
        zza = zzez.zza(this.zzzk, zzb);
        if (zza) {
            this.zzzh.zza(this.zzzk + 1, this.zzzl);
        }
    }
}
