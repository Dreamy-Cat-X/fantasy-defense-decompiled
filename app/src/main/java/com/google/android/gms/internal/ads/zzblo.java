package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzblo implements zzepq<zzbxf<zzbrj>> {
    private final zzeqd<zzbmo> zzfry;
    private final zzble zzftk;

    public zzblo(zzble zzbleVar, zzeqd<zzbmo> zzeqdVar) {
        this.zzftk = zzbleVar;
        this.zzfry = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzfry.get(), zzayv.zzegm), "Cannot return null from a non-@Nullable @Provides method");
    }
}
