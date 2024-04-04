package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcuo extends zzaox {
    private zzcqs<zzaoz, zzcsk> zzgsc;

    private zzcuo(zzcum zzcumVar, zzcqs<zzaoz, zzcsk> zzcqsVar) {
        this.zzgsc = zzcqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    public final void zzvm() throws RemoteException {
        this.zzgsc.zzgrc.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    public final void zzdl(String str) throws RemoteException {
        this.zzgsc.zzgrc.zzc(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    public final void zzg(zzvc zzvcVar) throws RemoteException {
        this.zzgsc.zzgrc.zzc(zzvcVar);
    }
}
