package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzgy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzbi extends zzgv implements zzbf {
    public zzbi() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            boolean zzd = zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            zzgy.writeBoolean(parcel2, zzd);
        } else {
            if (i != 2) {
                return false;
            }
            zzap(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
