package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdit implements zzepq<zzdiq> {
    private final zzeqd<zzbff> zzeul;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzcxf> zzgxb;
    private final zzeqd<Context> zzhdl;
    private final zzeqd<zzdmz> zzhdn;
    private final zzeqd<zzvp> zzhev;
    private final zzeqd<zzcxz> zzhew;

    public zzdit(zzeqd<Context> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzvp> zzeqdVar3, zzeqd<zzbff> zzeqdVar4, zzeqd<zzcxf> zzeqdVar5, zzeqd<zzcxz> zzeqdVar6, zzeqd<zzdmz> zzeqdVar7) {
        this.zzhdl = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzhev = zzeqdVar3;
        this.zzeul = zzeqdVar4;
        this.zzgxb = zzeqdVar5;
        this.zzhew = zzeqdVar6;
        this.zzhdn = zzeqdVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdiq(this.zzhdl.get(), this.zzftf.get(), this.zzhev.get(), this.zzeul.get(), this.zzgxb.get(), this.zzhew.get(), this.zzhdn.get());
    }
}
