package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddc implements zzepq<zzdcv> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<com.google.android.gms.ads.internal.util.zzf> zzfco;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<PackageInfo> zzfwy;

    public zzddc(zzeqd<zzdzk> zzeqdVar, zzeqd<zzdmx> zzeqdVar2, zzeqd<PackageInfo> zzeqdVar3, zzeqd<com.google.android.gms.ads.internal.util.zzf> zzeqdVar4) {
        this.zzeuj = zzeqdVar;
        this.zzftm = zzeqdVar2;
        this.zzfwy = zzeqdVar3;
        this.zzfco = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdcv(this.zzeuj.get(), this.zzftm.get(), this.zzfwy.get(), this.zzfco.get());
    }
}
