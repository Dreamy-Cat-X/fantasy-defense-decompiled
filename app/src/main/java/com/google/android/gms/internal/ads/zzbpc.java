package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpc implements zzepq<zzbxf<com.google.android.gms.ads.internal.overlay.zzp>> {
    private final zzeqd<zzbns> zzfry;
    private final zzbou zzfwc;

    private zzbpc(zzbou zzbouVar, zzeqd<zzbns> zzeqdVar) {
        this.zzfwc = zzbouVar;
        this.zzfry = zzeqdVar;
    }

    public static zzbpc zza(zzbou zzbouVar, zzeqd<zzbns> zzeqdVar) {
        return new zzbpc(zzbouVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzfry.get(), zzayv.zzegn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
