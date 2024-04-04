package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcrs implements zzepq<zzcrn> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzcgx> zzgev;
    private final zzeqd<zzblx> zzgro;
    private final zzeqd<zzdvo<zzdmi, com.google.android.gms.ads.internal.util.zzag>> zzgry;

    public zzcrs(zzeqd<zzblx> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<Executor> zzeqdVar3, zzeqd<zzcgx> zzeqdVar4, zzeqd<zzdmx> zzeqdVar5, zzeqd<zzdvo<zzdmi, com.google.android.gms.ads.internal.util.zzag>> zzeqdVar6) {
        this.zzgro = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzftf = zzeqdVar3;
        this.zzgev = zzeqdVar4;
        this.zzftm = zzeqdVar5;
        this.zzgry = zzeqdVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcrn(this.zzgro.get(), this.zzeuo.get(), this.zzftf.get(), this.zzgev.get(), this.zzftm.get(), this.zzgry.get());
    }
}
