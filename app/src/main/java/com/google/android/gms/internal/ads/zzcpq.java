package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpq implements zzepq<zzcpp> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzcpi> zzfci;
    private final zzeqd<zzcpc> zzfey;
    private final zzeqd<zzbpw> zzgpr;

    private zzcpq(zzeqd<Context> zzeqdVar, zzeqd<zzbpw> zzeqdVar2, zzeqd<zzcpi> zzeqdVar3, zzeqd<zzcpc> zzeqdVar4) {
        this.zzeuo = zzeqdVar;
        this.zzgpr = zzeqdVar2;
        this.zzfci = zzeqdVar3;
        this.zzfey = zzeqdVar4;
    }

    public static zzcpq zze(zzeqd<Context> zzeqdVar, zzeqd<zzbpw> zzeqdVar2, zzeqd<zzcpi> zzeqdVar3, zzeqd<zzcpc> zzeqdVar4) {
        return new zzcpq(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcpp(this.zzeuo.get(), this.zzgpr.get(), this.zzfci.get(), this.zzfey.get());
    }
}
