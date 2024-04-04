package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzavb extends zzgv implements zzauy {
    public zzavb() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onRewardedAdLoaded();
        } else if (i == 2) {
            onRewardedAdFailedToLoad(parcel.readInt());
        } else {
            if (i != 3) {
                return false;
            }
            zzj((zzvc) zzgy.zza(parcel, zzvc.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
