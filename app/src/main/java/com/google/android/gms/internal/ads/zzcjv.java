package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcjv implements zzepq<zzcjs> {
    private final zzeqd<zzckd> zzevn;
    private final zzeqd<zzayc> zzfby;

    private zzcjv(zzeqd<zzckd> zzeqdVar, zzeqd<zzayc> zzeqdVar2) {
        this.zzevn = zzeqdVar;
        this.zzfby = zzeqdVar2;
    }

    public static zzcjv zzag(zzeqd<zzckd> zzeqdVar, zzeqd<zzayc> zzeqdVar2) {
        return new zzcjv(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcjs(this.zzevn.get(), this.zzfby.get());
    }
}
