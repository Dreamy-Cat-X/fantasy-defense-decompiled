package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaet extends zzgv implements zzaeu {
    public zzaet() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzaeu zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        if (queryLocalInterface instanceof zzaeu) {
            return (zzaeu) queryLocalInterface;
        }
        return new zzaew(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
        } else if (i == 2) {
            unregisterNativeAd();
        } else {
            if (i != 3) {
                return false;
            }
            zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
