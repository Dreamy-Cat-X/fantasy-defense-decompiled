package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzblt implements zzepq<zzawh> {
    private final zzeqd<Context> zzeuo;
    private final zzble zzftk;
    private final zzeqd<zzdmx> zzftm;

    public zzblt(zzble zzbleVar, zzeqd<Context> zzeqdVar, zzeqd<zzdmx> zzeqdVar2) {
        this.zzftk = zzbleVar;
        this.zzeuo = zzeqdVar;
        this.zzftm = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzawh) zzepw.zza(new zzawh(this.zzeuo.get(), this.zzftm.get().zzhje), "Cannot return null from a non-@Nullable @Provides method");
    }
}
