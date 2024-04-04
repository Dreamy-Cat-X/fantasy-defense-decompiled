package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbmm implements zzepq<zzbmh> {
    private final zzeqd<zzagd> zzeui;
    private final zzeqd<zzbmy> zzfak;
    private final zzeqd<Runnable> zzflr;
    private final zzeqd<Executor> zzftf;

    public zzbmm(zzeqd<zzbmy> zzeqdVar, zzeqd<zzagd> zzeqdVar2, zzeqd<Runnable> zzeqdVar3, zzeqd<Executor> zzeqdVar4) {
        this.zzfak = zzeqdVar;
        this.zzeui = zzeqdVar2;
        this.zzflr = zzeqdVar3;
        this.zzftf = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbmh(this.zzfak.get(), this.zzeui.get(), this.zzflr.get(), this.zzftf.get());
    }
}
