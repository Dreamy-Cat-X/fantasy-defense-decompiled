package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbup implements zzepq<zzbun> {
    private final zzeqd<Set<zzbxf<zzbus>>> zzftl;

    private zzbup(zzeqd<Set<zzbxf<zzbus>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbup zzp(zzeqd<Set<zzbxf<zzbus>>> zzeqdVar) {
        return new zzbup(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbun(this.zzftl.get());
    }
}
