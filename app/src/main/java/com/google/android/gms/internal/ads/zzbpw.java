package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpw {
    private final String packageName;
    private final zzayt zzbos;
    private final PackageInfo zzdsj;
    private final List<String> zzdst;
    private final String zzdvo;
    private final zzdqy zzfvf;
    private final ApplicationInfo zzfwr;
    private final zzepk<zzdzl<String>> zzfws;
    private final zzdet<Bundle> zzfwt;

    public zzbpw(zzdqy zzdqyVar, zzayt zzaytVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, zzepk<zzdzl<String>> zzepkVar, com.google.android.gms.ads.internal.util.zzf zzfVar, String str2, zzdet<Bundle> zzdetVar) {
        this.zzfvf = zzdqyVar;
        this.zzbos = zzaytVar;
        this.zzfwr = applicationInfo;
        this.packageName = str;
        this.zzdst = list;
        this.zzdsj = packageInfo;
        this.zzfws = zzepkVar;
        this.zzdvo = str2;
        this.zzfwt = zzdetVar;
    }

    public final zzdzl<Bundle> zzalf() {
        return this.zzfvf.zzt(zzdqz.SIGNALS).zze(this.zzfwt.zzs(new Bundle())).zzaxm();
    }

    public final zzdzl<zzasu> zzalg() {
        final zzdzl<Bundle> zzalf = zzalf();
        return this.zzfvf.zza((zzdqy) zzdqz.REQUEST_PARCEL, zzalf, this.zzfws.get()).zzb(new Callable(this, zzalf) { // from class: com.google.android.gms.internal.ads.zzbpz
            private final zzbpw zzfxb;
            private final zzdzl zzfxc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxb = this;
                this.zzfxc = zzalf;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzfxb.zzc(this.zzfxc);
            }
        }).zzaxm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzasu zzc(zzdzl zzdzlVar) throws Exception {
        return new zzasu((Bundle) zzdzlVar.get(), this.zzbos, this.zzfwr, this.packageName, this.zzdst, this.zzdsj, this.zzfws.get().get(), this.zzdvo, null, null);
    }
}
