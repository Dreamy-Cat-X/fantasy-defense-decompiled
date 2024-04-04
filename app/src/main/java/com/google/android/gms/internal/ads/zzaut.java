package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaut extends zzgv implements zzauq {
    public zzaut() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzauq zzar(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzauq) {
            return (zzauq) queryLocalInterface;
        }
        return new zzaus(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzauy zzauyVar = null;
        zzauy zzauyVar2 = null;
        zzavd zzavdVar = null;
        zzauv zzauvVar = null;
        switch (i) {
            case 1:
                zzvi zzviVar = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zzauy) {
                        zzauyVar = (zzauy) queryLocalInterface;
                    } else {
                        zzauyVar = new zzava(readStrongBinder);
                    }
                }
                zza(zzviVar, zzauyVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zzauv) {
                        zzauvVar = (zzauv) queryLocalInterface2;
                    } else {
                        zzauvVar = new zzaux(readStrongBinder2);
                    }
                }
                zza(zzauvVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean isLoaded = isLoaded();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, isLoaded);
                return true;
            case 4:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 5:
                zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof zzavd) {
                        zzavdVar = (zzavd) queryLocalInterface3;
                    } else {
                        zzavdVar = new zzavc(readStrongBinder3);
                    }
                }
                zza(zzavdVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zza((zzavl) zzgy.zza(parcel, zzavl.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zza(zzym.zzh(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle adMetadata = getAdMetadata();
                parcel2.writeNoException();
                zzgy.zzb(parcel2, adMetadata);
                return true;
            case 10:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzgy.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                zzaup zzru = zzru();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzru);
                return true;
            case 12:
                zzyt zzkh = zzkh();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzkh);
                return true;
            case 13:
                zza(zzyr.zzi(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                zzvi zzviVar2 = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface4 instanceof zzauy) {
                        zzauyVar2 = (zzauy) queryLocalInterface4;
                    } else {
                        zzauyVar2 = new zzava(readStrongBinder4);
                    }
                }
                zzb(zzviVar2, zzauyVar2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
