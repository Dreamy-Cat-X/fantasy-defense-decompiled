package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvr implements zzepq<Set<zzbxf<zzbsg>>> {
    private final zzbvl zzfzc;

    private zzbvr(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbvr zzj(zzbvl zzbvlVar) {
        return new zzbvr(zzbvlVar);
    }

    public static Set<zzbxf<zzbsg>> zzk(zzbvl zzbvlVar) {
        return (Set) zzepw.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzk(this.zzfzc);
    }
}
