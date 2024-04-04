package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzzw extends zzxb {
    final /* synthetic */ zzzu zzcku;

    private zzzw(zzzu zzzuVar) {
        this.zzcku = zzzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final String zzkg() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final void zzb(zzvi zzviVar) throws RemoteException {
        zza(zzviVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final void zza(zzvi zzviVar, int i) throws RemoteException {
        zzaym.zzev("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzayd.zzaae.post(new zzzv(this));
    }
}
