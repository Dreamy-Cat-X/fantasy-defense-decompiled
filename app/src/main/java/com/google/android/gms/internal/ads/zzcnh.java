package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcnh implements zzdza<zzdmt> {
    private final /* synthetic */ zzcnf zzgnn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnh(zzcnf zzcnfVar) {
        this.zzgnn = zzcnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzdmt zzdmtVar) {
        zzbte zzbteVar;
        zzbteVar = this.zzgnn.zzgnm;
        zzbteVar.zzb(zzdmtVar);
    }
}
