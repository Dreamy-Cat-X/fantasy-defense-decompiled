package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsa implements zzepq<zzcrw> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzblx> zzgro;

    public zzcsa(zzeqd<Context> zzeqdVar, zzeqd<zzblx> zzeqdVar2) {
        this.zzeuo = zzeqdVar;
        this.zzgro = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcrw(this.zzeuo.get(), this.zzgro.get());
    }
}