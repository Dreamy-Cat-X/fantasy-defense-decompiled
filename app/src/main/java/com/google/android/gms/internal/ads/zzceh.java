package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzceh implements zzepq<zzcdw> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzcdr> zzfft;
    private final zzeqd<zzcen> zzffw;
    private final zzeqd<zzayt> zzfov;
    private final zzeqd<ScheduledExecutorService> zzfqc;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzef> zzgbg;
    private final zzeqd<com.google.android.gms.ads.internal.zzb> zzggo;
    private final zzeqd<zztu> zzggp;

    public zzceh(zzeqd<Context> zzeqdVar, zzeqd<zzcdr> zzeqdVar2, zzeqd<zzef> zzeqdVar3, zzeqd<zzayt> zzeqdVar4, zzeqd<com.google.android.gms.ads.internal.zzb> zzeqdVar5, zzeqd<zztu> zzeqdVar6, zzeqd<Executor> zzeqdVar7, zzeqd<zzdmx> zzeqdVar8, zzeqd<zzcen> zzeqdVar9, zzeqd<ScheduledExecutorService> zzeqdVar10) {
        this.zzeuo = zzeqdVar;
        this.zzfft = zzeqdVar2;
        this.zzgbg = zzeqdVar3;
        this.zzfov = zzeqdVar4;
        this.zzggo = zzeqdVar5;
        this.zzggp = zzeqdVar6;
        this.zzeuj = zzeqdVar7;
        this.zzftm = zzeqdVar8;
        this.zzffw = zzeqdVar9;
        this.zzfqc = zzeqdVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcdw(this.zzeuo.get(), this.zzfft.get(), this.zzgbg.get(), this.zzfov.get(), this.zzggo.get(), this.zzggp.get(), this.zzeuj.get(), this.zzftm.get(), this.zzffw.get(), this.zzfqc.get());
    }
}
