package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbwa implements zzepq<Set<zzbxf<zzbsy>>> {
    private final zzbvl zzfzc;

    private zzbwa(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbwa zzu(zzbvl zzbvlVar) {
        return new zzbwa(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzfzc.zzamf(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
