package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbwh implements zzepq<Set<zzbxf<zzbxk>>> {
    private final zzbvl zzfzc;

    private zzbwh(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbwh zzab(zzbvl zzbvlVar) {
        return new zzbwh(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
