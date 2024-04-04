package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzacg extends zzgv implements zzacd {
    public zzacg() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public static zzacd zzl(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        if (queryLocalInterface instanceof zzacd) {
            return (zzacd) queryLocalInterface;
        }
        return new zzacf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzacc zzaceVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzaceVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
            if (queryLocalInterface instanceof zzacc) {
                zzaceVar = (zzacc) queryLocalInterface;
            } else {
                zzaceVar = new zzace(readStrongBinder);
            }
        }
        zza(zzaceVar);
        parcel2.writeNoException();
        return true;
    }
}
