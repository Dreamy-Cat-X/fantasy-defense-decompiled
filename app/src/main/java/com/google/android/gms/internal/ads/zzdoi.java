package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdoi implements zzepq<Context> {
    private final zzdoh zzhku;
    private final zzeqd<zzdof> zzhkv;

    private zzdoi(zzdoh zzdohVar, zzeqd<zzdof> zzeqdVar) {
        this.zzhku = zzdohVar;
        this.zzhkv = zzeqdVar;
    }

    public static zzdoi zzb(zzdoh zzdohVar, zzeqd<zzdof> zzeqdVar) {
        return new zzdoi(zzdohVar, zzeqdVar);
    }

    public static Context zzb(zzdoh zzdohVar, zzdof zzdofVar) {
        return (Context) zzepw.zza(zzdofVar.zzaaf, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzb(this.zzhku, this.zzhkv.get());
    }
}
