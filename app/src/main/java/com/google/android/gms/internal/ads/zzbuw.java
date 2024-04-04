package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbuw implements zzepq<zzbur> {
    private final zzeqd<Set<zzbxf<zzbuv>>> zzftl;

    private zzbuw(zzeqd<Set<zzbxf<zzbuv>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbuw zzq(zzeqd<Set<zzbxf<zzbuv>>> zzeqdVar) {
        return new zzbuw(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbur(this.zzftl.get());
    }
}
