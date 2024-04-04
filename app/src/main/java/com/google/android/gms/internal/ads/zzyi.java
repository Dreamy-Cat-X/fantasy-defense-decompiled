package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzyi extends zzgv implements zzyj {
    public zzyi() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzyj zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzyj) {
            return (zzyj) queryLocalInterface;
        }
        return new zzyl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String description = getDescription();
            parcel2.writeNoException();
            parcel2.writeString(description);
        } else {
            if (i != 2) {
                return false;
            }
            String zzrd = zzrd();
            parcel2.writeNoException();
            parcel2.writeString(zzrd);
        }
        return true;
    }
}
