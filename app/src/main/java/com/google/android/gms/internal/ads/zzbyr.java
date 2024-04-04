package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbyr implements zzepq<Set<zzbxf<zzbqr>>> {
    private final zzeqd<zzbpr> zzfry;
    private final zzbye zzfzr;

    private zzbyr(zzbye zzbyeVar, zzeqd<zzbpr> zzeqdVar) {
        this.zzfzr = zzbyeVar;
        this.zzfry = zzeqdVar;
    }

    public static zzbyr zze(zzbye zzbyeVar, zzeqd<zzbpr> zzeqdVar) {
        return new zzbyr(zzbyeVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (Set) zzepw.zza(this.zzfzr.zzb(this.zzfry.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
