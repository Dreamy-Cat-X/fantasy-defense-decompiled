package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzczz implements zzepq<zzdaa> {
    private final zzeqd<zzdmx> zzftm;

    private zzczz(zzeqd<zzdmx> zzeqdVar) {
        this.zzftm = zzeqdVar;
    }

    public static zzczz zzal(zzeqd<zzdmx> zzeqdVar) {
        return new zzczz(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdaa(this.zzftm.get());
    }
}
