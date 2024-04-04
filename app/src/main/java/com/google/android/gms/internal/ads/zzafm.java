package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzafm extends zzgv implements zzafj {
    public zzafm() {
        super("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public static zzafj zzs(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        if (queryLocalInterface instanceof zzafj) {
            return (zzafj) queryLocalInterface;
        }
        return new zzafl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaex zzaezVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzaezVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
            if (queryLocalInterface instanceof zzaex) {
                zzaezVar = (zzaex) queryLocalInterface;
            } else {
                zzaezVar = new zzaez(readStrongBinder);
            }
        }
        zza(zzaezVar);
        parcel2.writeNoException();
        return true;
    }
}
