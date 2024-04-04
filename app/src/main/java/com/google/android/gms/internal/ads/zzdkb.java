package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdkb implements zzepq<zzdjv<zzbkd, zzbki>> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdok> zzexa;
    private final zzeqd<zzdpf> zzexb;

    public zzdkb(zzeqd<Context> zzeqdVar, zzeqd<zzdok> zzeqdVar2, zzeqd<zzdpf> zzeqdVar3) {
        this.zzeuo = zzeqdVar;
        this.zzexa = zzeqdVar2;
        this.zzexb = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzdjv) zzepw.zza(zzdjz.zza(this.zzeuo.get(), this.zzexa.get(), this.zzexb.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
