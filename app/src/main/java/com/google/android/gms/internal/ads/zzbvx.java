package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvx implements zzepq<Set<zzbxf<zzbrj>>> {
    private final zzbvl zzfzc;

    private zzbvx(zzbvl zzbvlVar) {
        this.zzfzc = zzbvlVar;
    }

    public static zzbvx zzq(zzbvl zzbvlVar) {
        return new zzbvx(zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzfzc.zzamd(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
