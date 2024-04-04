package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbps implements zzepq<zzbpr> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzbri> zzfwm;
    private final zzeqd<zzdmi> zzfwn;
    private final zzeqd<ScheduledExecutorService> zzfwo;

    private zzbps(zzeqd<zzbri> zzeqdVar, zzeqd<zzdmi> zzeqdVar2, zzeqd<ScheduledExecutorService> zzeqdVar3, zzeqd<Executor> zzeqdVar4) {
        this.zzfwm = zzeqdVar;
        this.zzfwn = zzeqdVar2;
        this.zzfwo = zzeqdVar3;
        this.zzeuj = zzeqdVar4;
    }

    public static zzbps zzb(zzeqd<zzbri> zzeqdVar, zzeqd<zzdmi> zzeqdVar2, zzeqd<ScheduledExecutorService> zzeqdVar3, zzeqd<Executor> zzeqdVar4) {
        return new zzbps(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbpr(this.zzfwm.get(), this.zzfwn.get(), this.zzfwo.get(), this.zzeuj.get());
    }
}
