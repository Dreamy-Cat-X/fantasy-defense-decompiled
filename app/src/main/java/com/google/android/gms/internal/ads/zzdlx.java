package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdlx implements zzepq<zzdlw> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdmw> zzfnj;
    private final zzeqd<String> zzgwz;
    private final zzeqd<zzdlo> zzgxa;
    private final zzeqd<zzdkp> zzhdq;

    public zzdlx(zzeqd<String> zzeqdVar, zzeqd<zzdlo> zzeqdVar2, zzeqd<Context> zzeqdVar3, zzeqd<zzdkp> zzeqdVar4, zzeqd<zzdmw> zzeqdVar5) {
        this.zzgwz = zzeqdVar;
        this.zzgxa = zzeqdVar2;
        this.zzeuo = zzeqdVar3;
        this.zzhdq = zzeqdVar4;
        this.zzfnj = zzeqdVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdlw(this.zzgwz.get(), this.zzgxa.get(), this.zzeuo.get(), this.zzhdq.get(), this.zzfnj.get());
    }
}
