package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaoq extends zzgv implements zzaon {
    public zzaoq() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzx(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
        } else if (i == 2) {
            zzdl(parcel.readString());
        } else {
            if (i != 3) {
                return false;
            }
            zzg((zzvc) zzgy.zza(parcel, zzvc.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
