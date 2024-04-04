package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsl implements zzepq<zzcsh> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<zzblx> zzfkx;
    private final zzeqd<zzcrn> zzflb;
    private final zzeqd<ScheduledExecutorService> zzfqc;
    private final zzeqd<zzbqu> zzgso;

    public zzcsl(zzeqd<zzblx> zzeqdVar, zzeqd<zzcrn> zzeqdVar2, zzeqd<zzbqu> zzeqdVar3, zzeqd<ScheduledExecutorService> zzeqdVar4, zzeqd<zzdzk> zzeqdVar5) {
        this.zzfkx = zzeqdVar;
        this.zzflb = zzeqdVar2;
        this.zzgso = zzeqdVar3;
        this.zzfqc = zzeqdVar4;
        this.zzeuj = zzeqdVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcsh(this.zzfkx.get(), this.zzflb.get(), this.zzgso.get(), this.zzfqc.get(), this.zzeuj.get());
    }
}
