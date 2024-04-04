package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcbe implements zzepq<zzcaz> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzcbm> zzexs;
    private final zzeqd<zzbmy> zzfak;
    private final zzeqd<zzcbq> zzfar;
    private final zzeqd<zzcbh> zzfax;
    private final zzeqd<zzayt> zzfov;
    private final zzeqd<zzcbt> zzfte;
    private final zzeqd<zzawh> zzfuk;
    private final zzeqd<zzcbi> zzgbf;
    private final zzeqd<zzef> zzgbg;
    private final zzeqd<zzcce> zzgcd;
    private final zzeqd<zzcfh> zzgce;
    private final zzeqd<zzcff> zzgcf;
    private final zzeqd<zzcfk> zzgcg;
    private final zzeqd<zzcfb> zzgch;
    private final zzeqd<zzcfj> zzgci;
    private final zzeqd<zzcxx> zzgcj;

    private zzcbe(zzeqd<zzbmy> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzcbi> zzeqdVar3, zzeqd<zzcbq> zzeqdVar4, zzeqd<zzcce> zzeqdVar5, zzeqd<zzcbm> zzeqdVar6, zzeqd<zzcbt> zzeqdVar7, zzeqd<zzcfh> zzeqdVar8, zzeqd<zzcff> zzeqdVar9, zzeqd<zzcfk> zzeqdVar10, zzeqd<zzcfb> zzeqdVar11, zzeqd<zzcfj> zzeqdVar12, zzeqd<zzawh> zzeqdVar13, zzeqd<zzef> zzeqdVar14, zzeqd<zzayt> zzeqdVar15, zzeqd<Context> zzeqdVar16, zzeqd<zzcbh> zzeqdVar17, zzeqd<zzcxx> zzeqdVar18) {
        this.zzfak = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzgbf = zzeqdVar3;
        this.zzfar = zzeqdVar4;
        this.zzgcd = zzeqdVar5;
        this.zzexs = zzeqdVar6;
        this.zzfte = zzeqdVar7;
        this.zzgce = zzeqdVar8;
        this.zzgcf = zzeqdVar9;
        this.zzgcg = zzeqdVar10;
        this.zzgch = zzeqdVar11;
        this.zzgci = zzeqdVar12;
        this.zzfuk = zzeqdVar13;
        this.zzgbg = zzeqdVar14;
        this.zzfov = zzeqdVar15;
        this.zzeuo = zzeqdVar16;
        this.zzfax = zzeqdVar17;
        this.zzgcj = zzeqdVar18;
    }

    public static zzcbe zza(zzeqd<zzbmy> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzcbi> zzeqdVar3, zzeqd<zzcbq> zzeqdVar4, zzeqd<zzcce> zzeqdVar5, zzeqd<zzcbm> zzeqdVar6, zzeqd<zzcbt> zzeqdVar7, zzeqd<zzcfh> zzeqdVar8, zzeqd<zzcff> zzeqdVar9, zzeqd<zzcfk> zzeqdVar10, zzeqd<zzcfb> zzeqdVar11, zzeqd<zzcfj> zzeqdVar12, zzeqd<zzawh> zzeqdVar13, zzeqd<zzef> zzeqdVar14, zzeqd<zzayt> zzeqdVar15, zzeqd<Context> zzeqdVar16, zzeqd<zzcbh> zzeqdVar17, zzeqd<zzcxx> zzeqdVar18) {
        return new zzcbe(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzeqdVar6, zzeqdVar7, zzeqdVar8, zzeqdVar9, zzeqdVar10, zzeqdVar11, zzeqdVar12, zzeqdVar13, zzeqdVar14, zzeqdVar15, zzeqdVar16, zzeqdVar17, zzeqdVar18);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcaz(this.zzfak.get(), this.zzeuj.get(), this.zzgbf.get(), this.zzfar.get(), this.zzgcd.get(), this.zzexs.get(), this.zzfte.get(), zzepr.zzav(this.zzgce), zzepr.zzav(this.zzgcf), zzepr.zzav(this.zzgcg), zzepr.zzav(this.zzgch), zzepr.zzav(this.zzgci), this.zzfuk.get(), this.zzgbg.get(), this.zzfov.get(), this.zzeuo.get(), this.zzfax.get(), this.zzgcj.get());
    }
}
