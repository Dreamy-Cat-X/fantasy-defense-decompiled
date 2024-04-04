package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcnc implements zzepq<zzcnd> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzawg> zzfoy;

    private zzcnc(zzeqd<Context> zzeqdVar, zzeqd<zzawg> zzeqdVar2) {
        this.zzeuo = zzeqdVar;
        this.zzfoy = zzeqdVar2;
    }

    public static zzcnc zzal(zzeqd<Context> zzeqdVar, zzeqd<zzawg> zzeqdVar2) {
        return new zzcnc(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcnd(this.zzeuo.get(), this.zzfoy.get());
    }
}
