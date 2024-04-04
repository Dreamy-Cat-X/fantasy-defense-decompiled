package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpj implements zzepq<zzbxf<zzbrm>> {
    private final zzeqd<zzbpu> zzeui;
    private final zzbou zzfwc;

    private zzbpj(zzbou zzbouVar, zzeqd<zzbpu> zzeqdVar) {
        this.zzfwc = zzbouVar;
        this.zzeui = zzeqdVar;
    }

    public static zzbpj zzc(zzbou zzbouVar, zzeqd<zzbpu> zzeqdVar) {
        return new zzbpj(zzbouVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzeui.get(), zzayv.zzegn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
