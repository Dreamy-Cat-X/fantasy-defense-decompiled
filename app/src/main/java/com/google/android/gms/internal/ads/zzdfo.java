package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfo implements zzdeu<zzdfl> {
    private final Executor executor;
    private final PackageInfo zzdsj;
    private final int zzgok;
    private final zzaxo zzhcf;
    private final String zzhcj;

    public zzdfo(zzaxo zzaxoVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zzhcf = zzaxoVar;
        this.executor = executor;
        this.zzhcj = str;
        this.zzdsj = packageInfo;
        this.zzgok = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdfl> zzata() {
        return zzdyz.zzb(zzdyz.zzb(this.zzhcf.zza(this.zzhcj, this.zzdsj, this.zzgok), zzdfn.zzdyn, this.executor), Throwable.class, new zzdyj(this) { // from class: com.google.android.gms.internal.ads.zzdfq
            private final zzdfo zzhcl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhcl = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzhcl.zzg((Throwable) obj);
            }
        }, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzg(Throwable th) throws Exception {
        return zzdyz.zzag(new zzdfl(this.zzhcj));
    }
}
