package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcdd implements zzepq<zzccu> {
    private final zzeqd<zzcfp> zzfal;
    private final zzeqd<zzcgx> zzgev;

    public zzcdd(zzeqd<zzcgx> zzeqdVar, zzeqd<zzcfp> zzeqdVar2) {
        this.zzgev = zzeqdVar;
        this.zzfal = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzccu(this.zzgev.get(), this.zzfal.get());
    }
}
