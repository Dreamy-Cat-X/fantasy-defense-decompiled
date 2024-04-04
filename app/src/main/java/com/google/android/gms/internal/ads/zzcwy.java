package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcwy implements zzepq<zzcwz> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzwv> zzgvx;
    private final zzeqd<zzblb> zzgvy;

    public zzcwy(zzeqd<Context> zzeqdVar, zzeqd<zzwv> zzeqdVar2, zzeqd<zzdmx> zzeqdVar3, zzeqd<zzblb> zzeqdVar4) {
        this.zzeuo = zzeqdVar;
        this.zzgvx = zzeqdVar2;
        this.zzftm = zzeqdVar3;
        this.zzgvy = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcwz(this.zzeuo.get(), this.zzgvx.get(), this.zzftm.get(), this.zzgvy.get());
    }
}
