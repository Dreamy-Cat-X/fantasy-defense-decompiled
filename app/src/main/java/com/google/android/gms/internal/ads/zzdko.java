package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdko implements zzepq<zzdkf> {
    private final zzeqd<zzbff> zzeul;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzcxf> zzgxb;
    private final zzeqd<Context> zzhdl;
    private final zzeqd<zzdmz> zzhdn;
    private final zzeqd<zzdkp> zzhgh;

    public zzdko(zzeqd<Context> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzbff> zzeqdVar3, zzeqd<zzcxf> zzeqdVar4, zzeqd<zzdkp> zzeqdVar5, zzeqd<zzdmz> zzeqdVar6) {
        this.zzhdl = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzeul = zzeqdVar3;
        this.zzgxb = zzeqdVar4;
        this.zzhgh = zzeqdVar5;
        this.zzhdn = zzeqdVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdkf(this.zzhdl.get(), this.zzftf.get(), this.zzeul.get(), this.zzgxb.get(), this.zzhgh.get(), this.zzhdn.get());
    }
}