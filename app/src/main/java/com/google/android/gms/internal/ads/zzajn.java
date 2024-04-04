package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzajn extends zzgv implements zzajo {
    public zzajn() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzud();
        } else {
            if (i != 2) {
                return false;
            }
            zzdb(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
