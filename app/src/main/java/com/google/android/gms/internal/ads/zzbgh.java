package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbgh extends zzdfm {
    private final /* synthetic */ zzbgb zzexk;
    private zzeqd<String> zzfbr;
    private zzeqd<zzcjg> zzfbt;
    private zzeqd<Map<zzdqz, zzcjg>> zzfbv;
    private zzeqd<Set<zzbxf<zzdre>>> zzfbx;
    private zzeqd<Set<zzbxf<zzdre>>> zzfcl;
    private zzeqd zzfcm;
    private zzeqd<zzdqy> zzfcn;
    private final zzdgr zzfhx;
    private zzeqd<Integer> zzfhy;
    private zzeqd<zzdfi> zzfhz;
    private zzeqd<String> zzfia;
    private zzeqd<zzdfs> zzfib;
    private zzeqd<zzdfw> zzfic;
    private zzeqd<zzdgc> zzfid;
    private zzeqd<zzdgh> zzfie;
    private zzeqd<zzdgq> zzfif;
    private zzeqd<zzdhc> zzfig;
    private zzeqd<zzcjg> zzfih;
    private zzeqd<zzcjg> zzfii;
    private zzeqd<zzcjg> zzfij;

    private zzbgh(zzbgb zzbgbVar, zzdgr zzdgrVar) {
        zzbie zzbieVar;
        zzeqd zzeqdVar;
        zzeqd zzeqdVar2;
        zzbft zzbftVar;
        zzeqd zzeqdVar3;
        zzbie zzbieVar2;
        zzeqd zzeqdVar4;
        zzeqd zzeqdVar5;
        zzeqd zzeqdVar6;
        zzbhy zzbhyVar;
        zzeqd zzeqdVar7;
        zzbia zzbiaVar;
        zzbic zzbicVar;
        zzeqd zzeqdVar8;
        zzeqd zzeqdVar9;
        zzeqd zzeqdVar10;
        zzeqd zzeqdVar11;
        this.zzexk = zzbgbVar;
        this.zzfhx = zzdgrVar;
        this.zzfhy = new zzdgt(zzdgrVar);
        zzbieVar = zzbih.zzfpf;
        zzeqdVar = this.zzexk.zzeuw;
        zzeqdVar2 = this.zzexk.zzevc;
        this.zzfhz = new zzdfj(zzbieVar, zzeqdVar, zzeqdVar2, zzdpy.zzawz(), this.zzfhy);
        this.zzfia = new zzdgu(zzdgrVar);
        zzbftVar = zzbfw.zzeun;
        zzeqdVar3 = this.zzexk.zzeuw;
        this.zzfib = new zzdfu(zzbftVar, zzeqdVar3, this.zzfia, zzdpy.zzawz());
        zzbieVar2 = zzbih.zzfpf;
        zzeqd<Integer> zzeqdVar12 = this.zzfhy;
        zzeqdVar4 = this.zzexk.zzeuw;
        zzeqdVar5 = this.zzexk.zzewg;
        zzeqdVar6 = this.zzexk.zzevc;
        this.zzfic = new zzdga(zzbieVar2, zzeqdVar12, zzeqdVar4, zzeqdVar5, zzeqdVar6, zzdpy.zzawz());
        zzbhyVar = zzbib.zzfpb;
        zzdpy zzawz = zzdpy.zzawz();
        zzeqdVar7 = this.zzexk.zzeuw;
        this.zzfid = new zzdge(zzbhyVar, zzawz, zzeqdVar7);
        zzbiaVar = zzbid.zzfpc;
        this.zzfie = new zzdgj(zzbiaVar, zzdpy.zzawz(), this.zzfia);
        zzbicVar = zzbif.zzfpd;
        zzeqdVar8 = this.zzexk.zzevc;
        zzeqdVar9 = this.zzexk.zzeuw;
        this.zzfif = new zzdgs(zzbicVar, zzeqdVar8, zzeqdVar9);
        this.zzfig = new zzdhe(zzdpy.zzawz());
        this.zzfbr = new zzdgw(zzdgrVar);
        this.zzfbt = zzepr.zzau(zzciz.zzaql());
        this.zzfih = zzepr.zzau(zzcix.zzaqj());
        this.zzfii = zzepr.zzau(zzcjb.zzaqn());
        this.zzfij = zzepr.zzau(zzcjd.zzaqp());
        this.zzfbv = ((zzepu) ((zzepu) ((zzepu) ((zzepu) zzeps.zzih(4).zza(zzdqz.GMS_SIGNALS, this.zzfbt)).zza(zzdqz.BUILD_URL, this.zzfih)).zza(zzdqz.HTTP, this.zzfii)).zza(zzdqz.PRE_PROCESS, this.zzfij)).zzbmq();
        zzeqd<String> zzeqdVar13 = this.zzfbr;
        zzeqdVar10 = this.zzexk.zzeuw;
        this.zzfbx = zzepr.zzau(new zzcjf(zzeqdVar13, zzeqdVar10, zzdpy.zzawz(), this.zzfbv));
        zzepz zzbmr = zzepz.zzas(0, 1).zzax(this.zzfbx).zzbmr();
        this.zzfcl = zzbmr;
        this.zzfcm = zzdrg.zzat(zzbmr);
        zzdpy zzawz2 = zzdpy.zzawz();
        zzeqdVar11 = this.zzexk.zzevc;
        this.zzfcn = zzepr.zzau(zzdrh.zzae(zzawz2, zzeqdVar11, this.zzfcm));
    }

    private final zzdgl zzagw() {
        return new zzdgl((zzaau) zzepw.zza(new zzaau(), "Cannot return null from a non-@Nullable @Provides method"), zzdpy.zzaxa(), (List) zzepw.zza(this.zzfhx.zzaua(), "Cannot return null from a non-@Nullable @Provides method"));
    }

    private final zzdfo zzagx() {
        return new zzdfo(zzbie.zzair(), zzdpy.zzaxa(), (String) zzepw.zza(this.zzfhx.zzaty(), "Cannot return null from a non-@Nullable @Provides method"), this.zzfhx.zzatz(), this.zzfhx.zzauc());
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final zzdet<JSONObject> zzagy() {
        zzeqd zzeqdVar;
        zzeqd zzeqdVar2;
        zzbfh zzbfhVar;
        zzeqd zzeqdVar3;
        zzbfh zzbfhVar2;
        zzeqd zzeqdVar4;
        zzeqd zzeqdVar5;
        zzeqd zzeqdVar6;
        zzbfh zzbfhVar3;
        zzbfh zzbfhVar4;
        zzbfh zzbfhVar5;
        zzeqd zzeqdVar7;
        zzeqd zzeqdVar8;
        zzeqd zzeqdVar9;
        zzdzk zzaxa = zzdpy.zzaxa();
        zzdgh zzdghVar = new zzdgh(zzbia.zzain(), zzdpy.zzaxa(), zzdgu.zzb(this.zzfhx));
        zzeqdVar = this.zzexk.zzevc;
        zzdeu zzdeuVar = (zzdeu) zzepw.zza(new zzddf(zzdghVar, 0L, (ScheduledExecutorService) zzeqdVar.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzaqz zzaip = zzbic.zzaip();
        zzeqdVar2 = this.zzexk.zzevc;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzeqdVar2.get();
        zzbfhVar = this.zzexk.zzeur;
        zzdgq zzdgqVar = new zzdgq(zzaip, scheduledExecutorService, zzbfk.zza(zzbfhVar));
        zzeqdVar3 = this.zzexk.zzevc;
        zzdeu zzdeuVar2 = (zzdeu) zzepw.zza(new zzddf(zzdgqVar, ((Long) zzwo.zzqq().zzd(zzabh.zzctc)).longValue(), (ScheduledExecutorService) zzeqdVar3.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzaxo zzair = zzbie.zzair();
        zzbfhVar2 = this.zzexk.zzeur;
        Context zza = zzbfk.zza(zzbfhVar2);
        zzeqdVar4 = this.zzexk.zzevc;
        zzdfi zzdfiVar = new zzdfi(zzair, zza, (ScheduledExecutorService) zzeqdVar4.get(), zzdpy.zzaxa(), this.zzfhx.zzauc());
        zzeqdVar5 = this.zzexk.zzevc;
        zzdeu zzdeuVar3 = (zzdeu) zzepw.zza(new zzddf(zzdfiVar, 0L, (ScheduledExecutorService) zzeqdVar5.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzdhc zzdhcVar = new zzdhc(zzdpy.zzaxa());
        zzeqdVar6 = this.zzexk.zzevc;
        zzdeu zzdeuVar4 = (zzdeu) zzepw.zza(new zzddf(zzdhcVar, 0L, (ScheduledExecutorService) zzeqdVar6.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzdeu zzdeuVar5 = (zzdeu) zzepw.zza(zzdgv.zzaud(), "Cannot return null from a non-@Nullable @Provides method");
        zzbfhVar3 = this.zzexk.zzeur;
        zzdfs zzdfsVar = new zzdfs(null, zzbfk.zza(zzbfhVar3), zzdgu.zzb(this.zzfhx), zzdpy.zzaxa());
        zztk zzail = zzbhy.zzail();
        zzdzk zzaxa2 = zzdpy.zzaxa();
        zzbfhVar4 = this.zzexk.zzeur;
        zzaxo zzair2 = zzbie.zzair();
        int zzauc = this.zzfhx.zzauc();
        zzbfhVar5 = this.zzexk.zzeur;
        Context zza2 = zzbfk.zza(zzbfhVar5);
        zzeqdVar7 = this.zzexk.zzewg;
        zzaxs zzaxsVar = (zzaxs) zzeqdVar7.get();
        zzeqdVar8 = this.zzexk.zzevc;
        zzeqdVar9 = this.zzexk.zzewh;
        return zzdey.zza(zzaxa, zzdwv.zza(zzdeuVar, zzdeuVar2, zzdeuVar3, zzdeuVar4, zzdeuVar5, zzdfsVar, new zzdgc(zzail, zzaxa2, zzbfk.zza(zzbfhVar4)), zzagw(), zzagx(), new zzdfw(zzair2, zzauc, zza2, zzaxsVar, (ScheduledExecutorService) zzeqdVar8.get(), zzdpy.zzaxa()), (zzdeu) zzeqdVar9.get()));
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final zzdet<JSONObject> zzagz() {
        zzeqd zzeqdVar;
        zzeqd zzeqdVar2;
        zzaxn zzain = zzbia.zzain();
        zzeqdVar = this.zzexk.zzewh;
        Object obj = zzeqdVar.get();
        zzdfo zzagx = zzagx();
        zzdgl zzagw = zzagw();
        zzepk zzav = zzepr.zzav(this.zzfhz);
        zzepk zzav2 = zzepr.zzav(this.zzfib);
        zzepk zzav3 = zzepr.zzav(this.zzfic);
        zzepk zzav4 = zzepr.zzav(this.zzfid);
        zzepk zzav5 = zzepr.zzav(this.zzfie);
        zzepk zzav6 = zzepr.zzav(this.zzfif);
        zzepk zzav7 = zzepr.zzav(this.zzfig);
        zzdzk zzaxa = zzdpy.zzaxa();
        zzeqdVar2 = this.zzexk.zzevc;
        return zzdha.zza(zzain, obj, zzagx, zzagw, zzav, zzav2, zzav3, zzav4, zzav5, zzav6, zzav7, zzaxa, (ScheduledExecutorService) zzeqdVar2.get());
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final zzdqy zzaha() {
        return this.zzfcn.get();
    }
}
