package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfn implements zzepq<zzcfk> {
    private final zzeqd<String> zzfxh;
    private final zzeqd<zzcbi> zzgbf;
    private final zzeqd<zzcaz> zzggy;

    private zzcfn(zzeqd<String> zzeqdVar, zzeqd<zzcaz> zzeqdVar2, zzeqd<zzcbi> zzeqdVar3) {
        this.zzfxh = zzeqdVar;
        this.zzggy = zzeqdVar2;
        this.zzgbf = zzeqdVar3;
    }

    public static zzcfn zzr(zzeqd<String> zzeqdVar, zzeqd<zzcaz> zzeqdVar2, zzeqd<zzcbi> zzeqdVar3) {
        return new zzcfn(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcfk(this.zzfxh.get(), this.zzggy.get(), this.zzgbf.get());
    }
}
