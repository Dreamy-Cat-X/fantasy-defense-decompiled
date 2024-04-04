package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsz implements zzepq<zzcsx> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzbzd> zzgro;

    public zzcsz(zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<zzbzd> zzeqdVar3, zzeqd<Executor> zzeqdVar4) {
        this.zzeuo = zzeqdVar;
        this.zzfrk = zzeqdVar2;
        this.zzgro = zzeqdVar3;
        this.zzftf = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcsx(this.zzeuo.get(), this.zzfrk.get(), this.zzgro.get(), this.zzftf.get());
    }
}
