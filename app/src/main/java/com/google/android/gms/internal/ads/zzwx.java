package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwx extends zzgw implements zzwv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdClosed() throws RemoteException {
        zzb(1, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdFailedToLoad(int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdLeftApplication() throws RemoteException {
        zzb(3, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdLoaded() throws RemoteException {
        zzb(4, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdOpened() throws RemoteException {
        zzb(5, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdClicked() throws RemoteException {
        zzb(6, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdImpression() throws RemoteException {
        zzb(7, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzc(zzvc zzvcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvcVar);
        zzb(8, zzdo);
    }
}
