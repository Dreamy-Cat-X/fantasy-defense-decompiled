package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzctm implements zzepq<zzctn> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzbzz> zzgro;

    public zzctm(zzeqd<Context> zzeqdVar, zzeqd<zzbzz> zzeqdVar2, zzeqd<Executor> zzeqdVar3) {
        this.zzeuo = zzeqdVar;
        this.zzgro = zzeqdVar2;
        this.zzftf = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzctn(this.zzeuo.get(), this.zzgro.get(), this.zzftf.get());
    }
}
