package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbwe implements zzepq<Set<zzbxf<zzqv>>> {
    private final zzbvl zzfzc;

    private zzbwe(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbwe zzy(zzbvl zzbvlVar) {
        return new zzbwe(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
