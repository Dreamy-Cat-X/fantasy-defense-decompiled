package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcze implements zzdza<zzczr> {
    private final /* synthetic */ zzaxb zzgyd;
    private final /* synthetic */ zzcyv zzgye;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcze(zzcyv zzcyvVar, zzaxb zzaxbVar) {
        this.zzgye = zzcyvVar;
        this.zzgyd = zzaxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        try {
            zzaxb zzaxbVar = this.zzgyd;
            String valueOf = String.valueOf(th.getMessage());
            zzaxbVar.onError(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzczr zzczrVar) {
        zzayt zzaytVar;
        zzczr zzczrVar2 = zzczrVar;
        try {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyf)).booleanValue()) {
                zzaytVar = this.zzgye.zzbos;
                if (zzaytVar.zzegf >= ((Integer) zzwo.zzqq().zzd(zzabh.zzcyh)).intValue()) {
                    if (zzczrVar2 == null) {
                        this.zzgyd.zza(null, null, null);
                        return;
                    } else {
                        this.zzgyd.zza(zzczrVar2.zzgym, zzczrVar2.zzgyn, zzczrVar2.zzgyo);
                        return;
                    }
                }
            }
            if (zzczrVar2 == null) {
                this.zzgyd.zzj(null, null);
            } else {
                this.zzgyd.zzj(zzczrVar2.zzgym, zzczrVar2.zzgyn);
            }
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
