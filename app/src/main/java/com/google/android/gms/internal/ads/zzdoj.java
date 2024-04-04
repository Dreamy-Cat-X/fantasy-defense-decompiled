package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdoj implements zzepq<zzdof> {
    private final zzeqd<zzdod> zzfqx;
    private final zzdoh zzhku;
    private final zzeqd<String> zzhkw;

    private zzdoj(zzdoh zzdohVar, zzeqd<zzdod> zzeqdVar, zzeqd<String> zzeqdVar2) {
        this.zzhku = zzdohVar;
        this.zzfqx = zzeqdVar;
        this.zzhkw = zzeqdVar2;
    }

    public static zzdoj zza(zzdoh zzdohVar, zzeqd<zzdod> zzeqdVar, zzeqd<String> zzeqdVar2) {
        return new zzdoj(zzdohVar, zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (zzdof) zzepw.zza(this.zzfqx.get().zzgu(this.zzhkw.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
