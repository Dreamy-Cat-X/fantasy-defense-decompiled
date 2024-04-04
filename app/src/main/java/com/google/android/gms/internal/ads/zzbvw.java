package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvw implements zzepq<Set<zzbxf<zzbqr>>> {
    private final zzbvl zzfzc;

    private zzbvw(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbvw zzp(zzbvl zzbvlVar) {
        return new zzbvw(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzfzc.zzalw(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
