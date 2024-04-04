package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdsj implements zzepq<zzdsh> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzayq> zzeut;

    public zzdsj(zzeqd<Executor> zzeqdVar, zzeqd<zzayq> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzeut = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdsh(this.zzeuj.get(), this.zzeut.get());
    }
}
