package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdga implements zzepq<zzdfw> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzaxo> zzewc;
    private final zzeqd<ScheduledExecutorService> zzfqc;
    private final zzeqd<zzaxs> zzgza;
    private final zzeqd<Integer> zzhcg;

    public zzdga(zzeqd<zzaxo> zzeqdVar, zzeqd<Integer> zzeqdVar2, zzeqd<Context> zzeqdVar3, zzeqd<zzaxs> zzeqdVar4, zzeqd<ScheduledExecutorService> zzeqdVar5, zzeqd<Executor> zzeqdVar6) {
        this.zzewc = zzeqdVar;
        this.zzhcg = zzeqdVar2;
        this.zzeuo = zzeqdVar3;
        this.zzgza = zzeqdVar4;
        this.zzfqc = zzeqdVar5;
        this.zzeuj = zzeqdVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdfw(this.zzewc.get(), this.zzhcg.get().intValue(), this.zzeuo.get(), this.zzgza.get(), this.zzfqc.get(), this.zzeuj.get());
    }
}
