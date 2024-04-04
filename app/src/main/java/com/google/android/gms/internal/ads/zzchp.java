package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzchp implements zzepq<zzchm> {
    private final zzeqd<zzbdh> zzftc;

    private zzchp(zzeqd<zzbdh> zzeqdVar) {
        this.zzftc = zzeqdVar;
    }

    public static zzchp zzaa(zzeqd<zzbdh> zzeqdVar) {
        return new zzchp(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzchm(this.zzftc.get());
    }
}
