package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcxu implements zzepq<zzcxf> {
    private final zzeqd<zzdro> zzghw;

    private zzcxu(zzeqd<zzdro> zzeqdVar) {
        this.zzghw = zzeqdVar;
    }

    public static zzcxu zzak(zzeqd<zzdro> zzeqdVar) {
        return new zzcxu(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcxf(this.zzghw.get());
    }
}
