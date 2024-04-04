package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbym implements zzepq<zzbxf<zzbsg>> {
    private final zzeqd<zzbzn> zzfry;
    private final zzbye zzfzr;

    private zzbym(zzbye zzbyeVar, zzeqd<zzbzn> zzeqdVar) {
        this.zzfzr = zzbyeVar;
        this.zzfry = zzeqdVar;
    }

    public static zzbym zzc(zzbye zzbyeVar, zzeqd<zzbzn> zzeqdVar) {
        return new zzbym(zzbyeVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzfry.get(), zzayv.zzegm), "Cannot return null from a non-@Nullable @Provides method");
    }
}
