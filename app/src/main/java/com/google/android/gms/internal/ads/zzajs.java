package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzajs extends zzgv implements zzajp {
    public zzajs() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public static zzajp zzab(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        if (queryLocalInterface instanceof zzajp) {
            return (zzajp) queryLocalInterface;
        }
        return new zzajr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzajj zzajlVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzajlVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                if (queryLocalInterface instanceof zzajj) {
                    zzajlVar = (zzajj) queryLocalInterface;
                } else {
                    zzajlVar = new zzajl(readStrongBinder);
                }
            }
            zza(zzajlVar);
        } else if (i == 2) {
            onInstreamAdFailedToLoad(parcel.readInt());
        } else {
            if (i != 3) {
                return false;
            }
            zze((zzvc) zzgy.zza(parcel, zzvc.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
