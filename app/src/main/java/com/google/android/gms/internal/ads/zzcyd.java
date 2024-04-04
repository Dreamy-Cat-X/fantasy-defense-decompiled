package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcyd implements zzcyl<zzbyd> {
    private final /* synthetic */ zzcya zzgxd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcyd(zzcya zzcyaVar) {
        this.zzgxd = zzcyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzask() {
        synchronized (this.zzgxd) {
            this.zzgxd.zzgwv = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final /* synthetic */ void onSuccess(zzbyd zzbydVar) {
        zzbyd zzbydVar2;
        zzbyd zzbydVar3 = zzbydVar;
        synchronized (this.zzgxd) {
            this.zzgxd.zzgwv = zzbydVar3;
            zzbydVar2 = this.zzgxd.zzgwv;
            zzbydVar2.zzajy();
        }
    }
}
