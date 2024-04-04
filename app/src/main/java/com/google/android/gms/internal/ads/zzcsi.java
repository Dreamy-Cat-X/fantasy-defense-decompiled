package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsi implements zzdza<zzblb> {
    private final /* synthetic */ zzcsh zzgsm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsi(zzcsh zzcshVar) {
        this.zzgsm = zzcshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        zzblx zzblxVar;
        zzbqu zzbquVar;
        zzblxVar = this.zzgsm.zzgsk;
        zzvc zze = zzblxVar.zzagu().zze(th);
        zzbquVar = this.zzgsm.zzfyz;
        zzbquVar.zzd(zze);
        zzdnp.zza(zze.errorCode, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzblb zzblbVar) {
        zzblbVar.zzajy();
    }
}
