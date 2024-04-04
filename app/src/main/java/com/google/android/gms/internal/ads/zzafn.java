package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzafn extends zzgv implements zzafo {
    public zzafn() {
        super("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public static zzafo zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if (queryLocalInterface instanceof zzafo) {
            return (zzafo) queryLocalInterface;
        }
        return new zzafq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzafb zzafdVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzafdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            if (queryLocalInterface instanceof zzafb) {
                zzafdVar = (zzafb) queryLocalInterface;
            } else {
                zzafdVar = new zzafd(readStrongBinder);
            }
        }
        zza(zzafdVar);
        parcel2.writeNoException();
        return true;
    }
}
