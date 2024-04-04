package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzarm extends zzgv implements zzarn {
    public zzarm() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static zzarn zzam(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        if (queryLocalInterface instanceof zzarn) {
            return (zzarn) queryLocalInterface;
        }
        return new zzarp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onSuccess(parcel.createTypedArrayList(Uri.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            onError(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
