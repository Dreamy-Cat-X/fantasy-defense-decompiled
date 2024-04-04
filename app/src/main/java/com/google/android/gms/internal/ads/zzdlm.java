package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdlm implements zzepq<zzdkp> {
    private final zzeqd<zzdok> zzheh;

    private zzdlm(zzeqd<zzdok> zzeqdVar) {
        this.zzheh = zzeqdVar;
    }

    public static zzdlm zzas(zzeqd<zzdok> zzeqdVar) {
        return new zzdlm(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdkp(this.zzheh.get());
    }
}
