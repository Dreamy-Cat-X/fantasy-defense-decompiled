package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdil implements zzcyl<zzbks> {
    private final /* synthetic */ zzdih zzhem;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdil(zzdih zzdihVar) {
        this.zzhem = zzdihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzask() {
        synchronized (this.zzhem) {
            this.zzhem.zzhek = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final /* synthetic */ void onSuccess(zzbks zzbksVar) {
        zzdht zzdhtVar;
        zzdht zzdhtVar2;
        zzbks zzbksVar2 = zzbksVar;
        synchronized (this.zzhem) {
            if (this.zzhem.zzhek != null) {
                this.zzhem.zzhek.destroy();
            }
            this.zzhem.zzhek = zzbksVar2;
            this.zzhem.zza(zzbksVar2);
            zzdhtVar = this.zzhem.zzhdh;
            zzdih zzdihVar = this.zzhem;
            zzdhtVar2 = this.zzhem.zzhdh;
            zzdhtVar.zzb(new zzbkv(zzbksVar2, zzdihVar, zzdhtVar2));
            zzbksVar2.zzajy();
        }
    }
}
