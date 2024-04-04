package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzn extends com.google.android.gms.internal.common.zza implements zzl {
    public zzn() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static zzl zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof zzl) {
            return (zzl) queryLocalInterface;
        }
        return new zzm(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zza
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper zzb = zzb();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzd.zza(parcel2, zzb);
        } else {
            if (i != 2) {
                return false;
            }
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
