package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpn implements zzdre {
    private final zzcpi zzgpk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpn(zzcpi zzcpiVar) {
        this.zzgpk = zzcpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zza(zzdqz zzdqzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zzb(zzdqz zzdqzVar, String str) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxb)).booleanValue() && zzdqz.RENDERER == zzdqzVar) {
            this.zzgpk.zzfe(com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zza(zzdqz zzdqzVar, String str, Throwable th) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxb)).booleanValue() && zzdqz.RENDERER == zzdqzVar && this.zzgpk.zzarw() != 0) {
            this.zzgpk.zzep(com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - this.zzgpk.zzarw());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zzc(zzdqz zzdqzVar, String str) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxb)).booleanValue() && zzdqz.RENDERER == zzdqzVar && this.zzgpk.zzarw() != 0) {
            this.zzgpk.zzep(com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - this.zzgpk.zzarw());
        }
    }
}
