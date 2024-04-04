package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsv implements zzepq<zzcsm> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzcgx> zzgev;
    private final zzeqd<zzbzd> zzgro;

    public zzcsv(zzeqd<Context> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<zzdmx> zzeqdVar3, zzeqd<Executor> zzeqdVar4, zzeqd<zzbzd> zzeqdVar5, zzeqd<zzcgx> zzeqdVar6) {
        this.zzeuo = zzeqdVar;
        this.zzfrk = zzeqdVar2;
        this.zzftm = zzeqdVar3;
        this.zzftf = zzeqdVar4;
        this.zzgro = zzeqdVar5;
        this.zzgev = zzeqdVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcsm(this.zzeuo.get(), this.zzfrk.get(), this.zzftm.get(), this.zzftf.get(), this.zzgro.get(), this.zzgev.get());
    }
}
