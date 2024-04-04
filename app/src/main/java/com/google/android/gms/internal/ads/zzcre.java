package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcre implements zzepq<zzcrb> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzayt> zzfxl;
    private final zzeqd<zzcgx> zzgev;
    private final zzeqd<zzbkm> zzgro;

    public zzcre(zzeqd<zzbkm> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<Executor> zzeqdVar3, zzeqd<zzcgx> zzeqdVar4, zzeqd<zzdmx> zzeqdVar5, zzeqd<zzayt> zzeqdVar6) {
        this.zzgro = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzftf = zzeqdVar3;
        this.zzgev = zzeqdVar4;
        this.zzftm = zzeqdVar5;
        this.zzfxl = zzeqdVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcrb(this.zzgro.get(), this.zzeuo.get(), this.zzftf.get(), this.zzgev.get(), this.zzftm.get(), this.zzfxl.get());
    }
}
