package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzczj implements zzepq<zzcyv> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<ScheduledExecutorService> zzfqc;
    private final zzeqd<zzef> zzfqg;
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<zzdnr<zzcfp>> zzgta;
    private final zzeqd<zzbff> zzgyh;

    public zzczj(zzeqd<zzbff> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<zzef> zzeqdVar3, zzeqd<zzayt> zzeqdVar4, zzeqd<zzdnr<zzcfp>> zzeqdVar5, zzeqd<zzdzk> zzeqdVar6, zzeqd<ScheduledExecutorService> zzeqdVar7) {
        this.zzgyh = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzfqg = zzeqdVar3;
        this.zzfrk = zzeqdVar4;
        this.zzgta = zzeqdVar5;
        this.zzeuj = zzeqdVar6;
        this.zzfqc = zzeqdVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcyv(this.zzgyh.get(), this.zzeuo.get(), this.zzfqg.get(), this.zzfrk.get(), this.zzgta.get(), this.zzeuj.get(), this.zzfqc.get());
    }
}
