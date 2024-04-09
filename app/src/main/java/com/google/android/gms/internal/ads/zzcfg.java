package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfg implements zzepq<zzcfh> {
    private final zzeqd<String> zzfxh;
    private final zzeqd<zzcbi> zzgbf;
    private final zzeqd<zzcaz> zzggy;

    private zzcfg(zzeqd<String> zzeqdVar, zzeqd<zzcaz> zzeqdVar2, zzeqd<zzcbi> zzeqdVar3) {
        this.zzfxh = zzeqdVar;
        this.zzggy = zzeqdVar2;
        this.zzgbf = zzeqdVar3;
    }

    public static zzcfg zzq(zzeqd<String> zzeqdVar, zzeqd<zzcaz> zzeqdVar2, zzeqd<zzcbi> zzeqdVar3) {
        return new zzcfg(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcfh(this.zzfxh.get(), this.zzggy.get(), this.zzgbf.get());
    }
}