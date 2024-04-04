package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfw implements zzdeu<zzdft> {
    private final Context context;
    private final Executor executor;
    private final zzaxs zzbpt;
    private final ScheduledExecutorService zzfpk;
    private final int zzgok;
    private final zzaxo zzhcf;

    public zzdfw(zzaxo zzaxoVar, int i, Context context, zzaxs zzaxsVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zzhcf = zzaxoVar;
        this.zzgok = i;
        this.context = context;
        this.zzbpt = zzaxsVar;
        this.zzfpk = scheduledExecutorService;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdft> zzata() {
        return zzdyu.zzg(zzdyz.zza(new zzdyk(this) { // from class: com.google.android.gms.internal.ads.zzdfv
            private final zzdfw zzhcp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhcp = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdyk
            public final zzdzl zzatn() {
                return this.zzhcp.zzatw();
            }
        }, this.executor)).zza(zzdfy.zzdyn, this.executor).zza(((Long) zzwo.zzqq().zzd(zzabh.zzcow)).longValue(), TimeUnit.MILLISECONDS, this.zzfpk).zza(Exception.class, new zzdvo(this) { // from class: com.google.android.gms.internal.ads.zzdfx
            private final zzdfw zzhcp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhcp = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj) {
                return this.zzhcp.zzb((Exception) obj);
            }
        }, zzdzn.zzbai());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdft zzb(Exception exc) {
        this.zzbpt.zza(exc, "AttestationTokenSignal");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzatw() throws Exception {
        return this.zzhcf.zzb(this.context, this.zzgok);
    }
}
