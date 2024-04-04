package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddk implements zzepq<zzddh> {
    private final zzeqd<PackageInfo> zzfwy;
    private final zzeqd<ApplicationInfo> zzgmi;

    private zzddk(zzeqd<ApplicationInfo> zzeqdVar, zzeqd<PackageInfo> zzeqdVar2) {
        this.zzgmi = zzeqdVar;
        this.zzfwy = zzeqdVar2;
    }

    public static zzddk zzax(zzeqd<ApplicationInfo> zzeqdVar, zzeqd<PackageInfo> zzeqdVar2) {
        return new zzddk(zzeqdVar, zzeqdVar2);
    }

    public static zzddh zza(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new zzddh(applicationInfo, packageInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzgmi.get(), this.zzfwy.get());
    }
}
