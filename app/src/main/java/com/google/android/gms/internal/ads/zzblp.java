package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzblp implements zzepq<Set<zzbxf<zzbsg>>> {
    private final zzeqd<zzbmq> zzfry;
    private final zzble zzftk;

    public zzblp(zzble zzbleVar, zzeqd<zzbmq> zzeqdVar) {
        this.zzftk = zzbleVar;
        this.zzfry = zzeqdVar;
    }

    public static Set<zzbxf<zzbsg>> zza(zzble zzbleVar, zzbmq zzbmqVar) {
        return (Set) zzepw.zza(Collections.singleton(new zzbxf(zzbmqVar, zzayv.zzegn)), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzftk, this.zzfry.get());
    }
}
