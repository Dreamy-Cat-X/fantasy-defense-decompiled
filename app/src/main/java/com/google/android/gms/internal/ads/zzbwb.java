package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbwb implements zzepq<Set<zzbxf<zzbsl>>> {
    private final zzbvl zzfzc;

    private zzbwb(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbwb zzv(zzbvl zzbvlVar) {
        return new zzbwb(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzfzc.zzame(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
