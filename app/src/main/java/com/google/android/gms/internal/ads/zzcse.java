package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcse implements zzepq<zzcsd> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzbzd> zzgro;
    private final zzeqd<zzdmg> zzgsi;

    public zzcse(zzeqd<Context> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzbzd> zzeqdVar3, zzeqd<zzdmg> zzeqdVar4) {
        this.zzeuo = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzgro = zzeqdVar3;
        this.zzgsi = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcsd(this.zzeuo.get(), this.zzftf.get(), this.zzgro.get(), this.zzgsi.get());
    }
}
