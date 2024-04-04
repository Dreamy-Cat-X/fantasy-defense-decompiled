package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzamw extends zzgv implements zzamt {
    public zzamw() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzamt zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzamt) {
            return (zzamt) queryLocalInterface;
        }
        return new zzamv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzamy zzdd = zzdd(parcel.readString());
            parcel2.writeNoException();
            zzgy.zza(parcel2, zzdd);
        } else if (i == 2) {
            boolean zzde = zzde(parcel.readString());
            parcel2.writeNoException();
            zzgy.writeBoolean(parcel2, zzde);
        } else {
            if (i != 3) {
                return false;
            }
            zzaoz zzdf = zzdf(parcel.readString());
            parcel2.writeNoException();
            zzgy.zza(parcel2, zzdf);
        }
        return true;
    }
}
