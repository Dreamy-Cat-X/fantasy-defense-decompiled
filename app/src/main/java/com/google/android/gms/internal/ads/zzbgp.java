package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbgp implements zzdhl {
    private final /* synthetic */ zzbgb zzexk;
    private zzeqd<Context> zzfkm;
    private zzeqd<String> zzfkn;
    private zzeqd<zzdjv<zzbkd, zzbki>> zzfko;
    private zzeqd<zzdht> zzfkp;
    private zzeqd<zzdhd> zzfkq;
    private zzeqd<zzdhf> zzfkr;
    private zzeqd<zzdjv<zzbkm, zzbks>> zzfks;
    private zzeqd<zzdif> zzfkt;
    private zzeqd<zzdih> zzfku;

    private zzbgp(zzbgb zzbgbVar, Context context, String str) {
        zzeqd zzeqdVar;
        zzeqd zzeqdVar2;
        zzeqd zzeqdVar3;
        zzeqd zzeqdVar4;
        zzeqd zzeqdVar5;
        zzeqd zzeqdVar6;
        zzeqd zzeqdVar7;
        zzeqd zzeqdVar8;
        zzeqd zzeqdVar9;
        zzeqd zzeqdVar10;
        zzeqd zzeqdVar11;
        zzeqd zzeqdVar12;
        this.zzexk = zzbgbVar;
        this.zzfkm = zzept.zzbb(context);
        this.zzfkn = zzept.zzbb(str);
        zzeqd<Context> zzeqdVar13 = this.zzfkm;
        zzeqdVar = this.zzexk.zzexa;
        zzeqdVar2 = this.zzexk.zzexb;
        this.zzfko = new zzdkb(zzeqdVar13, zzeqdVar, zzeqdVar2);
        zzeqdVar3 = this.zzexk.zzexa;
        this.zzfkp = zzepr.zzau(new zzdig(zzeqdVar3));
        zzeqd<Context> zzeqdVar14 = this.zzfkm;
        zzeqdVar4 = this.zzexk.zzeve;
        zzeqdVar5 = this.zzexk.zzeul;
        this.zzfkq = zzepr.zzau(new zzdhg(zzeqdVar14, zzeqdVar4, zzeqdVar5, this.zzfko, this.zzfkp, zzdnc.zzavl()));
        zzeqdVar6 = this.zzexk.zzeul;
        zzeqd<Context> zzeqdVar15 = this.zzfkm;
        zzeqd<String> zzeqdVar16 = this.zzfkn;
        zzeqd<zzdhd> zzeqdVar17 = this.zzfkq;
        zzeqd<zzdht> zzeqdVar18 = this.zzfkp;
        zzeqdVar7 = this.zzexk.zzeux;
        this.zzfkr = zzepr.zzau(new zzdhm(zzeqdVar6, zzeqdVar15, zzeqdVar16, zzeqdVar17, zzeqdVar18, zzeqdVar7));
        zzeqd<Context> zzeqdVar19 = this.zzfkm;
        zzeqdVar8 = this.zzexk.zzexa;
        zzeqdVar9 = this.zzexk.zzexb;
        this.zzfks = new zzdkc(zzeqdVar19, zzeqdVar8, zzeqdVar9);
        zzeqd<Context> zzeqdVar20 = this.zzfkm;
        zzeqdVar10 = this.zzexk.zzeve;
        zzeqdVar11 = this.zzexk.zzeul;
        this.zzfkt = zzepr.zzau(new zzdii(zzeqdVar20, zzeqdVar10, zzeqdVar11, this.zzfks, this.zzfkp, zzdnc.zzavl()));
        zzeqdVar12 = this.zzexk.zzeul;
        this.zzfku = zzepr.zzau(new zzdin(zzeqdVar12, this.zzfkm, this.zzfkn, this.zzfkt, this.zzfkp));
    }

    @Override // com.google.android.gms.internal.ads.zzdhl
    public final zzdhf zzahh() {
        return this.zzfkr.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdhl
    public final zzdih zzahi() {
        return this.zzfku.get();
    }
}
