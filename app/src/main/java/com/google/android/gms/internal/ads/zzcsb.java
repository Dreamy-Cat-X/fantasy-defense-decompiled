package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcsb extends zzaoq {
    private zzcqs<zzaoz, zzcsk> zzgsc;
    private final /* synthetic */ zzcrw zzgsd;

    private zzcsb(zzcrw zzcrwVar, zzcqs<zzaoz, zzcsk> zzcqsVar) {
        this.zzgsd = zzcrwVar;
        this.zzgsc = zzcqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzx(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzgsd.view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzgsc.zzgrc.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzdl(String str) throws RemoteException {
        this.zzgsc.zzgrc.zzc(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzg(zzvc zzvcVar) throws RemoteException {
        this.zzgsc.zzgrc.zzc(zzvcVar);
    }
}
