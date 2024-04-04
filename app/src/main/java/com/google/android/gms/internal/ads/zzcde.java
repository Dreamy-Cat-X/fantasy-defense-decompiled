package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcde implements zzepq<zzcdf> {
    private final zzeqd<zzcbm> zzexs;
    private final zzeqd<zzcbi> zzgbf;

    public zzcde(zzeqd<zzcbi> zzeqdVar, zzeqd<zzcbm> zzeqdVar2) {
        this.zzgbf = zzeqdVar;
        this.zzexs = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcdf(this.zzgbf.get(), this.zzexs.get());
    }
}
