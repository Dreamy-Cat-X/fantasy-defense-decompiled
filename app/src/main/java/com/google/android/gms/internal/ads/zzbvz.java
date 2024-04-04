package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvz implements zzepq<Set<zzbxf<zzbsg>>> {
    private final zzbvl zzfzc;

    private zzbvz(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbvz zzs(zzbvl zzbvlVar) {
        return new zzbvz(zzbvlVar);
    }

    public static Set<zzbxf<zzbsg>> zzt(zzbvl zzbvlVar) {
        return (Set) zzepw.zza(zzbvlVar.zzalx(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzt(this.zzfzc);
    }
}
