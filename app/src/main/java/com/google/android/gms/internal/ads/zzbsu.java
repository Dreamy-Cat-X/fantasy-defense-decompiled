package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbsu implements zzepq<zzbso> {
    private final zzeqd<Set<zzbxf<com.google.android.gms.ads.internal.overlay.zzp>>> zzftl;

    private zzbsu(zzeqd<Set<zzbxf<com.google.android.gms.ads.internal.overlay.zzp>>> zzeqdVar) {
        this.zzftl = zzeqdVar;
    }

    public static zzbsu zzo(zzeqd<Set<zzbxf<com.google.android.gms.ads.internal.overlay.zzp>>> zzeqdVar) {
        return new zzbsu(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbso(this.zzftl.get());
    }
}
