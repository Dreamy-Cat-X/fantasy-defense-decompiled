package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcun implements zzepq<zzcul> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzcgn> zzgro;

    public zzcun(zzeqd<Context> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzcgn> zzeqdVar3) {
        this.zzeuo = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzgro = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcul(this.zzeuo.get(), this.zzftf.get(), this.zzgro.get());
    }
}
