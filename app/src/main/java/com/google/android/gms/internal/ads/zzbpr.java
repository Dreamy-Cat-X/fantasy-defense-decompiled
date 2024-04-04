package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpr implements zzbqr, zzbrf, zzbuv, zzbwu {
    private final Executor executor;
    private final zzbri zzfwh;
    private final zzdmi zzfwi;
    private final ScheduledExecutorService zzfwj;
    private zzdzt<Boolean> zzfwk = zzdzt.zzbaj();
    private ScheduledFuture<?> zzfwl;

    public zzbpr(zzbri zzbriVar, zzdmi zzdmiVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zzfwh = zzbriVar;
        this.zzfwi = zzdmiVar;
        this.zzfwj = scheduledExecutorService;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzalc() {
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzald() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzb(zzato zzatoVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdOpened() {
        if (this.zzfwi.zzhif == 0 || this.zzfwi.zzhif == 1) {
            this.zzfwh.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzala() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqm)).booleanValue() && this.zzfwi.zzhif == 2) {
            if (this.zzfwi.zzhhr == 0) {
                this.zzfwh.onAdImpression();
            } else {
                zzdyz.zza(this.zzfwk, new zzbpt(this), this.executor);
                this.zzfwl = this.zzfwj.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbpq
                    private final zzbpr zzfwg;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfwg = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzfwg.zzale();
                    }
                }, this.zzfwi.zzhhr, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final synchronized void zzk(zzvc zzvcVar) {
        if (this.zzfwk.isDone()) {
            return;
        }
        if (this.zzfwl != null) {
            this.zzfwl.cancel(true);
        }
        this.zzfwk.setException(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final synchronized void zzalb() {
        if (this.zzfwk.isDone()) {
            return;
        }
        if (this.zzfwl != null) {
            this.zzfwl.cancel(true);
        }
        this.zzfwk.set(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzale() {
        synchronized (this) {
            if (this.zzfwk.isDone()) {
                return;
            }
            this.zzfwk.set(true);
        }
    }
}
