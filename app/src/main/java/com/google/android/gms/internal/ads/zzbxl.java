package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbxl implements zzepq<zzbxj> {
    private final zzeqd<Set<zzbxf<zzbxk>>> zzftl;

    private zzbxl(zzeqd<Set<zzbxf<zzbxk>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbxl zzu(zzeqd<Set<zzbxf<zzbxk>>> zzeqdVar) {
        return new zzbxl(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbxj(this.zzftl.get());
    }
}
