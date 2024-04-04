package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaqk extends zzgv implements zzaqh {
    public zzaqk() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzaqh zzag(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        if (queryLocalInterface instanceof zzaqh) {
            return (zzaqh) queryLocalInterface;
        }
        return new zzaqj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc((Intent) zzgy.zza(parcel, Intent.CREATOR));
        } else if (i == 2) {
            zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
        } else {
            if (i != 3) {
                return false;
            }
            zzvp();
        }
        parcel2.writeNoException();
        return true;
    }
}
