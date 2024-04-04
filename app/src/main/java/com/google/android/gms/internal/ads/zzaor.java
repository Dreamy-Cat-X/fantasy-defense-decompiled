package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaor extends zzgv implements zzaos {
    public zzaor() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzvm();
        } else if (i == 3) {
            zzdl(parcel.readString());
        } else {
            if (i != 4) {
                return false;
            }
            zzg((zzvc) zzgy.zza(parcel, zzvc.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
