package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbvi implements zzepq<zzbuz> {
    private final zzeqd<Set<zzbxf<zzbvh>>> zzftl;

    private zzbvi(zzeqd<Set<zzbxf<zzbvh>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbvi zzs(zzeqd<Set<zzbxf<zzbvh>>> zzeqdVar) {
        return new zzbvi(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbuz(this.zzftl.get());
    }
}
