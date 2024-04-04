package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzsk extends zzgv implements zzsh {
    public zzsk() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzxg zzdx = zzdx();
            parcel2.writeNoException();
            zzgy.zza(parcel2, zzdx);
            return true;
        }
        zzsn zzsnVar = null;
        zzsr zzsrVar = null;
        if (i == 3) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                if (queryLocalInterface instanceof zzsn) {
                    zzsnVar = (zzsn) queryLocalInterface;
                } else {
                    zzsnVar = new zzsp(readStrongBinder);
                }
            }
            zza(zzsnVar);
            parcel2.writeNoException();
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return false;
            }
            zzyt zzkh = zzkh();
            parcel2.writeNoException();
            zzgy.zza(parcel2, zzkh);
            return true;
        }
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
            if (queryLocalInterface2 instanceof zzsr) {
                zzsrVar = (zzsr) queryLocalInterface2;
            } else {
                zzsrVar = new zzst(readStrongBinder2);
            }
        }
        zza(asInterface, zzsrVar);
        parcel2.writeNoException();
        return true;
    }
}
