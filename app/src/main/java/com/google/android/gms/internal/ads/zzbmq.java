package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbmq implements zzbsg, zzqv {
    private final zzdmi zzfpm;
    private final zzbri zzfua;
    private final zzbsk zzfub;
    private final AtomicBoolean zzfuc = new AtomicBoolean();
    private final AtomicBoolean zzfud = new AtomicBoolean();

    public zzbmq(zzdmi zzdmiVar, zzbri zzbriVar, zzbsk zzbskVar) {
        this.zzfpm = zzdmiVar;
        this.zzfua = zzbriVar;
        this.zzfub = zzbskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final synchronized void onAdLoaded() {
        if (this.zzfpm.zzhhm != 1) {
            zzakl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zza(zzqw zzqwVar) {
        if (this.zzfpm.zzhhm == 1 && zzqwVar.zzbqz) {
            zzakl();
        }
        if (zzqwVar.zzbqz && this.zzfud.compareAndSet(false, true)) {
            this.zzfub.zzalo();
        }
    }

    private final void zzakl() {
        if (this.zzfuc.compareAndSet(false, true)) {
            this.zzfua.onAdImpression();
        }
    }
}
