package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvp implements zzepq<zzbqu> {
    private final zzbvl zzfzc;
    private final zzeqd<Set<zzbxf<zzbqw>>> zzfzd;

    private zzbvp(zzbvl zzbvlVar, zzeqd<Set<zzbxf<zzbqw>>> zzeqdVar) {
        this.zzfzc = zzbvlVar;
        this.zzfzd = zzeqdVar;
    }

    public static zzbvp zza(zzbvl zzbvlVar, zzeqd<Set<zzbxf<zzbqw>>> zzeqdVar) {
        return new zzbvp(zzbvlVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbqu) zzepw.zza(this.zzfzc.zzc(this.zzfzd.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
