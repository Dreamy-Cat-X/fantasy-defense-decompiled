package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdol implements zzepq<zzayc> {
    private final zzdoh zzhku;
    private final zzeqd<zzdof> zzhkv;

    private zzdol(zzdoh zzdohVar, zzeqd<zzdof> zzeqdVar) {
        this.zzhku = zzdohVar;
        this.zzhkv = zzeqdVar;
    }

    public static zzdol zzc(zzdoh zzdohVar, zzeqd<zzdof> zzeqdVar) {
        return new zzdol(zzdohVar, zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzayc) zzepw.zza(this.zzhkv.get().zzeaa, "Cannot return null from a non-@Nullable @Provides method");
    }
}
