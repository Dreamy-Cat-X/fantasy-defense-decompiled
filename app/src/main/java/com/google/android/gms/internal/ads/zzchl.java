package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzchl implements zzepq<zzcgx> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzacm> zzffu;
    private final zzeqd<zzayt> zzfov;
    private final zzeqd<zzbsx> zzftn;
    private final zzeqd<zzef> zzgbg;
    private final zzeqd<zztu> zzggp;
    private final zzeqd<zzbdp> zzghu;
    private final zzeqd<com.google.android.gms.ads.internal.zzb> zzgin;

    private zzchl(zzeqd<zzbdp> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<zzef> zzeqdVar3, zzeqd<zzacm> zzeqdVar4, zzeqd<zzayt> zzeqdVar5, zzeqd<com.google.android.gms.ads.internal.zzb> zzeqdVar6, zzeqd<zztu> zzeqdVar7, zzeqd<zzbsx> zzeqdVar8) {
        this.zzghu = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzgbg = zzeqdVar3;
        this.zzffu = zzeqdVar4;
        this.zzfov = zzeqdVar5;
        this.zzgin = zzeqdVar6;
        this.zzggp = zzeqdVar7;
        this.zzftn = zzeqdVar8;
    }

    public static zzchl zza(zzeqd<zzbdp> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<zzef> zzeqdVar3, zzeqd<zzacm> zzeqdVar4, zzeqd<zzayt> zzeqdVar5, zzeqd<com.google.android.gms.ads.internal.zzb> zzeqdVar6, zzeqd<zztu> zzeqdVar7, zzeqd<zzbsx> zzeqdVar8) {
        return new zzchl(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzeqdVar6, zzeqdVar7, zzeqdVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcgx(this.zzghu.get(), this.zzeuo.get(), this.zzgbg.get(), this.zzffu.get(), this.zzfov.get(), this.zzgin.get(), this.zzggp.get(), this.zzftn.get());
    }
}
