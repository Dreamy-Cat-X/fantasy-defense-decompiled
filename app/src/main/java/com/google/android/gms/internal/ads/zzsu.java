package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzsu extends zzgv implements zzsr {
    public zzsu() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onAdShowedFullScreenContent();
        } else if (i == 2) {
            onAdDismissedFullScreenContent();
        } else {
            if (i != 3) {
                return false;
            }
            zzb((zzvc) zzgy.zza(parcel, zzvc.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
