package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfc implements zzepq<zzcfb> {
    private final zzeqd<zzcbi> zzgbf;
    private final zzeqd<zzcaz> zzggy;

    private zzcfc(zzeqd<zzcaz> zzeqdVar, zzeqd<zzcbi> zzeqdVar2) {
        this.zzggy = zzeqdVar;
        this.zzgbf = zzeqdVar2;
    }

    public static zzcfc zzv(zzeqd<zzcaz> zzeqdVar, zzeqd<zzcbi> zzeqdVar2) {
        return new zzcfc(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcfb(this.zzggy.get(), this.zzgbf.get());
    }
}
