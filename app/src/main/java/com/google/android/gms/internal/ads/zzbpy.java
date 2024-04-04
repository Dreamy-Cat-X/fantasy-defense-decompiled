package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpy implements zzepq<zzbpw> {
    private final zzeqd<com.google.android.gms.ads.internal.util.zzf> zzfco;
    private final zzeqd<zzdet<Bundle>> zzfev;
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<zzdqy> zzftq;
    private final zzeqd<ApplicationInfo> zzfwv;
    private final zzeqd<String> zzfww;
    private final zzeqd<List<String>> zzfwx;
    private final zzeqd<PackageInfo> zzfwy;
    private final zzeqd<zzdzl<String>> zzfwz;
    private final zzeqd<String> zzfxa;

    private zzbpy(zzeqd<zzdqy> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<ApplicationInfo> zzeqdVar3, zzeqd<String> zzeqdVar4, zzeqd<List<String>> zzeqdVar5, zzeqd<PackageInfo> zzeqdVar6, zzeqd<zzdzl<String>> zzeqdVar7, zzeqd<com.google.android.gms.ads.internal.util.zzf> zzeqdVar8, zzeqd<String> zzeqdVar9, zzeqd<zzdet<Bundle>> zzeqdVar10) {
        this.zzftq = zzeqdVar;
        this.zzfrk = zzeqdVar2;
        this.zzfwv = zzeqdVar3;
        this.zzfww = zzeqdVar4;
        this.zzfwx = zzeqdVar5;
        this.zzfwy = zzeqdVar6;
        this.zzfwz = zzeqdVar7;
        this.zzfco = zzeqdVar8;
        this.zzfxa = zzeqdVar9;
        this.zzfev = zzeqdVar10;
    }

    public static zzbpy zza(zzeqd<zzdqy> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<ApplicationInfo> zzeqdVar3, zzeqd<String> zzeqdVar4, zzeqd<List<String>> zzeqdVar5, zzeqd<PackageInfo> zzeqdVar6, zzeqd<zzdzl<String>> zzeqdVar7, zzeqd<com.google.android.gms.ads.internal.util.zzf> zzeqdVar8, zzeqd<String> zzeqdVar9, zzeqd<zzdet<Bundle>> zzeqdVar10) {
        return new zzbpy(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzeqdVar6, zzeqdVar7, zzeqdVar8, zzeqdVar9, zzeqdVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbpw(this.zzftq.get(), this.zzfrk.get(), this.zzfwv.get(), this.zzfww.get(), this.zzfwx.get(), this.zzfwy.get(), zzepr.zzav(this.zzfwz), this.zzfco.get(), this.zzfxa.get(), this.zzfev.get());
    }
}
