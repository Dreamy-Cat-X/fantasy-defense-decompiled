package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzczs implements zzepq<zzczq> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzcme> zzgmd;

    public zzczs(zzeqd<Executor> zzeqdVar, zzeqd<zzcme> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzgmd = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzczq(this.zzeuj.get(), this.zzgmd.get());
    }
}
