package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzavx implements zzdza<Void> {
    private final /* synthetic */ zzdzl zzdyp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavx(zzavq zzavqVar, zzdzl zzdzlVar) {
        this.zzdyp = zzdzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        List list;
        list = zzavq.zzdxz;
        list.remove(this.zzdyp);
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(Void r2) {
        List list;
        list = zzavq.zzdxz;
        list.remove(this.zzdyp);
    }
}
