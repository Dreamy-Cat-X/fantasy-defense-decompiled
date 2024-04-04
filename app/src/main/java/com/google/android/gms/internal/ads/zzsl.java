package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzsl extends zzgv implements zzsm {
    public zzsl() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzsm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        if (queryLocalInterface instanceof zzsm) {
            return (zzsm) queryLocalInterface;
        }
        return new zzso(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzsh zzsjVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzsjVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                if (queryLocalInterface instanceof zzsh) {
                    zzsjVar = (zzsh) queryLocalInterface;
                } else {
                    zzsjVar = new zzsj(readStrongBinder);
                }
            }
            zza(zzsjVar);
        } else if (i == 2) {
            onAppOpenAdFailedToLoad(parcel.readInt());
        } else {
            if (i != 3) {
                return false;
            }
            zza((zzvc) zzgy.zza(parcel, zzvc.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
