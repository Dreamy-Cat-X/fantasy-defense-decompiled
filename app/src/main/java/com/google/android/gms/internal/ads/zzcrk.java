package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcrk implements zzepq<zzcrg> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzcgx> zzgev;
    private final zzeqd<zzbkd> zzgro;

    public zzcrk(zzeqd<zzbkd> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<Executor> zzeqdVar3, zzeqd<zzcgx> zzeqdVar4) {
        this.zzgro = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzftf = zzeqdVar3;
        this.zzgev = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcrg(this.zzgro.get(), this.zzeuo.get(), this.zzftf.get(), this.zzgev.get());
    }
}
