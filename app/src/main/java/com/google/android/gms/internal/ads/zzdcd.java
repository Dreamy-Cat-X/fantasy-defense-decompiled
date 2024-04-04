package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdcd implements zzepq<zzdcb> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Context> zzeuo;

    private zzdcd(zzeqd<Context> zzeqdVar, zzeqd<zzdzk> zzeqdVar2) {
        this.zzeuo = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    public static zzdcd zzav(zzeqd<Context> zzeqdVar, zzeqd<zzdzk> zzeqdVar2) {
        return new zzdcd(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdcb(this.zzeuo.get(), this.zzeuj.get());
    }
}
