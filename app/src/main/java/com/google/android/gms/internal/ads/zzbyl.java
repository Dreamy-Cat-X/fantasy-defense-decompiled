package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbyl implements zzepq<Set<zzbxf<zzbuv>>> {
    private final zzeqd<zzbpr> zzfry;
    private final zzbye zzfzr;

    private zzbyl(zzbye zzbyeVar, zzeqd<zzbpr> zzeqdVar) {
        this.zzfzr = zzbyeVar;
        this.zzfry = zzeqdVar;
    }

    public static zzbyl zzb(zzbye zzbyeVar, zzeqd<zzbpr> zzeqdVar) {
        return new zzbyl(zzbyeVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(Collections.singleton(zzbxf.zzb(this.zzfry.get(), zzayv.zzegn)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
