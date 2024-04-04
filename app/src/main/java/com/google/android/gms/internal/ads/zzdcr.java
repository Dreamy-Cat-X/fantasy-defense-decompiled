package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdcr implements zzdeu<zzdcs> {
    private final zzdmg zzfph;
    private final zzdzk zzgfs;

    public zzdcr(zzdzk zzdzkVar, zzdmg zzdmgVar) {
        this.zzgfs = zzdzkVar;
        this.zzfph = zzdmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdcs> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdcu
            private final zzdcr zzham;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzham = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzham.zzatj();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdcs zzatj() throws Exception {
        return new zzdcs(this.zzfph);
    }
}
