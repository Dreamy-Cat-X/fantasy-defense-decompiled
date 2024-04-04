package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbyp implements zzepq<zzbxf<com.google.android.gms.ads.internal.overlay.zzp>> {
    private final zzeqd<zzbzn> zzfry;
    private final zzbye zzfzr;

    private zzbyp(zzbye zzbyeVar, zzeqd<zzbzn> zzeqdVar) {
        this.zzfzr = zzbyeVar;
        this.zzfry = zzeqdVar;
    }

    public static zzbyp zzd(zzbye zzbyeVar, zzeqd<zzbzn> zzeqdVar) {
        return new zzbyp(zzbyeVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzfry.get(), zzayv.zzegm), "Cannot return null from a non-@Nullable @Provides method");
    }
}
