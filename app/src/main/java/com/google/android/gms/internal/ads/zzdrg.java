package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdrg implements zzepq<zzdrb> {
    private final zzeqd<Set<zzbxf<zzdre>>> zzftl;

    private zzdrg(zzeqd<Set<zzbxf<zzdre>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzdrg zzat(zzeqd<Set<zzbxf<zzdre>>> zzeqdVar) {
        return new zzdrg(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdrb(this.zzftl.get());
    }
}
