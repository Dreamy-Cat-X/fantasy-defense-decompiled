package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzblr implements zzepq<zzbxf<zzbsg>> {
    private final zzeqd<zzbmo> zzfry;
    private final zzble zzftk;

    public zzblr(zzble zzbleVar, zzeqd<zzbmo> zzeqdVar) {
        this.zzftk = zzbleVar;
        this.zzfry = zzeqdVar;
    }

    public static zzbxf<zzbsg> zza(zzble zzbleVar, zzbmo zzbmoVar) {
        return (zzbxf) zzepw.zza(new zzbxf(zzbmoVar, zzayv.zzegm), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzftk, this.zzfry.get());
    }
}
