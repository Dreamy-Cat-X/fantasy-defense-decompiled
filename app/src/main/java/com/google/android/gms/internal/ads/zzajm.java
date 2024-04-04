package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzajm extends zzgv implements zzajj {
    public zzajm() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzajo zzajqVar;
        if (i == 3) {
            zzyu videoController = getVideoController();
            parcel2.writeNoException();
            zzgy.zza(parcel2, videoController);
            return true;
        }
        if (i == 4) {
            destroy();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            if (i == 6) {
                zzr(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i != 7) {
                return false;
            }
            zzaei zztx = zztx();
            parcel2.writeNoException();
            zzgy.zza(parcel2, zztx);
            return true;
        }
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzajqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            if (queryLocalInterface instanceof zzajo) {
                zzajqVar = (zzajo) queryLocalInterface;
            } else {
                zzajqVar = new zzajq(readStrongBinder);
            }
        }
        zza(asInterface, zzajqVar);
        parcel2.writeNoException();
        return true;
    }
}
