package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcme {
    private final ScheduledExecutorService zzfpk;
    private final zzdzk zzgfs;
    private final zzepk<zzcns> zzgmb;
    private final zzcmu zzgml;

    public zzcme(ScheduledExecutorService scheduledExecutorService, zzdzk zzdzkVar, zzcmu zzcmuVar, zzepk<zzcns> zzepkVar) {
        this.zzfpk = scheduledExecutorService;
        this.zzgfs = zzdzkVar;
        this.zzgml = zzcmuVar;
        this.zzgmb = zzepkVar;
    }

    public final zzdzl<InputStream> zzg(final zzasu zzasuVar) {
        zzdzl<InputStream> zzj;
        String str = zzasuVar.packageName;
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (com.google.android.gms.ads.internal.util.zzm.zzek(str)) {
            zzj = zzdyz.immediateFailedFuture(new zzcnj(zzdnu.INTERNAL_ERROR));
        } else {
            zzj = this.zzgml.zzj(zzasuVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zzdyu.zzg(zzj).zza(((Integer) zzwo.zzqq().zzd(zzabh.zzcvq)).intValue(), TimeUnit.SECONDS, this.zzfpk).zza(Throwable.class, new zzdyj(this, zzasuVar, callingUid) { // from class: com.google.android.gms.internal.ads.zzcmh
            private final int zzedl;
            private final zzasu zzgly;
            private final zzcme zzgmm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmm = this;
                this.zzgly = zzasuVar;
                this.zzedl = callingUid;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgmm.zza(this.zzgly, this.zzedl, (Throwable) obj);
            }
        }, this.zzgfs);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzasu zzasuVar, int i, Throwable th) throws Exception {
        return this.zzgmb.get().zzd(zzasuVar, i);
    }
}
