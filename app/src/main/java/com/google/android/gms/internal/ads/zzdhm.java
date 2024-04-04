package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdhm implements zzepq<zzdhf> {
    private final zzeqd<zzbff> zzeul;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<String> zzgwz;
    private final zzeqd<zzdhd> zzgxa;
    private final zzeqd<zzdht> zzhdq;

    public zzdhm(zzeqd<zzbff> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<String> zzeqdVar3, zzeqd<zzdhd> zzeqdVar4, zzeqd<zzdht> zzeqdVar5, zzeqd<zzayt> zzeqdVar6) {
        this.zzeul = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzgwz = zzeqdVar3;
        this.zzgxa = zzeqdVar4;
        this.zzhdq = zzeqdVar5;
        this.zzfrk = zzeqdVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdhf(this.zzeul.get(), this.zzeuo.get(), this.zzgwz.get(), this.zzgxa.get(), this.zzhdq.get(), this.zzfrk.get());
    }
}
