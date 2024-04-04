package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzafs extends zzgv implements zzafp {
    public zzafs() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzafp zzu(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if (queryLocalInterface instanceof zzafp) {
            return (zzafp) queryLocalInterface;
        }
        return new zzafr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaff zzafhVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzafhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            if (queryLocalInterface instanceof zzaff) {
                zzafhVar = (zzaff) queryLocalInterface;
            } else {
                zzafhVar = new zzafh(readStrongBinder);
            }
        }
        zza(zzafhVar, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
