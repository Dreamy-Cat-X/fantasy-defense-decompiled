package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzyr extends zzgv implements zzyo {
    public zzyr() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzyo zzi(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        if (queryLocalInterface instanceof zzyo) {
            return (zzyo) queryLocalInterface;
        }
        return new zzyq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zza((zzvr) zzgy.zza(parcel, zzvr.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
