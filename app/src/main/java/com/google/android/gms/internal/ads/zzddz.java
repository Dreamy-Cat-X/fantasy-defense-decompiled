package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddz implements zzepq<zzddw> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzcwq> zzevk;
    private final zzeqd<ScheduledExecutorService> zzfqc;
    private final zzeqd<String> zzfrl;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzcwo> zzgul;

    private zzddz(zzeqd<zzdzk> zzeqdVar, zzeqd<ScheduledExecutorService> zzeqdVar2, zzeqd<String> zzeqdVar3, zzeqd<zzcwq> zzeqdVar4, zzeqd<Context> zzeqdVar5, zzeqd<zzdmx> zzeqdVar6, zzeqd<zzcwo> zzeqdVar7) {
        this.zzeuj = zzeqdVar;
        this.zzfqc = zzeqdVar2;
        this.zzfrl = zzeqdVar3;
        this.zzevk = zzeqdVar4;
        this.zzeuo = zzeqdVar5;
        this.zzftm = zzeqdVar6;
        this.zzgul = zzeqdVar7;
    }

    public static zzddz zzc(zzeqd<zzdzk> zzeqdVar, zzeqd<ScheduledExecutorService> zzeqdVar2, zzeqd<String> zzeqdVar3, zzeqd<zzcwq> zzeqdVar4, zzeqd<Context> zzeqdVar5, zzeqd<zzdmx> zzeqdVar6, zzeqd<zzcwo> zzeqdVar7) {
        return new zzddz(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5, zzeqdVar6, zzeqdVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzddw(this.zzeuj.get(), this.zzfqc.get(), this.zzfrl.get(), this.zzevk.get(), this.zzeuo.get(), this.zzftm.get(), this.zzgul.get());
    }
}
