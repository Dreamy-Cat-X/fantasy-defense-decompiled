package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbnc<AdT> implements zzepq<zzbnd<AdT>> {
    private final zzeqd<Map<String, zzcqq<AdT>>> zzfuq;

    private zzbnc(zzeqd<Map<String, zzcqq<AdT>>> zzeqdVar) {
        this.zzfuq = zzeqdVar;
    }

    public static <AdT> zzbnc<AdT> zzd(zzeqd<Map<String, zzcqq<AdT>>> zzeqdVar) {
        return new zzbnc<>(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbnd(this.zzfuq.get());
    }
}
