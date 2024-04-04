package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzauu extends zzgv implements zzauv {
    public zzauu() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaup zzaurVar;
        if (i == 1) {
            onRewardedAdOpened();
        } else if (i == 2) {
            onRewardedAdClosed();
        } else if (i == 3) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzaurVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                if (queryLocalInterface instanceof zzaup) {
                    zzaurVar = (zzaup) queryLocalInterface;
                } else {
                    zzaurVar = new zzaur(readStrongBinder);
                }
            }
            zza(zzaurVar);
        } else if (i == 4) {
            onRewardedAdFailedToShow(parcel.readInt());
        } else {
            if (i != 5) {
                return false;
            }
            zzi((zzvc) zzgy.zza(parcel, zzvc.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
