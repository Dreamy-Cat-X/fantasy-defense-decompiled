package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzchr implements zzepq<zzbxf<zzbrm>> {
    private final zzeqd<zzchm> zzfry;
    private final zzcho zzgir;

    private zzchr(zzcho zzchoVar, zzeqd<zzchm> zzeqdVar) {
        this.zzgir = zzchoVar;
        this.zzfry = zzeqdVar;
    }

    public static zzchr zza(zzcho zzchoVar, zzeqd<zzchm> zzeqdVar) {
        return new zzchr(zzchoVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzfry.get(), zzayv.zzegm), "Cannot return null from a non-@Nullable @Provides method");
    }
}
