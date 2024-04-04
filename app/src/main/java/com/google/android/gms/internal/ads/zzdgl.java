package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgl implements zzdeu<zzdgm> {
    List<String> zzdst;
    private zzdzk zzgfs;
    zzaat zzhcy;

    public zzdgl(zzaat zzaatVar, zzdzk zzdzkVar, List<String> list) {
        this.zzhcy = zzaatVar;
        this.zzgfs = zzdzkVar;
        this.zzdst = list;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdgm> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdgo
            private final zzdgl zzhda;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhda = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdgl zzdglVar = this.zzhda;
                return new zzdgm(zzdglVar.zzhcy.zzf(zzdglVar.zzdst));
            }
        });
    }
}
