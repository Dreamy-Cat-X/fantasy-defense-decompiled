package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaux extends zzgw implements zzauv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaux(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void onRewardedAdOpened() throws RemoteException {
        zzb(1, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void onRewardedAdClosed() throws RemoteException {
        zzb(2, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zza(zzaup zzaupVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaupVar);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void onRewardedAdFailedToShow(int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzb(4, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzi(zzvc zzvcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvcVar);
        zzb(5, zzdo);
    }
}
