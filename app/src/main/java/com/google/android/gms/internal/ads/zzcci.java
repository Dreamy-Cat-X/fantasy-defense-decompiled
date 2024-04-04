package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcci implements zzepq<zzcce> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzcbm> zzexs;
    private final zzeqd<zzccm> zzfau;
    private final zzeqd<zzccu> zzfav;
    private final zzeqd<zzcbh> zzfax;
    private final zzeqd<com.google.android.gms.ads.internal.util.zzf> zzfco;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzcbi> zzgbf;

    private zzcci(zzeqd<com.google.android.gms.ads.internal.util.zzf> zzeqdVar, zzeqd<zzdmx> zzeqdVar2, zzeqd<zzcbm> zzeqdVar3, zzeqd<zzcbi> zzeqdVar4, zzeqd<zzccm> zzeqdVar5, zzeqd<zzccu> zzeqdVar6, zzeqd<Executor> zzeqdVar7, zzeqd<Executor> zzeqdVar8, zzeqd<zzcbh> zzeqdVar9) {
        this.zzfco = zzeqdVar;
        this.zzftm = zzeqdVar2;
        this.zzexs = zzeqdVar3;
        this.zzgbf = zzeqdVar4;
        this.zzfau = zzeqdVar5;
        this.zzfav = zzeqdVar6;
        this.zzftf = zzeqdVar7;
        this.zzeuj = zzeqdVar8;
        this.zzfax = zzeqdVar9;
    }

    public static zzcci zza(zzeqd<com.google.android.gms.ads.internal.util.zzf> zzeqdVar, zzeqd<zzdmx> zzeqdVar2, zzeqd<zzcbm> zzeqdVar3, zzeqd<zzcbi> zzeqdVar4, zzeqd<zzccm> zzeqdVar5, zzeqd<zzccu> zzeqdVar6, zzeqd<Executor> zzeqdVar7, zzeqd<Executor> zzeqdVar8, zzeqd<zzcbh> zzeqdVar9) {
        return new zzcci(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzeqdVar6, zzeqdVar7, zzeqdVar8, zzeqdVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcce(this.zzfco.get(), this.zzftm.get(), this.zzexs.get(), this.zzgbf.get(), this.zzfau.get(), this.zzfav.get(), this.zzftf.get(), this.zzeuj.get(), this.zzfax.get());
    }
}
