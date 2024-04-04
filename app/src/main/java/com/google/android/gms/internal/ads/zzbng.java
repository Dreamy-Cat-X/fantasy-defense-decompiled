package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbng {
    private final Executor executor;
    private volatile boolean zzafa = true;
    private final ScheduledExecutorService zzfpk;
    private final zzdzl<zzbnf> zzfut;

    public zzbng(Executor executor, ScheduledExecutorService scheduledExecutorService, zzdzl<zzbnf> zzdzlVar) {
        this.executor = executor;
        this.zzfpk = scheduledExecutorService;
        this.zzfut = zzdzlVar;
    }

    public final void zza(zzdza<zzbmz> zzdzaVar) {
        zzdyz.zza(this.zzfut, new zzbnn(this, zzdzaVar), this.executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(List<? extends zzdzl<? extends zzbmz>> list, final zzdza<zzbmz> zzdzaVar) {
        if (list == null || list.isEmpty()) {
            this.executor.execute(new Runnable(zzdzaVar) { // from class: com.google.android.gms.internal.ads.zzbnj
                private final zzdza zzfuu;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfuu = zzdzaVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzfuu.zzb(new zzcli(zzdnu.NO_FILL));
                }
            });
            return;
        }
        zzdzl zzag = zzdyz.zzag(null);
        for (final zzdzl<? extends zzbmz> zzdzlVar : list) {
            zzag = zzdyz.zzb(zzdyz.zzb(zzag, Throwable.class, new zzdyj(zzdzaVar) { // from class: com.google.android.gms.internal.ads.zzbni
                private final zzdza zzfuu;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfuu = zzdzaVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdyj
                public final zzdzl zzf(Object obj) {
                    this.zzfuu.zzb((Throwable) obj);
                    return zzdyz.zzag(null);
                }
            }, this.executor), new zzdyj(this, zzdzaVar, zzdzlVar) { // from class: com.google.android.gms.internal.ads.zzbnl
                private final zzbng zzfuv;
                private final zzdza zzfuw;
                private final zzdzl zzfux;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfuv = this;
                    this.zzfuw = zzdzaVar;
                    this.zzfux = zzdzlVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdyj
                public final zzdzl zzf(Object obj) {
                    return this.zzfuv.zza(this.zzfuw, this.zzfux, (zzbmz) obj);
                }
            }, this.executor);
        }
        zzdyz.zza(zzag, new zzbnm(this, zzdzaVar), this.executor);
    }

    public final boolean isLoading() {
        return this.zzafa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzakr() {
        zzayv.zzegm.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbnk
            private final zzbng zzfuv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfuv = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfuv.zzaks();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaks() {
        this.zzafa = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzdza zzdzaVar, zzdzl zzdzlVar, zzbmz zzbmzVar) throws Exception {
        if (zzbmzVar != null) {
            zzdzaVar.onSuccess(zzbmzVar);
        }
        return zzdyz.zza(zzdzlVar, zzadn.zzddz.get().longValue(), TimeUnit.MILLISECONDS, this.zzfpk);
    }
}
