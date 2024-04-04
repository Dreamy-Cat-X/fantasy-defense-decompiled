package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzded implements zzepq<zzdeb> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzawg> zzfoy;

    private zzded(zzeqd<zzawg> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<Context> zzeqdVar3) {
        this.zzfoy = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzeuo = zzeqdVar3;
    }

    public static zzded zzac(zzeqd<zzawg> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<Context> zzeqdVar3) {
        return new zzded(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdeb(this.zzfoy.get(), this.zzeuj.get(), this.zzeuo.get());
    }
}
