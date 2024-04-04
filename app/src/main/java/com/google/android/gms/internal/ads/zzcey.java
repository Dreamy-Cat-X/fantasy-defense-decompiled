package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcey implements zzepq<zzcen> {
    private final zzeqd<Executor> zzftf;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzcgx> zzgev;

    public zzcey(zzeqd<zzdmx> zzeqdVar, zzeqd<Executor> zzeqdVar2, zzeqd<zzcgx> zzeqdVar3) {
        this.zzftm = zzeqdVar;
        this.zzftf = zzeqdVar2;
        this.zzgev = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcen(this.zzftm.get(), this.zzftf.get(), this.zzgev.get());
    }
}
