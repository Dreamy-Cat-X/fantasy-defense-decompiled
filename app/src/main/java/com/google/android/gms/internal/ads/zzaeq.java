package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaeq extends zzgv implements zzaen {
    public zzaeq() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzaen zzp(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        if (queryLocalInterface instanceof zzaen) {
            return (zzaen) queryLocalInterface;
        }
        return new zzaep(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaei zzaekVar;
        switch (i) {
            case 1:
                zzb(parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzco = zzco(parcel.readString());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzco);
                return true;
            case 3:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                destroy();
                parcel2.writeNoException();
                return true;
            case 5:
                zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                zzg(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzaekVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    if (queryLocalInterface instanceof zzaei) {
                        zzaekVar = (zzaei) queryLocalInterface;
                    } else {
                        zzaekVar = new zzaek(readStrongBinder);
                    }
                }
                zza(zzaekVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzh(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
