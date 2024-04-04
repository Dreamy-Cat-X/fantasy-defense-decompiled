package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdny implements zzepq<zzbxf<zzbqw>> {
    private final zzeqd<zzdob> zzfvt;
    private final zzdnz zzhkr;

    private zzdny(zzdnz zzdnzVar, zzeqd<zzdob> zzeqdVar) {
        this.zzhkr = zzdnzVar;
        this.zzfvt = zzeqdVar;
    }

    public static zzdny zza(zzdnz zzdnzVar, zzeqd<zzdob> zzeqdVar) {
        return new zzdny(zzdnzVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzbxf) zzepw.zza(new zzbxf(this.zzfvt.get(), zzayv.zzegn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
