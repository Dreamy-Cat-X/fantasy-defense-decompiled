package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdog implements zzepq<com.google.android.gms.ads.internal.util.zzf> {
    private final zzdoh zzhku;
    private final zzeqd<zzdof> zzhkv;

    private zzdog(zzdoh zzdohVar, zzeqd<zzdof> zzeqdVar) {
        this.zzhku = zzdohVar;
        this.zzhkv = zzeqdVar;
    }

    public static zzdog zza(zzdoh zzdohVar, zzeqd<zzdof> zzeqdVar) {
        return new zzdog(zzdohVar, zzeqdVar);
    }

    public static com.google.android.gms.ads.internal.util.zzf zza(zzdoh zzdohVar, zzdof zzdofVar) {
        return (com.google.android.gms.ads.internal.util.zzf) zzepw.zza(zzdofVar.zzebk, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zza(this.zzhku, this.zzhkv.get());
    }
}
