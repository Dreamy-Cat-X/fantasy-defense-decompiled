package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbgb extends zzbff {
    private zzeqd<zzbff> zzeul;
    private final zzbfh zzeur;
    private zzeqd<String> zzeus;
    private zzeqd<zzayq> zzeut;
    private zzeqd<zzdrk> zzeuu;
    private zzeqd<zzdrl> zzeuv;
    private zzeqd<Context> zzeuw;
    private zzeqd<zzayt> zzeux;
    private zzeqd<zzdrw> zzeuy;
    private zzeqd<zzdru> zzeuz;
    private zzeqd<zzdsd> zzeva;
    private zzeqd<ThreadFactory> zzevb;
    private zzeqd<ScheduledExecutorService> zzevc;
    private zzeqd<zzdro> zzevd;
    private zzeqd<Executor> zzeve;
    private zzeqd<zzdzk> zzevf;
    private zzeqd<Clock> zzevg;
    private zzeqd<zzcht> zzevh;
    private zzeqd<zzchu> zzevi;
    private zzeqd<zzcqv<zzdno, zzcsn>> zzevj;
    private zzeqd<zzcwq> zzevk;
    private zzeqd<WeakReference<Context>> zzevl;
    private zzeqd<String> zzevm;
    private zzeqd<zzckd> zzevn;
    private zzeqd<zzckh> zzevo;
    private zzeqd<zzcoq> zzevp;
    private zzeqd<Set<zzbxf<zzbwq>>> zzevq;
    private zzeqd<Set<zzbxf<zzbwq>>> zzevr;
    private zzeqd<zzbwl> zzevs;
    private zzeqd<zzckx> zzevt;
    private zzeqd<zzawg> zzevu;
    private zzeqd<zzchw> zzevv;
    private zzeqd<zzbho> zzevw;
    private zzeqd<zzef> zzevx;
    private zzeqd<com.google.android.gms.ads.internal.zzb> zzevy;
    private zzeqd<zzcpy> zzevz;
    private zzeqd<zzdsh> zzewa;
    private zzeqd<zzcju> zzewb;
    private zzeqd<zzcfy> zzewc;
    private zzeqd<zzdnr<zzcfp>> zzewd;
    private zzeqd<zzcyv> zzewe;
    private zzeqd<zzcqi> zzewf;
    private zzeqd<zzaxs> zzewg;
    private zzeqd zzewh;
    private zzeqd<zzdod> zzewi;
    private zzeqd<zzckj> zzewj;
    private zzeqd<zzdzk> zzewk;
    private zzeqd zzewl;
    private zzeqd<zzdbo<zzdex>> zzewm;
    private zzeqd<zzdbi> zzewn;
    private zzeqd<zzdbo<zzdbf>> zzewo;
    private zzeqd<zzdmg> zzewp;
    private zzeqd<zzdnk> zzewq;
    private zzeqd<zzcqv<zzdno, zzcsk>> zzewr;
    private zzeqd<zzbij> zzews;
    private zzeqd<zzati> zzewt;
    private zzeqd<HashMap<String, zzcoh>> zzewu;
    private zzeqd<zzard> zzewv;
    private zzeqd<zzaly> zzeww;
    private zzeqd<zzacn> zzewx;
    private zzeqd<zzawf> zzewy;
    private zzeqd<zzbsx> zzewz;
    private zzeqd<zzdok> zzexa;
    private zzeqd<zzdpf> zzexb;
    private zzeqd<zzdtb> zzexc;

    private zzbgb(zzbfh zzbfhVar, zzbhj zzbhjVar, zzdrj zzdrjVar, zzbhs zzbhsVar, zzdnx zzdnxVar) {
        zzbhw zzbhwVar;
        zzbfv zzbfvVar;
        this.zzeur = zzbfhVar;
        zzeqd<String> zzau = zzepr.zzau(new zzbfs(zzbfhVar));
        this.zzeus = zzau;
        this.zzeut = zzeqa.zzau(new zzbhx(zzau));
        zzdrm zzdrmVar = new zzdrm(zzdpy.zzawz(), this.zzeut);
        this.zzeuu = zzdrmVar;
        this.zzeuv = zzepr.zzau(zzdrmVar);
        this.zzeuw = new zzbfk(zzbfhVar);
        zzbfr zzbfrVar = new zzbfr(zzbfhVar);
        this.zzeux = zzbfrVar;
        this.zzeuy = new zzdrz(this.zzeuw, zzbfrVar);
        this.zzeuz = zzepr.zzau(new zzdrx(this.zzeuv, zzdsb.zzaxq(), this.zzeuy));
        this.zzeva = new zzdsc(zzdsb.zzaxq(), this.zzeuy);
        zzeqd<ThreadFactory> zzau2 = zzepr.zzau(zzdqh.zzaxi());
        this.zzevb = zzau2;
        zzeqd<ScheduledExecutorService> zzau3 = zzepr.zzau(new zzdqe(zzau2));
        this.zzevc = zzau3;
        this.zzevd = zzepr.zzau(new zzdrr(this.zzeuz, this.zzeva, zzau3));
        this.zzeve = zzepr.zzau(zzdps.zzawu());
        this.zzevf = zzepr.zzau(zzdpu.zzawv());
        this.zzevg = zzepr.zzau(new zzdnw(zzdnxVar));
        zzeqd<zzcht> zzau4 = zzepr.zzau(zzchs.zzapv());
        this.zzevh = zzau4;
        zzeqd<zzchu> zzau5 = zzepr.zzau(new zzchx(zzau4));
        this.zzevi = zzau5;
        this.zzevj = zzepr.zzau(new zzbfn(zzbfhVar, zzau5));
        this.zzevk = zzepr.zzau(new zzcwu(zzdpy.zzawz()));
        this.zzevl = new zzbfj(zzbfhVar);
        this.zzevm = zzepr.zzau(new zzbfp(zzbfhVar));
        zzeqd<zzckd> zzau6 = zzepr.zzau(new zzcke(zzdpy.zzawz(), this.zzeut, this.zzeuy, zzdsb.zzaxq()));
        this.zzevn = zzau6;
        this.zzevo = zzepr.zzau(new zzckg(this.zzevm, zzau6));
        zzeqd<zzcoq> zzau7 = zzepr.zzau(new zzcot(this.zzevm, this.zzevd));
        this.zzevp = zzau7;
        this.zzevq = zzepr.zzau(new zzbfl(zzau7, zzdpy.zzawz()));
        zzepz zzbmr = zzepz.zzas(0, 1).zzax(this.zzevq).zzbmr();
        this.zzevr = zzbmr;
        this.zzevs = new zzbwr(zzbmr);
        this.zzevt = zzepr.zzau(new zzclj(this.zzeve, this.zzeuw, this.zzevl, zzdpy.zzawz(), this.zzevi, this.zzevc, this.zzevo, this.zzeux, this.zzevs));
        this.zzevu = zzepr.zzau(new zzbig(zzbhsVar));
        zzeqd<zzchw> zzau8 = zzepr.zzau(new zzcia(zzdpy.zzawz()));
        this.zzevv = zzau8;
        this.zzevw = zzepr.zzau(new zzbht(this.zzeuw, this.zzeux, this.zzevi, this.zzevj, this.zzevk, this.zzevt, this.zzevu, zzau8));
        this.zzeul = zzept.zzbb(this);
        this.zzevx = zzepr.zzau(new zzbfm(zzbfhVar));
        this.zzevy = new zzbhl(zzbhjVar);
        this.zzevz = zzepr.zzau(new zzcqg(this.zzeuw, zzdpy.zzawz()));
        this.zzewa = zzepr.zzau(new zzdsj(zzdpy.zzawz(), this.zzeut));
        this.zzewb = zzepr.zzau(new zzcjz(this.zzevn, zzdpy.zzawz()));
        zzeqd<Context> zzeqdVar = this.zzeuw;
        zzeqd<Executor> zzeqdVar2 = this.zzeve;
        zzeqd<zzef> zzeqdVar3 = this.zzevx;
        zzeqd<zzayt> zzeqdVar4 = this.zzeux;
        zzeqd<com.google.android.gms.ads.internal.zzb> zzeqdVar5 = this.zzevy;
        zzbhwVar = zzbhz.zzfpa;
        zzeqd<zzcfy> zzau9 = zzepr.zzau(new zzcgd(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzbhwVar, this.zzevz, this.zzewa, this.zzewb, this.zzevd));
        this.zzewc = zzau9;
        zzeqd<zzdnr<zzcfp>> zzau10 = zzepr.zzau(new zzbfu(zzau9, zzdpy.zzawz()));
        this.zzewd = zzau10;
        this.zzewe = zzepr.zzau(new zzczj(this.zzeul, this.zzeuw, this.zzevx, this.zzeux, zzau10, zzdpy.zzawz(), this.zzevc));
        this.zzewf = zzepr.zzau(new zzcqr(this.zzeuw, this.zzevz, this.zzeut, this.zzewb, this.zzevd));
        this.zzewg = zzepr.zzau(new zzbfi(zzbfhVar));
        this.zzewh = zzepr.zzau(new zzdgf(this.zzeuw));
        this.zzewi = zzepr.zzau(new zzdoe(this.zzeuw, this.zzeux, this.zzewg));
        this.zzewj = zzepr.zzau(new zzcki(this.zzevg));
        this.zzewk = zzepr.zzau(zzdqa.zzaxc());
        zzdfc zzdfcVar = new zzdfc(zzdpy.zzawz(), this.zzeuw);
        this.zzewl = zzdfcVar;
        this.zzewm = zzepr.zzau(new zzdbt(zzdfcVar, this.zzevg));
        zzdbk zzdbkVar = new zzdbk(zzdpy.zzawz(), this.zzeuw);
        this.zzewn = zzdbkVar;
        this.zzewo = zzepr.zzau(new zzdbu(zzdbkVar, this.zzevg));
        this.zzewp = zzepr.zzau(new zzdbw(this.zzevg));
        this.zzewq = zzepr.zzau(zzdnn.zzavn());
        this.zzewr = zzepr.zzau(new zzbfo(zzbfhVar, this.zzevi));
        this.zzews = new zzbfq(zzbfhVar, this.zzeul);
        this.zzewt = new zzbfx(this.zzeuw);
        zzbfvVar = zzbfy.zzeup;
        this.zzewu = zzepr.zzau(zzbfvVar);
        this.zzewv = new zzbhm(zzbhjVar);
        this.zzeww = zzepr.zzau(new zzdri(zzdrjVar, this.zzeuw, this.zzeux));
        this.zzewx = new zzbhn(zzbhjVar);
        this.zzewy = new zzbhp(zzbhjVar);
        this.zzewz = new zzbky(this.zzevc, this.zzevg);
        this.zzexa = zzepr.zzau(zzdom.zzavr());
        this.zzexb = zzepr.zzau(zzdph.zzawm());
        this.zzexc = zzepr.zzau(new zzbhv(this.zzeuw));
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzdro zzaes() {
        return this.zzevd.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final Executor zzaet() {
        return this.zzeve.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final ScheduledExecutorService zzaeu() {
        return this.zzevc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final Executor zzaev() {
        return zzdpy.zzaxa();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzdzk zzaew() {
        return this.zzevf.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzbsx zzaex() {
        return zzbky.zza(this.zzevc.get(), this.zzevg.get());
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzchu zzaey() {
        return this.zzevi.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzbho zzaez() {
        return this.zzevw.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzblw zzafa() {
        return new zzbgs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzdiv zzafb() {
        return new zzbgw(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzbkc zzafc() {
        return new zzbgl(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzbkp zzafd() {
        return new zzbgk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzdho zzafe() {
        return new zzbgq(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzbzc zzaff() {
        return new zzbgx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzdkq zzafg() {
        return new zzbhc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzbzy zzafh() {
        return new zzbgd(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzcgm zzafi() {
        return new zzbhg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzdlz zzafj() {
        return new zzbhe(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzcys zzafk() {
        return new zzbhh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzcyv zzafl() {
        return this.zzewe.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzcqi zzafm() {
        return this.zzewf.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzdnr<zzcfp> zzafn() {
        return this.zzewd.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    protected final zzdfm zza(zzdgr zzdgrVar) {
        zzepw.checkNotNull(zzdgrVar);
        return new zzbgh(this, zzdgrVar);
    }
}
