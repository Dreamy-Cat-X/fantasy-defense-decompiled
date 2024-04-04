package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfg implements zzepq<zzdfe> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Context> zzeuo;

    private zzdfg(zzeqd<zzdzk> zzeqdVar, zzeqd<Context> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzeuo = zzeqdVar2;
    }

    public static zzdfg zzbc(zzeqd<zzdzk> zzeqdVar, zzeqd<Context> zzeqdVar2) {
        return new zzdfg(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdfe(this.zzeuj.get(), this.zzeuo.get());
    }
}
