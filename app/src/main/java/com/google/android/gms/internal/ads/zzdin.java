package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdin implements zzepq<zzdih> {
    private final zzeqd<zzbff> zzeul;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<String> zzgwz;
    private final zzeqd<zzdif> zzgxa;
    private final zzeqd<zzdht> zzhdq;

    public zzdin(zzeqd<zzbff> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<String> zzeqdVar3, zzeqd<zzdif> zzeqdVar4, zzeqd<zzdht> zzeqdVar5) {
        this.zzeul = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzgwz = zzeqdVar3;
        this.zzgxa = zzeqdVar4;
        this.zzhdq = zzeqdVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdih(this.zzeul.get(), this.zzeuo.get(), this.zzgwz.get(), this.zzgxa.get(), this.zzhdq.get());
    }
}
