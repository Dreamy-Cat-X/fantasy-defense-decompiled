package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcgd implements zzepq<zzcfy> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdsh> zzewa;
    private final zzeqd<zzcju> zzewb;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzayt> zzfxl;
    private final zzeqd<zzef> zzgbg;
    private final zzeqd<com.google.android.gms.ads.internal.zzb> zzggo;
    private final zzeqd<zzbdp> zzghu;
    private final zzeqd<zzcpy> zzghv;
    private final zzeqd<zzdro> zzghw;

    public zzcgd(zzeqd<Context> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzef> zzeqdVar3, zzeqd<zzayt> zzeqdVar4, zzeqd<com.google.android.gms.ads.internal.zzb> zzeqdVar5, zzeqd<zzbdp> zzeqdVar6, zzeqd<zzcpy> zzeqdVar7, zzeqd<zzdsh> zzeqdVar8, zzeqd<zzcju> zzeqdVar9, zzeqd<zzdro> zzeqdVar10) {
        this.zzeuo = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzgbg = zzeqdVar3;
        this.zzfxl = zzeqdVar4;
        this.zzggo = zzeqdVar5;
        this.zzghu = zzeqdVar6;
        this.zzghv = zzeqdVar7;
        this.zzewa = zzeqdVar8;
        this.zzewb = zzeqdVar9;
        this.zzghw = zzeqdVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcfy(this.zzeuo.get(), this.zzftf.get(), this.zzgbg.get(), this.zzfxl.get(), this.zzggo.get(), this.zzghu.get(), this.zzghv.get(), this.zzewa.get(), this.zzewb.get(), this.zzghw.get());
    }
}
