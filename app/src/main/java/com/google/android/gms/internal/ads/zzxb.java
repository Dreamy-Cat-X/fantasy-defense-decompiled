package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzxb extends zzgv implements zzwy {
    public zzxb() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb((zzvi) zzgy.zza(parcel, zzvi.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            String mediationAdapterClassName = getMediationAdapterClassName();
            parcel2.writeNoException();
            parcel2.writeString(mediationAdapterClassName);
        } else if (i == 3) {
            boolean isLoading = isLoading();
            parcel2.writeNoException();
            zzgy.writeBoolean(parcel2, isLoading);
        } else if (i == 4) {
            String zzkg = zzkg();
            parcel2.writeNoException();
            parcel2.writeString(zzkg);
        } else {
            if (i != 5) {
                return false;
            }
            zza((zzvi) zzgy.zza(parcel, zzvi.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
