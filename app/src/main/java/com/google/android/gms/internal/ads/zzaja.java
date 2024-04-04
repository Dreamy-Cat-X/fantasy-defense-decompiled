package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaja extends zzgv implements zzaix {
    public zzaja() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzaix zzz(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        if (queryLocalInterface instanceof zzaix) {
            return (zzaix) queryLocalInterface;
        }
        return new zzaiz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            onInitializationSucceeded();
        } else {
            if (i != 3) {
                return false;
            }
            onInitializationFailed(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
