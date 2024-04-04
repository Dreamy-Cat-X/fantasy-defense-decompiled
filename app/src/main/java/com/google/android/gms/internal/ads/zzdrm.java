package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdrm implements zzepq<zzdrk> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzayq> zzewa;

    public zzdrm(zzeqd<Executor> zzeqdVar, zzeqd<zzayq> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzewa = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdrk(this.zzeuj.get(), this.zzewa.get());
    }
}
