package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcyc implements zzepq<zzcya> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzvp> zzgwy;
    private final zzeqd<String> zzgwz;
    private final zzeqd<zzdkf> zzgxa;
    private final zzeqd<zzcxf> zzgxb;
    private final zzeqd<zzdkp> zzgxc;

    public zzcyc(zzeqd<Context> zzeqdVar, zzeqd<zzvp> zzeqdVar2, zzeqd<String> zzeqdVar3, zzeqd<zzdkf> zzeqdVar4, zzeqd<zzcxf> zzeqdVar5, zzeqd<zzdkp> zzeqdVar6) {
        this.zzeuo = zzeqdVar;
        this.zzgwy = zzeqdVar2;
        this.zzgwz = zzeqdVar3;
        this.zzgxa = zzeqdVar4;
        this.zzgxb = zzeqdVar5;
        this.zzgxc = zzeqdVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcya(this.zzeuo.get(), this.zzgwy.get(), this.zzgwz.get(), this.zzgxa.get(), this.zzgxb.get(), this.zzgxc.get());
    }
}
