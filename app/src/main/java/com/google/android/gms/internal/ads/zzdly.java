package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdly implements zzcyl<zzcgg> {
    private final /* synthetic */ zzdlw zzhgy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdly(zzdlw zzdlwVar) {
        this.zzhgy = zzdlwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzask() {
        synchronized (this.zzhgy) {
            this.zzhgy.zzhhb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final /* synthetic */ void onSuccess(zzcgg zzcggVar) {
        zzcgg zzcggVar2;
        zzcgg zzcggVar3 = zzcggVar;
        synchronized (this.zzhgy) {
            this.zzhgy.zzhhb = zzcggVar3;
            zzcggVar2 = this.zzhgy.zzhhb;
            zzcggVar2.zzajy();
        }
    }
}
