package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbza implements zzepq<zzbzb> {
    private final zzeqd<zzbso> zzezv;
    private final zzeqd<zzbxb> zzfjv;

    private zzbza(zzeqd<zzbso> zzeqdVar, zzeqd<zzbxb> zzeqdVar2) {
        this.zzezv = zzeqdVar;
        this.zzfjv = zzeqdVar2;
    }

    public static zzbza zzt(zzeqd<zzbso> zzeqdVar, zzeqd<zzbxb> zzeqdVar2) {
        return new zzbza(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbzb(this.zzezv.get(), this.zzfjv.get());
    }
}
