package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaua extends zzgw implements zzaty {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoAdLoaded() throws RemoteException {
        zzb(1, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoAdOpened() throws RemoteException {
        zzb(2, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoStarted() throws RemoteException {
        zzb(3, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoAdClosed() throws RemoteException {
        zzb(4, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void zza(zzato zzatoVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzatoVar);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoAdLeftApplication() throws RemoteException {
        zzb(6, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoAdFailedToLoad(int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzb(7, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoCompleted() throws RemoteException {
        zzb(8, zzdo());
    }
}
