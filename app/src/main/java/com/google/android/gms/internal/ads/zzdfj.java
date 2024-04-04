package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfj implements zzepq<zzdfi> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzaxo> zzewc;
    private final zzeqd<ScheduledExecutorService> zzfqc;
    private final zzeqd<Integer> zzhcg;

    public zzdfj(zzeqd<zzaxo> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<ScheduledExecutorService> zzeqdVar3, zzeqd<Executor> zzeqdVar4, zzeqd<Integer> zzeqdVar5) {
        this.zzewc = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzfqc = zzeqdVar3;
        this.zzeuj = zzeqdVar4;
        this.zzhcg = zzeqdVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdfi(this.zzewc.get(), this.zzeuo.get(), this.zzfqc.get(), this.zzeuj.get(), this.zzhcg.get().intValue());
    }
}
