package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcvm extends zzcvs {
    private final zzbur zzgun;

    public zzcvm(zzbqq zzbqqVar, zzbri zzbriVar, zzbrr zzbrrVar, zzbsb zzbsbVar, zzbuy zzbuyVar, zzbso zzbsoVar, zzbxu zzbxuVar, zzbur zzburVar, zzbqy zzbqyVar) {
        super(zzbqqVar, zzbriVar, zzbrrVar, zzbsbVar, zzbuyVar, zzbsoVar, zzbxuVar, zzburVar, zzbqyVar);
        this.zzgun = zzburVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs, com.google.android.gms.internal.ads.zzamz
    public final void onAdImpression() {
        this.zzgun.zzalb();
    }
}
