package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbsd implements zzepq<zzbsb> {
    private final zzeqd<Set<zzbxf<zzbsg>>> zzftl;

    private zzbsd(zzeqd<Set<zzbxf<zzbsg>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbsd zzl(zzeqd<Set<zzbxf<zzbsg>>> zzeqdVar) {
        return new zzbsd(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbsb(this.zzftl.get());
    }
}
