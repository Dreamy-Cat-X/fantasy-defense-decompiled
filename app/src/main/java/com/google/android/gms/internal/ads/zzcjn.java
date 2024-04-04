package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcjn implements zzepq<zzcjk> {
    private final zzeqd<zzckd> zzevn;
    private final zzeqd<zzcjs> zzfbz;

    private zzcjn(zzeqd<zzcjs> zzeqdVar, zzeqd<zzckd> zzeqdVar2) {
        this.zzfbz = zzeqdVar;
        this.zzevn = zzeqdVar2;
    }

    public static zzcjn zzaf(zzeqd<zzcjs> zzeqdVar, zzeqd<zzckd> zzeqdVar2) {
        return new zzcjn(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcjk(this.zzfbz.get(), this.zzevn.get());
    }
}
