package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcjz implements zzepq<zzcju> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzckd> zzevn;

    public zzcjz(zzeqd<zzckd> zzeqdVar, zzeqd<Executor> zzeqdVar2) {
        this.zzevn = zzeqdVar;
        this.zzeuj = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcju(this.zzevn.get(), this.zzeuj.get());
    }
}
