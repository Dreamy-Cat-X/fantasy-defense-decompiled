package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcbg implements zzepq<zzcbh> {
    private final zzeqd<zzcax> zzgck;

    private zzcbg(zzeqd<zzcax> zzeqdVar) {
        this.zzgck = zzeqdVar;
    }

    public static zzcbg zzz(zzeqd<zzcax> zzeqdVar) {
        return new zzcbg(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcbh(this.zzgck.get());
    }
}
