package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbsa implements zzepq<zzbrr> {
    private final zzeqd<Set<zzbxf<zzbqr>>> zzftl;

    private zzbsa(zzeqd<Set<zzbxf<zzbqr>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbsa zzk(zzeqd<Set<zzbxf<zzbqr>>> zzeqdVar) {
        return new zzbsa(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbrr(this.zzftl.get());
    }
}
