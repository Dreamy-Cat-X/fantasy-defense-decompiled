package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvs implements zzepq<Set<zzbxf<zzuz>>> {
    private final zzbvl zzfzc;

    private zzbvs(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbvs zzl(zzbvl zzbvlVar) {
        return new zzbvs(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzfzc.zzamc(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
