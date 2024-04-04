package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcrx implements zzepq<zzcrv> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzblx> zzgro;

    public zzcrx(zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<zzblx> zzeqdVar3, zzeqd<Executor> zzeqdVar4) {
        this.zzeuo = zzeqdVar;
        this.zzfrk = zzeqdVar2;
        this.zzgro = zzeqdVar3;
        this.zzftf = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcrv(this.zzeuo.get(), this.zzfrk.get(), this.zzgro.get(), this.zzftf.get());
    }
}
