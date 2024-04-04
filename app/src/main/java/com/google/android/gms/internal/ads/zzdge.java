package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdge implements zzepq<zzdgc> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zztf> zzewc;

    public zzdge(zzeqd<zztf> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<Context> zzeqdVar3) {
        this.zzewc = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzeuo = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdgc(this.zzewc.get(), this.zzeuj.get(), this.zzeuo.get());
    }
}
