package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdrx implements zzepq<zzdru> {
    private final zzeqd<zzdrw> zzeuy;
    private final zzeqd<zzdry> zzgkm;
    private final zzeqd<zzdrl> zzhqf;

    public zzdrx(zzeqd<zzdrl> zzeqdVar, zzeqd<zzdry> zzeqdVar2, zzeqd<zzdrw> zzeqdVar3) {
        this.zzhqf = zzeqdVar;
        this.zzgkm = zzeqdVar2;
        this.zzeuy = zzeqdVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdru(this.zzhqf.get(), this.zzgkm.get(), this.zzeuy.get());
    }
}
