package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbrd implements zzepq<zzbrc> {
    private final zzeqd<Set<zzbxf<zzbrf>>> zzftl;

    private zzbrd(zzeqd<Set<zzbxf<zzbrf>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbrd zzh(zzeqd<Set<zzbxf<zzbrf>>> zzeqdVar) {
        return new zzbrd(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbrc(this.zzftl.get());
    }
}
