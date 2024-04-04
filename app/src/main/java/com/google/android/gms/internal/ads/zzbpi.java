package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpi implements zzepq<zzbxf<zzbsg>> {
    private final zzeqd<zzbpu> zzeui;
    private final zzbou zzfwc;

    private zzbpi(zzbou zzbouVar, zzeqd<zzbpu> zzeqdVar) {
        this.zzfwc = zzbouVar;
        this.zzeui = zzeqdVar;
    }

    public static zzbpi zzb(zzbou zzbouVar, zzeqd<zzbpu> zzeqdVar) {
        return new zzbpi(zzbouVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzeui.get(), zzayv.zzegn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
