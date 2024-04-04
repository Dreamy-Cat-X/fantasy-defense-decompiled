package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcvn extends zzcuq {
    private final zzbur zzgun;

    public zzcvn(zzbqq zzbqqVar, zzbri zzbriVar, zzbrr zzbrrVar, zzbsb zzbsbVar, zzbqy zzbqyVar, zzbuy zzbuyVar, zzbxu zzbxuVar, zzbso zzbsoVar, zzbxp zzbxpVar, zzbur zzburVar) {
        super(zzbqqVar, zzbriVar, zzbrrVar, zzbsbVar, zzbqyVar, zzbuyVar, zzbxuVar, zzbsoVar, zzbxpVar, zzburVar);
        this.zzgun = zzburVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs, com.google.android.gms.internal.ads.zzamz
    public final void onAdImpression() {
        this.zzgun.zzalb();
    }
}
