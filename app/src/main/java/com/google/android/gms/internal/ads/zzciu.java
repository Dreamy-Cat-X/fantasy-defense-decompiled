package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzciu implements zzepq<zzcir> {
    private final zzeqd<zzdkd> zzfcv;
    private final zzeqd<zztu> zzghw;

    private zzciu(zzeqd<zztu> zzeqdVar, zzeqd<zzdkd> zzeqdVar2) {
        this.zzghw = zzeqdVar;
        this.zzfcv = zzeqdVar2;
    }

    public static zzciu zzad(zzeqd<zztu> zzeqdVar, zzeqd<zzdkd> zzeqdVar2) {
        return new zzciu(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcir(this.zzghw.get(), this.zzfcv.get());
    }
}
