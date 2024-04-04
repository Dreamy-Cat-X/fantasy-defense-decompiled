package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbql implements zzepq<zzbqm> {
    private final zzeqd<zzcqx> zzfcr;
    private final zzeqd<zzdmi> zzfue;
    private final zzeqd<String> zzfxh;

    private zzbql(zzeqd<zzdmi> zzeqdVar, zzeqd<String> zzeqdVar2, zzeqd<zzcqx> zzeqdVar3) {
        this.zzfue = zzeqdVar;
        this.zzfxh = zzeqdVar2;
        this.zzfcr = zzeqdVar3;
    }

    public static zzbql zzm(zzeqd<zzdmi> zzeqdVar, zzeqd<String> zzeqdVar2, zzeqd<zzcqx> zzeqdVar3) {
        return new zzbql(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzbqm(this.zzfue.get(), this.zzfxh.get(), this.zzfcr.get());
    }
}
