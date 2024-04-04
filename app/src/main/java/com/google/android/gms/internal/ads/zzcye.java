package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcye implements zzcyl<zzbmz> {
    private final /* synthetic */ zzcyf zzgxe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcye(zzcyf zzcyfVar) {
        this.zzgxe = zzcyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzask() {
        synchronized (this.zzgxe) {
            zzcyf.zza(this.zzgxe, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final /* synthetic */ void onSuccess(zzbmz zzbmzVar) {
        zzbmz zzbmzVar2 = zzbmzVar;
        synchronized (this.zzgxe) {
            zzcyf.zza(this.zzgxe, false);
            this.zzgxe.zzads = zzbmzVar2.zzako();
            zzbmzVar2.zzajy();
        }
    }
}
