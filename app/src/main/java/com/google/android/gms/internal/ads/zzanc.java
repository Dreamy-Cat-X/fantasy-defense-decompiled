package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzanc extends zzgv implements zzamz {
    public zzanc() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzamz zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof zzamz) {
            return (zzamz) queryLocalInterface;
        }
        return new zzanb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzane zzandVar;
        switch (i) {
            case 1:
                onAdClicked();
                break;
            case 2:
                onAdClosed();
                break;
            case 3:
                onAdFailedToLoad(parcel.readInt());
                break;
            case 4:
                onAdLeftApplication();
                break;
            case 5:
                onAdOpened();
                break;
            case 6:
                onAdLoaded();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzandVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzane) {
                        zzandVar = (zzane) queryLocalInterface;
                    } else {
                        zzandVar = new zzand(readStrongBinder);
                    }
                }
                zza(zzandVar);
                break;
            case 8:
                onAdImpression();
                break;
            case 9:
                onAppEvent(parcel.readString(), parcel.readString());
                break;
            case 10:
                zza(zzafi.zzr(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                onVideoEnd();
                break;
            case 12:
                zzdi(parcel.readString());
                break;
            case 13:
                zzvd();
                break;
            case 14:
                zzb((zzaun) zzgy.zza(parcel, zzaun.CREATOR));
                break;
            case 15:
                onVideoPause();
                break;
            case 16:
                zza(zzauo.zzaq(parcel.readStrongBinder()));
                break;
            case 17:
                zzdc(parcel.readInt());
                break;
            case 18:
                zzve();
                break;
            case 19:
                zzb((Bundle) zzgy.zza(parcel, Bundle.CREATOR));
                break;
            case 20:
                onVideoPlay();
                break;
            case 21:
                zzdj(parcel.readString());
                break;
            case 22:
                zzc(parcel.readInt(), parcel.readString());
                break;
            case 23:
                zzc((zzvc) zzgy.zza(parcel, zzvc.CREATOR));
                break;
            case 24:
                zzf((zzvc) zzgy.zza(parcel, zzvc.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
