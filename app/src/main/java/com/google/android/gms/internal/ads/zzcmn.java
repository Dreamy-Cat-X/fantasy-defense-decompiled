package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcmn implements zzepq<zzcmj> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<zzcpi> zzfci;
    private final zzeqd<zzcll> zzfgj;
    private final zzeqd<ScheduledExecutorService> zzfqc;
    private final zzeqd<zzdmx> zzftm;

    private zzcmn(zzeqd<zzdmx> zzeqdVar, zzeqd<zzcll> zzeqdVar2, zzeqd<zzdzk> zzeqdVar3, zzeqd<ScheduledExecutorService> zzeqdVar4, zzeqd<zzcpi> zzeqdVar5) {
        this.zzftm = zzeqdVar;
        this.zzfgj = zzeqdVar2;
        this.zzeuj = zzeqdVar3;
        this.zzfqc = zzeqdVar4;
        this.zzfci = zzeqdVar5;
    }

    public static zzcmn zzf(zzeqd<zzdmx> zzeqdVar, zzeqd<zzcll> zzeqdVar2, zzeqd<zzdzk> zzeqdVar3, zzeqd<ScheduledExecutorService> zzeqdVar4, zzeqd<zzcpi> zzeqdVar5) {
        return new zzcmn(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcmj(this.zzftm.get(), this.zzfgj.get(), this.zzeuj.get(), this.zzfqc.get(), this.zzfci.get());
    }
}
