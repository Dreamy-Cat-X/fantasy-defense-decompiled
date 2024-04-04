package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzblq implements zzepq<Set<zzbxf<zzqv>>> {
    private final zzeqd<zzbmq> zzfry;
    private final zzble zzftk;

    public zzblq(zzble zzbleVar, zzeqd<zzbmq> zzeqdVar) {
        this.zzftk = zzbleVar;
        this.zzfry = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(Collections.singleton(new zzbxf(this.zzfry.get(), zzayv.zzegn)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
