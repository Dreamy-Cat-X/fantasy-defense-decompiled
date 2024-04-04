package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbhd implements zzdma {
    private final /* synthetic */ zzbgb zzexk;
    private zzeqd<Context> zzfkm;
    private zzeqd<String> zzfkn;
    private zzeqd<zzdkp> zzfnf;
    private zzeqd<zzdjv<zzcgn, zzcgg>> zzfni;
    private zzeqd<zzdmw> zzfnj;
    private zzeqd<zzdlo> zzfnk;
    private zzeqd<zzdmc> zzfnl;
    private zzeqd<zzdlw> zzfnm;

    private zzbhd(zzbgb zzbgbVar, Context context, String str) {
        zzeqd zzeqdVar;
        zzeqd zzeqdVar2;
        zzeqd zzeqdVar3;
        zzeqd zzeqdVar4;
        zzeqd zzeqdVar5;
        this.zzexk = zzbgbVar;
        zzepq zzbb = zzept.zzbb(context);
        this.zzfkm = zzbb;
        zzeqdVar = this.zzexk.zzexa;
        zzeqdVar2 = this.zzexk.zzexb;
        this.zzfni = new zzdke(zzbb, zzeqdVar, zzeqdVar2);
        zzeqdVar3 = this.zzexk.zzexa;
        this.zzfnf = zzepr.zzau(zzdlm.zzas(zzeqdVar3));
        this.zzfnj = zzepr.zzau(zzdmv.zzavc());
        zzeqd<Context> zzeqdVar6 = this.zzfkm;
        zzeqdVar4 = this.zzexk.zzeve;
        zzeqdVar5 = this.zzexk.zzeul;
        zzeqd<zzdlo> zzau = zzepr.zzau(new zzdlt(zzeqdVar6, zzeqdVar4, zzeqdVar5, this.zzfni, this.zzfnf, zzdnc.zzavl(), this.zzfnj));
        this.zzfnk = zzau;
        this.zzfnl = zzepr.zzau(new zzdmd(zzau, this.zzfnf, this.zzfnj));
        zzepq zzbc = zzept.zzbc(str);
        this.zzfkn = zzbc;
        this.zzfnm = zzepr.zzau(new zzdlx(zzbc, this.zzfnk, this.zzfkm, this.zzfnf, this.zzfnj));
    }

    @Override // com.google.android.gms.internal.ads.zzdma
    public final zzdmc zzaia() {
        return this.zzfnl.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdma
    public final zzdlw zzaib() {
        return this.zzfnm.get();
    }
}
