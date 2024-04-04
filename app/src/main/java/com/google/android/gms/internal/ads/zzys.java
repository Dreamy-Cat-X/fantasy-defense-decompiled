package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzys extends zzgv implements zzyt {
    public zzys() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzyt zzj(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        if (queryLocalInterface instanceof zzyt) {
            return (zzyt) queryLocalInterface;
        }
        return new zzyv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String mediationAdapterClassName = getMediationAdapterClassName();
            parcel2.writeNoException();
            parcel2.writeString(mediationAdapterClassName);
        } else if (i == 2) {
            String responseId = getResponseId();
            parcel2.writeNoException();
            parcel2.writeString(responseId);
        } else {
            if (i != 3) {
                return false;
            }
            List<zzvt> adapterResponses = getAdapterResponses();
            parcel2.writeNoException();
            parcel2.writeTypedList(adapterResponses);
        }
        return true;
    }
}
