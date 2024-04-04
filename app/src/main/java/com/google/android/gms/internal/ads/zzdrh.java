package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdrh implements zzepq<zzdqy> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<zzdrb> zzfcm;
    private final zzeqd<ScheduledExecutorService> zzfst;

    private zzdrh(zzeqd<zzdzk> zzeqdVar, zzeqd<ScheduledExecutorService> zzeqdVar2, zzeqd<zzdrb> zzeqdVar3) {
        this.zzeuj = zzeqdVar;
        this.zzfst = zzeqdVar2;
        this.zzfcm = zzeqdVar3;
    }

    public static zzdrh zzae(zzeqd<zzdzk> zzeqdVar, zzeqd<ScheduledExecutorService> zzeqdVar2, zzeqd<zzdrb> zzeqdVar3) {
        return new zzdrh(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdqy(this.zzeuj.get(), this.zzfst.get(), this.zzfcm.get());
    }
}
