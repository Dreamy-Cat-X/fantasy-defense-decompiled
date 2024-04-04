package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcmg implements zzepq<zzcme> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<ScheduledExecutorService> zzfqc;
    private final zzeqd<zzcmu> zzgmd;
    private final zzeqd<zzcns> zzgme;

    public zzcmg(zzeqd<ScheduledExecutorService> zzeqdVar, zzeqd<zzdzk> zzeqdVar2, zzeqd<zzcmu> zzeqdVar3, zzeqd<zzcns> zzeqdVar4) {
        this.zzfqc = zzeqdVar;
        this.zzeuj = zzeqdVar2;
        this.zzgmd = zzeqdVar3;
        this.zzgme = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcme(this.zzfqc.get(), this.zzeuj.get(), this.zzgmd.get(), zzepr.zzav(this.zzgme));
    }
}
