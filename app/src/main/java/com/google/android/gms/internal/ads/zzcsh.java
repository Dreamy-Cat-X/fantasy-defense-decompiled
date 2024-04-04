package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsh implements zzcqq<zzblb> {
    private final ScheduledExecutorService zzfpk;
    private final zzbqu zzfyz;
    private final zzdzk zzgfs;
    private final zzblx zzgsk;
    private final zzcrn zzgsl;

    public zzcsh(zzblx zzblxVar, zzcrn zzcrnVar, zzbqu zzbquVar, ScheduledExecutorService scheduledExecutorService, zzdzk zzdzkVar) {
        this.zzgsk = zzblxVar;
        this.zzgsl = zzcrnVar;
        this.zzfyz = zzbquVar;
        this.zzfpk = scheduledExecutorService;
        this.zzgfs = zzdzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return zzdmtVar.zzhiy.zzfve.zzavd() != null && this.zzgsl.zza(zzdmtVar, zzdmiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<zzblb> zzb(final zzdmt zzdmtVar, final zzdmi zzdmiVar) {
        return this.zzgfs.submit(new Callable(this, zzdmtVar, zzdmiVar) { // from class: com.google.android.gms.internal.ads.zzcsg
            private final zzdmi zzfti;
            private final zzdmt zzggd;
            private final zzcsh zzgsj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsj = this;
                this.zzggd = zzdmtVar;
                this.zzfti = zzdmiVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgsj.zzc(this.zzggd, this.zzfti);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzblb zzc(final zzdmt zzdmtVar, final zzdmi zzdmiVar) throws Exception {
        return this.zzgsk.zza(new zzbnp(zzdmtVar, zzdmiVar, null), new zzbml(zzdmtVar.zzhiy.zzfve.zzavd(), new Runnable(this, zzdmtVar, zzdmiVar) { // from class: com.google.android.gms.internal.ads.zzcsj
            private final zzdmi zzfti;
            private final zzdmt zzggd;
            private final zzcsh zzgsj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsj = this;
                this.zzggd = zzdmtVar;
                this.zzfti = zzdmiVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgsj.zzd(this.zzggd, this.zzfti);
            }
        })).zzahn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        zzdyz.zza(zzdyz.zza(this.zzgsl.zzb(zzdmtVar, zzdmiVar), zzdmiVar.zzhid, TimeUnit.SECONDS, this.zzfpk), new zzcsi(this), this.zzgfs);
    }
}
