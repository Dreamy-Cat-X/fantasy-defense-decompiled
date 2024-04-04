package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdlt implements zzepq<zzdlo> {
    private final zzeqd<zzbff> zzeul;
    private final zzeqd<zzdmw> zzfnj;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzdkp> zzgxb;
    private final zzeqd<Context> zzhdl;
    private final zzeqd<zzdjv<zzcgn, zzcgg>> zzhdm;
    private final zzeqd<zzdmz> zzhdn;

    public zzdlt(zzeqd<Context> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzbff> zzeqdVar3, zzeqd<zzdjv<zzcgn, zzcgg>> zzeqdVar4, zzeqd<zzdkp> zzeqdVar5, zzeqd<zzdmz> zzeqdVar6, zzeqd<zzdmw> zzeqdVar7) {
        this.zzhdl = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzeul = zzeqdVar3;
        this.zzhdm = zzeqdVar4;
        this.zzgxb = zzeqdVar5;
        this.zzhdn = zzeqdVar6;
        this.zzfnj = zzeqdVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdlo(this.zzhdl.get(), this.zzftf.get(), this.zzeul.get(), this.zzhdm.get(), this.zzgxb.get(), this.zzhdn.get(), this.zzfnj.get());
    }
}
