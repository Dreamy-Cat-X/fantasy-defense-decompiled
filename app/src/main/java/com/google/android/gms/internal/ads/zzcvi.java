package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcvi implements zzepq<zzcvf> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzcgn> zzgro;

    public zzcvi(zzeqd<Context> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzcgn> zzeqdVar3) {
        this.zzeuo = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzgro = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcvf(this.zzeuo.get(), this.zzftf.get(), this.zzgro.get());
    }
}
