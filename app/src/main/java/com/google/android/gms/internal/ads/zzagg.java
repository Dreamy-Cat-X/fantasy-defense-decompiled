package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzagg extends zzgv implements zzagd {
    public zzagg() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public static zzagd zzy(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        if (queryLocalInterface instanceof zzagd) {
            return (zzagd) queryLocalInterface;
        }
        return new zzagf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        boolean zzm = zzm(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
        parcel2.writeNoException();
        zzgy.writeBoolean(parcel2, zzm);
        return true;
    }
}
