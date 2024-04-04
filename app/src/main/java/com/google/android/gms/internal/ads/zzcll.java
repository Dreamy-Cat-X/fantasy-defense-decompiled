package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcll {
    private final zzdzk zzgfs;
    private final zzdzk zzglz;
    private final zzcmq zzgma;
    private final zzepk<zzcns> zzgmb;

    public zzcll(zzdzk zzdzkVar, zzdzk zzdzkVar2, zzcmq zzcmqVar, zzepk<zzcns> zzepkVar) {
        this.zzglz = zzdzkVar;
        this.zzgfs = zzdzkVar2;
        this.zzgma = zzcmqVar;
        this.zzgmb = zzepkVar;
    }

    public final zzdzl<InputStream> zze(final zzasu zzasuVar) {
        zzdzl zzb;
        String str = zzasuVar.packageName;
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (com.google.android.gms.ads.internal.util.zzm.zzek(str)) {
            zzb = zzdyz.immediateFailedFuture(new zzcnj(zzdnu.INTERNAL_ERROR));
        } else {
            zzb = zzdyz.zzb(this.zzglz.submit(new Callable(this, zzasuVar) { // from class: com.google.android.gms.internal.ads.zzclk
                private final zzcll zzglx;
                private final zzasu zzgly;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzglx = this;
                    this.zzgly = zzasuVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzglx.zzf(this.zzgly);
                }
            }), ExecutionException.class, zzcln.zzbon, this.zzgfs);
        }
        final int callingUid = Binder.getCallingUid();
        return zzdyz.zzb(zzb, zzcnj.class, new zzdyj(this, zzasuVar, callingUid) { // from class: com.google.android.gms.internal.ads.zzclm
            private final int zzedl;
            private final zzcll zzglx;
            private final zzasu zzgly;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglx = this;
                this.zzgly = zzasuVar;
                this.zzedl = callingUid;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzglx.zza(this.zzgly, this.zzedl, (zzcnj) obj);
            }
        }, this.zzgfs);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzasu zzasuVar, int i, zzcnj zzcnjVar) throws Exception {
        return this.zzgmb.get().zzb(zzasuVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzf(zzasu zzasuVar) throws Exception {
        return this.zzgma.zzi(zzasuVar).get(((Integer) zzwo.zzqq().zzd(zzabh.zzcvq)).intValue(), TimeUnit.SECONDS);
    }
}
