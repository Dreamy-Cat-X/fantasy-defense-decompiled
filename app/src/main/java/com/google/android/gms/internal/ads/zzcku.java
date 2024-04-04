package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcku implements zzepq<zzckv> {
    private final zzeqd<zzbff> zzeul;
    private final zzeqd<zzckj> zzghw;

    private zzcku(zzeqd<zzckj> zzeqdVar, zzeqd<zzbff> zzeqdVar2) {
        this.zzghw = zzeqdVar;
        this.zzeul = zzeqdVar2;
    }

    public static zzcku zzah(zzeqd<zzckj> zzeqdVar, zzeqd<zzbff> zzeqdVar2) {
        return new zzcku(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzckv(this.zzghw.get(), this.zzeul.get());
    }
}
