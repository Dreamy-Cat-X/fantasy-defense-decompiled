package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbsm implements zzepq<zzbsk> {
    private final zzeqd<Set<zzbxf<zzbsl>>> zzftl;

    private zzbsm(zzeqd<Set<zzbxf<zzbsl>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbsm zzn(zzeqd<Set<zzbxf<zzbsl>>> zzeqdVar) {
        return new zzbsm(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbsk(this.zzftl.get());
    }
}
