package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdct implements zzepq<zzdcr> {
    private final zzeqd<zzdzk> zzeuj;
    private final zzeqd<zzdmg> zzgsi;

    private zzdct(zzeqd<zzdzk> zzeqdVar, zzeqd<zzdmg> zzeqdVar2) {
        this.zzeuj = zzeqdVar;
        this.zzgsi = zzeqdVar2;
    }

    public static zzdct zzaw(zzeqd<zzdzk> zzeqdVar, zzeqd<zzdmg> zzeqdVar2) {
        return new zzdct(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdcr(this.zzeuj.get(), this.zzgsi.get());
    }
}
