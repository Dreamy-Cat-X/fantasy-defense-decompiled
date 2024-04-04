package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzblj implements zzepq<zzbsb> {
    private final zzble zzftk;
    private final zzeqd<Set<zzbxf<zzbsg>>> zzftl;

    public zzblj(zzble zzbleVar, zzeqd<Set<zzbxf<zzbsg>>> zzeqdVar) {
        this.zzftk = zzbleVar;
        this.zzftl = zzeqdVar;
    }

    public static zzbsb zza(zzble zzbleVar, Set<zzbxf<zzbsg>> set) {
        return (zzbsb) zzepw.zza(zzbleVar.zza(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzftk, this.zzftl.get());
    }
}
