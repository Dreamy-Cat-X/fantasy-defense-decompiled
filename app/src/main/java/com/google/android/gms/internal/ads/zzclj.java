package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzclj implements zzepq<zzckx> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzchu> zzeuk;
    private final zzeqd<zzckh> zzevo;
    private final zzeqd<zzbwl> zzevs;
    private final zzeqd<ScheduledExecutorService> zzfqc;
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<Executor> zzftf;
    private final zzeqd<Context> zzglv;
    private final zzeqd<WeakReference<Context>> zzglw;

    public zzclj(zzeqd<Executor> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<WeakReference<Context>> zzeqdVar3, zzeqd<Executor> zzeqdVar4, zzeqd<zzchu> zzeqdVar5, zzeqd<ScheduledExecutorService> zzeqdVar6, zzeqd<zzckh> zzeqdVar7, zzeqd<zzayt> zzeqdVar8, zzeqd<zzbwl> zzeqdVar9) {
        this.zzftf = zzeqdVar;
        this.zzglv = zzeqdVar2;
        this.zzglw = zzeqdVar3;
        this.zzeuj = zzeqdVar4;
        this.zzeuk = zzeqdVar5;
        this.zzfqc = zzeqdVar6;
        this.zzevo = zzeqdVar7;
        this.zzfrk = zzeqdVar8;
        this.zzevs = zzeqdVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzckx(this.zzftf.get(), this.zzglv.get(), this.zzglw.get(), this.zzeuj.get(), this.zzeuk.get(), this.zzfqc.get(), this.zzevo.get(), this.zzfrk.get(), this.zzevs.get());
    }
}
