package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbpm implements zzepq<zzbxf<zzbtf>> {
    private final zzeqd<zzbpl> zzeui;
    private final zzbpn zzfwe;

    private zzbpm(zzbpn zzbpnVar, zzeqd<zzbpl> zzeqdVar) {
        this.zzfwe = zzbpnVar;
        this.zzeui = zzeqdVar;
    }

    public static zzbpm zza(zzbpn zzbpnVar, zzeqd<zzbpl> zzeqdVar) {
        return new zzbpm(zzbpnVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzeui.get(), zzayv.zzegn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
