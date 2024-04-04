package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbix implements zzepq<zzbis> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdnj> zzeyh;
    private final zzeqd<zzdsf> zzfff;
    private final zzeqd<zzacm> zzffu;
    private final zzeqd<ScheduledExecutorService> zzfqc;
    private final zzeqd<zzdmt> zzfqd;
    private final zzeqd<zzdmi> zzfqe;
    private final zzeqd<View> zzfqf;
    private final zzeqd<zzef> zzfqg;
    private final zzeqd<zzacn> zzfqh;

    private zzbix(zzeqd<Context> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<ScheduledExecutorService> zzeqdVar3, zzeqd<zzdmt> zzeqdVar4, zzeqd<zzdmi> zzeqdVar5, zzeqd<zzdsf> zzeqdVar6, zzeqd<zzdnj> zzeqdVar7, zzeqd<View> zzeqdVar8, zzeqd<zzef> zzeqdVar9, zzeqd<zzacm> zzeqdVar10, zzeqd<zzacn> zzeqdVar11) {
        this.zzeuo = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzfqc = zzeqdVar3;
        this.zzfqd = zzeqdVar4;
        this.zzfqe = zzeqdVar5;
        this.zzfff = zzeqdVar6;
        this.zzeyh = zzeqdVar7;
        this.zzfqf = zzeqdVar8;
        this.zzfqg = zzeqdVar9;
        this.zzffu = zzeqdVar10;
        this.zzfqh = zzeqdVar11;
    }

    public static zzbix zza(zzeqd<Context> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<ScheduledExecutorService> zzeqdVar3, zzeqd<zzdmt> zzeqdVar4, zzeqd<zzdmi> zzeqdVar5, zzeqd<zzdsf> zzeqdVar6, zzeqd<zzdnj> zzeqdVar7, zzeqd<View> zzeqdVar8, zzeqd<zzef> zzeqdVar9, zzeqd<zzacm> zzeqdVar10, zzeqd<zzacn> zzeqdVar11) {
        return new zzbix(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzeqdVar6, zzeqdVar7, zzeqdVar8, zzeqdVar9, zzeqdVar10, zzeqdVar11);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbis(this.zzeuo.get(), this.zzeuj.get(), this.zzfqc.get(), this.zzfqd.get(), this.zzfqe.get(), this.zzfff.get(), this.zzeyh.get(), this.zzfqf.get(), this.zzfqg.get(), this.zzffu.get(), this.zzfqh.get());
    }
}
