package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzasr extends zzgv implements zzaso {
    public zzasr() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb((ParcelFileDescriptor) zzgy.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            zza((com.google.android.gms.ads.internal.util.zzap) zzgy.zza(parcel, com.google.android.gms.ads.internal.util.zzap.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
