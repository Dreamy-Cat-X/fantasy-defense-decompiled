package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdar implements zzdeu<zzdas> {
    private final zzayt zzdsc;
    private final zzdmx zzfve;
    private final zzdzk zzgfs;

    public zzdar(zzdzk zzdzkVar, zzdmx zzdmxVar, zzayt zzaytVar) {
        this.zzgfs = zzdzkVar;
        this.zzfve = zzdmxVar;
        this.zzdsc = zzaytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdas> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdau
            private final zzdar zzgzj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzj = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgzj.zzatd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdas zzatd() throws Exception {
        return new zzdas(this.zzfve.zzhjh, this.zzdsc);
    }
}
