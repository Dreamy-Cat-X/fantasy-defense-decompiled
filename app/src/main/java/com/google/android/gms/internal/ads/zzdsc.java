package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdsc implements zzepq<zzdsd> {
    private final zzeqd<zzdrw> zzeuy;
    private final zzeqd<zzdry> zzgkm;

    public zzdsc(zzeqd<zzdry> zzeqdVar, zzeqd<zzdrw> zzeqdVar2) {
        this.zzgkm = zzeqdVar;
        this.zzeuy = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzdsd(this.zzgkm.get(), this.zzeuy.get());
    }
}
