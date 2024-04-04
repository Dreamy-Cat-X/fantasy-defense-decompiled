package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbxc implements zzepq<zzbxb> {
    private final zzeqd<Set<zzbxf<zzbwy>>> zzftl;

    private zzbxc(zzeqd<Set<zzbxf<zzbwy>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbxc zzt(zzeqd<Set<zzbxf<zzbwy>>> zzeqdVar) {
        return new zzbxc(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbxb(this.zzftl.get());
    }
}
