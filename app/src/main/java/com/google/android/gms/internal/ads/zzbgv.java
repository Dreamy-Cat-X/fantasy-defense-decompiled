package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbgv implements zzdiw {
    private final /* synthetic */ zzbgb zzexk;
    private zzeqd<Context> zzfkm;
    private final Context zzfkv;
    private final String zzfkw;
    private final zzvp zzfmi;
    private zzeqd<zzvp> zzfmj;
    private zzeqd<zzcxf> zzfmk;
    private zzeqd<zzcxz> zzfml;
    private zzeqd<zzdiq> zzfmm;

    private zzbgv(zzbgb zzbgbVar, Context context, String str, zzvp zzvpVar) {
        zzeqd zzeqdVar;
        zzeqd zzeqdVar2;
        zzeqd zzeqdVar3;
        this.zzexk = zzbgbVar;
        this.zzfkv = context;
        this.zzfmi = zzvpVar;
        this.zzfkw = str;
        this.zzfkm = zzept.zzbb(context);
        this.zzfmj = zzept.zzbb(zzvpVar);
        zzeqdVar = this.zzexk.zzevd;
        this.zzfmk = zzepr.zzau(zzcxu.zzak(zzeqdVar));
        this.zzfml = zzepr.zzau(zzcxy.zzasn());
        zzeqd<Context> zzeqdVar4 = this.zzfkm;
        zzeqdVar2 = this.zzexk.zzeve;
        zzeqd<zzvp> zzeqdVar5 = this.zzfmj;
        zzeqdVar3 = this.zzexk.zzeul;
        this.zzfmm = zzepr.zzau(new zzdit(zzeqdVar4, zzeqdVar2, zzeqdVar5, zzeqdVar3, this.zzfmk, this.zzfml, zzdnc.zzavl()));
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final zzcxd zzahs() {
        return new zzcxd(this.zzfkv, this.zzfmi, this.zzfkw, this.zzfmm.get(), this.zzfmk.get());
    }
}
