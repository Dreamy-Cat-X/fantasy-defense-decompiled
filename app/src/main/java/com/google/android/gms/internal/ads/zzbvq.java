package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvq implements zzepq<Set<zzbxf<com.google.android.gms.ads.internal.overlay.zzp>>> {
    private final zzbvl zzfzc;

    private zzbvq(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbvq zzi(zzbvl zzbvlVar) {
        return new zzbvq(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzfzc.zzamh(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
