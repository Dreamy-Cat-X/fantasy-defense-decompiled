package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvt implements zzepq<Set<zzbxf<zzbus>>> {
    private final zzbvl zzfzc;

    private zzbvt(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbvt zzm(zzbvl zzbvlVar) {
        return new zzbvt(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
