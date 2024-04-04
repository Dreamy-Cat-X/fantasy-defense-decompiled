package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbhb implements zzdkn {
    private final /* synthetic */ zzbgb zzexk;
    private zzeqd<Context> zzfkm;
    private zzeqd<String> zzfkn;
    private zzeqd<zzvp> zzfmj;
    private zzeqd<zzcxf> zzfmk;
    private zzeqd<zzdkp> zzfnf;
    private zzeqd<zzdkf> zzfng;
    private zzeqd<zzcya> zzfnh;

    private zzbhb(zzbgb zzbgbVar, Context context, String str, zzvp zzvpVar) {
        zzeqd zzeqdVar;
        zzeqd zzeqdVar2;
        zzeqd zzeqdVar3;
        zzeqd zzeqdVar4;
        this.zzexk = zzbgbVar;
        this.zzfkm = zzept.zzbb(context);
        this.zzfmj = zzept.zzbb(zzvpVar);
        this.zzfkn = zzept.zzbb(str);
        zzeqdVar = this.zzexk.zzevd;
        this.zzfmk = zzepr.zzau(zzcxu.zzak(zzeqdVar));
        zzeqdVar2 = this.zzexk.zzexa;
        this.zzfnf = zzepr.zzau(zzdlm.zzas(zzeqdVar2));
        zzeqd<Context> zzeqdVar5 = this.zzfkm;
        zzeqdVar3 = this.zzexk.zzeve;
        zzeqdVar4 = this.zzexk.zzeul;
        zzeqd<zzdkf> zzau = zzepr.zzau(new zzdko(zzeqdVar5, zzeqdVar3, zzeqdVar4, this.zzfmk, this.zzfnf, zzdnc.zzavl()));
        this.zzfng = zzau;
        this.zzfnh = zzepr.zzau(new zzcyc(this.zzfkm, this.zzfmj, this.zzfkn, zzau, this.zzfmk, this.zzfnf));
    }

    @Override // com.google.android.gms.internal.ads.zzdkn
    public final zzcya zzahy() {
        return this.zzfnh.get();
    }
}
