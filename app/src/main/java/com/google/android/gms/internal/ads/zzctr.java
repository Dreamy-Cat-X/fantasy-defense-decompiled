package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzctr extends zzaow {
    private zzcqs<zzaoz, zzcsk> zzgsc;
    private final /* synthetic */ zzctp zzgtf;

    private zzctr(zzctp zzctpVar, zzcqs<zzaoz, zzcsk> zzcqsVar) {
        this.zzgtf = zzctpVar;
        this.zzgsc = zzcqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zza(zzanm zzanmVar) throws RemoteException {
        this.zzgtf.zzgte = zzanmVar;
        this.zzgsc.zzgrc.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zzdl(String str) throws RemoteException {
        this.zzgsc.zzgrc.zzc(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zzg(zzvc zzvcVar) throws RemoteException {
        this.zzgsc.zzgrc.zzc(zzvcVar);
    }
}
