package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzccn implements zzepq<zzccl> {
    private final zzeqd<zzcfp> zzfal;
    private final zzeqd<Clock> zzfra;

    public zzccn(zzeqd<zzcfp> zzeqdVar, zzeqd<Clock> zzeqdVar2) {
        this.zzfal = zzeqdVar;
        this.zzfra = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzccl(this.zzfal.get(), this.zzfra.get());
    }
}
