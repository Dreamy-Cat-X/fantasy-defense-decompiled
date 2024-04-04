package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbgt implements zzbmi {
    private zzeqd<zzdmi> zzexp;
    private zzeqd<Set<zzbxf<zzbrm>>> zzeyb;
    private zzeqd<zzbrl> zzeyc;
    private zzeqd<zzbti> zzeyd;
    private zzeqd<zzdmt> zzeyf;
    private zzeqd<Set<zzbxf<zzbsg>>> zzezp;
    private zzeqd<zzbsb> zzezq;
    private zzeqd<String> zzfai;
    private zzeqd<zzbqm> zzfaj;
    private zzeqd<zzbmy> zzfak;
    private final zzbml zzflp;
    private zzeqd<zzagd> zzflq;
    private zzeqd<Runnable> zzflr;
    private zzeqd<zzbmh> zzfls;
    private final /* synthetic */ zzbgr zzflt;

    private zzbgt(zzbgr zzbgrVar, zzbnp zzbnpVar, zzbml zzbmlVar) {
        zzeqd zzeqdVar;
        this.zzflt = zzbgrVar;
        this.zzflp = zzbmlVar;
        this.zzeyf = zzbnt.zzf(zzbnpVar);
        this.zzexp = zzbno.zza(zzbnpVar);
        zzepz zzbmr = zzepz.zzas(0, 2).zzax(zzbgr.zzm(this.zzflt)).zzax(zzbgr.zzl(this.zzflt)).zzbmr();
        this.zzeyb = zzbmr;
        this.zzeyc = zzepr.zzau(zzbrs.zzj(zzbmr));
        zzepz zzbmr2 = zzepz.zzas(4, 3).zzaw(zzbgr.zzh(this.zzflt)).zzaw(zzbgr.zzg(this.zzflt)).zzaw(zzbgr.zzf(this.zzflt)).zzax(zzbgr.zzak(this.zzflt)).zzax(zzbgr.zzaj(this.zzflt)).zzax(zzbgr.zzai(this.zzflt)).zzaw(zzbgr.zzc(this.zzflt)).zzbmr();
        this.zzezp = zzbmr2;
        this.zzezq = zzepr.zzau(zzbsd.zzl(zzbmr2));
        zzbnr zzd = zzbnr.zzd(zzbnpVar);
        this.zzfai = zzd;
        this.zzfaj = zzbql.zzm(this.zzexp, zzd, zzbgr.zzi(this.zzflt));
        this.zzeyd = zzepr.zzau(zzbul.zzalt());
        this.zzfak = zzbot.zza(this.zzeyf, this.zzexp, this.zzeyc, this.zzezq, zzbgr.zzal(this.zzflt), this.zzfaj, this.zzeyd);
        this.zzflq = new zzbmn(zzbmlVar);
        zzbmk zzbmkVar = new zzbmk(zzbmlVar);
        this.zzflr = zzbmkVar;
        zzeqd<zzbmy> zzeqdVar2 = this.zzfak;
        zzeqd<zzagd> zzeqdVar3 = this.zzflq;
        zzeqdVar = this.zzflt.zzexk.zzeve;
        this.zzfls = zzepr.zzau(new zzbmm(zzeqdVar2, zzeqdVar3, zzbmkVar, zzeqdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final zzblb zzahn() {
        return (zzblb) zzepw.zza(this.zzfls.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
