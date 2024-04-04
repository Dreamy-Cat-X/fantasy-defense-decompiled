package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcki implements zzepq<zzckj> {
    private final zzeqd<Clock> zzfra;

    public zzcki(zzeqd<Clock> zzeqdVar) {
        this.zzfra = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzckj(this.zzfra.get());
    }
}
