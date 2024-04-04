package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaxa extends zzgv implements zzaxb {
    public zzaxa() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzj(parcel.readString(), parcel.readString());
        } else if (i == 2) {
            onError(parcel.readString());
        } else {
            if (i != 3) {
                return false;
            }
            zza(parcel.readString(), parcel.readString(), (Bundle) zzgy.zza(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
