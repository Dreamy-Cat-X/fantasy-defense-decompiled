package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdmb implements zzcyl<zzcgg> {
    private final /* synthetic */ zzdmc zzhhc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdmb(zzdmc zzdmcVar) {
        this.zzhhc = zzdmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzask() {
        synchronized (this.zzhhc) {
            this.zzhhc.zzhhb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final /* synthetic */ void onSuccess(zzcgg zzcggVar) {
        zzcgg zzcggVar2;
        zzcgg zzcggVar3 = zzcggVar;
        synchronized (this.zzhhc) {
            this.zzhhc.zzhhb = zzcggVar3;
            zzcggVar2 = this.zzhhc.zzhhb;
            zzcggVar2.zzajy();
        }
    }
}
