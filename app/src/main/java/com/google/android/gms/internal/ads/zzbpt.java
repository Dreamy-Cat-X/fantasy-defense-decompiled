package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbpt implements zzdza<Boolean> {
    private final /* synthetic */ zzbpr zzfwp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpt(zzbpr zzbprVar) {
        this.zzfwp = zzbprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(@NullableDecl Boolean bool) {
        zzbri zzbriVar;
        zzbriVar = this.zzfwp.zzfwh;
        zzbriVar.onAdImpression();
    }
}
