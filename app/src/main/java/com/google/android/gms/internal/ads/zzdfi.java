package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfi implements zzdeu<zzdff> {
    private final Context context;
    private final Executor executor;
    private final ScheduledExecutorService zzfpk;
    private final int zzgok;
    private final zzaxo zzhcf;

    public zzdfi(zzaxo zzaxoVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i) {
        this.zzhcf = zzaxoVar;
        this.context = context;
        this.zzfpk = scheduledExecutorService;
        this.executor = executor;
        this.zzgok = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdff> zzata() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcov)).booleanValue()) {
            return zzdyu.zzg(this.zzhcf.zza(this.context, this.zzgok)).zza(zzdfh.zzdyn, this.executor).zza(((Long) zzwo.zzqq().zzd(zzabh.zzcow)).longValue(), TimeUnit.MILLISECONDS, this.zzfpk).zza(Throwable.class, new zzdvo(this) { // from class: com.google.android.gms.internal.ads.zzdfk
                private final zzdfi zzhch;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzhch = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdvo
                public final Object apply(Object obj) {
                    return this.zzhch.zzf((Throwable) obj);
                }
            }, this.executor);
        }
        return zzdyz.immediateFailedFuture(new Exception("Did not ad Ad ID into query param."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdff zzf(Throwable th) {
        zzwo.zzqm();
        return new zzdff(null, zzayd.zzbn(this.context));
    }
}
