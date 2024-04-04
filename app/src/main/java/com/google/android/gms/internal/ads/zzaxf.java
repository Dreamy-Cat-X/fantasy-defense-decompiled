package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaxf extends zzgv implements zzaxc {
    public zzaxf() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzaxc zzas(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        if (queryLocalInterface instanceof zzaxc) {
            return (zzaxc) queryLocalInterface;
        }
        return new zzaxe(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaxb zzaxdVar;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaxi zzaxiVar = (zzaxi) zzgy.zza(parcel, zzaxi.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzaxdVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    if (queryLocalInterface instanceof zzaxb) {
                        zzaxdVar = (zzaxb) queryLocalInterface;
                    } else {
                        zzaxdVar = new zzaxd(readStrongBinder);
                    }
                }
                zza(asInterface, zzaxiVar, zzaxdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzan(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper zzb = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper zzao = zzao(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzao);
                return true;
            case 5:
                zza(parcel.createTypedArrayList(Uri.CREATOR), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzarm.zzam(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                zzb(parcel.createTypedArrayList(Uri.CREATOR), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzarm.zzam(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                zza((zzaru) zzgy.zza(parcel, zzaru.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
