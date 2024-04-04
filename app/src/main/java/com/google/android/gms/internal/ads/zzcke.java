package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcke implements zzepq<zzckd> {
    private final zzeqd<Executor> zzeuj;
    private final zzeqd<zzdrw> zzeuy;
    private final zzeqd<zzayq> zzewa;
    private final zzeqd<zzdry> zzgkm;

    public zzcke(zzeqd<Executor> zzeqdVar, zzeqd<zzayq> zzeqdVar2, zzeqd<zzdrw> zzeqdVar3, zzeqd<zzdry> zzeqdVar4) {
        this.zzeuj = zzeqdVar;
        this.zzewa = zzeqdVar2;
        this.zzeuy = zzeqdVar3;
        this.zzgkm = zzeqdVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzckd(this.zzeuj.get(), this.zzewa.get(), this.zzeuy.get(), this.zzgkm.get());
    }
}
