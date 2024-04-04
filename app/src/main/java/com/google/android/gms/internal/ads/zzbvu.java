package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvu implements zzepq<Set<zzbxf<zzbrf>>> {
    private final zzbvl zzfzc;

    private zzbvu(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbvu zzn(zzbvl zzbvlVar) {
        return new zzbvu(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzfzc.zzalz(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
