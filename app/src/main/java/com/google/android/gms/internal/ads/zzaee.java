package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaee extends zzgv implements zzaeb {
    public zzaee() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzaeb zzm(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof zzaeb) {
            return (zzaeb) queryLocalInterface;
        }
        return new zzaed(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String text = getText();
            parcel2.writeNoException();
            parcel2.writeString(text);
            return true;
        }
        if (i != 3) {
            return false;
        }
        List<zzaej> zztc = zztc();
        parcel2.writeNoException();
        parcel2.writeList(zztc);
        return true;
    }
}
