package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbrk implements zzepq<zzbri> {
    private final zzeqd<Set<zzbxf<zzbrj>>> zzftl;

    private zzbrk(zzeqd<Set<zzbxf<zzbrj>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbrk zzi(zzeqd<Set<zzbxf<zzbrj>>> zzeqdVar) {
        return new zzbrk(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbri(this.zzftl.get());
    }
}
