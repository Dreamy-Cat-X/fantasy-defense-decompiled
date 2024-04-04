package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcav implements zzepq<zzbxf<zzbrj>> {
    private final zzeqd<zzcdf> zzfry;
    private final zzcan zzgbi;

    public zzcav(zzcan zzcanVar, zzeqd<zzcdf> zzeqdVar) {
        this.zzgbi = zzcanVar;
        this.zzfry = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzfry.get(), zzayv.zzegn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
