package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzatu extends zzgv implements zzatv {
    public zzatu() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static zzatv zzan(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        if (queryLocalInterface instanceof zzatv) {
            return (zzatv) queryLocalInterface;
        }
        return new zzatx(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x000e. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zza((zzaue) zzgy.zza(parcel, zzaue.CREATOR));
            parcel2.writeNoException();
        } else if (i != 2) {
            zzaty zzatyVar = null;
            zzatt zzattVar = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    if (queryLocalInterface instanceof zzaty) {
                        zzatyVar = (zzaty) queryLocalInterface;
                    } else {
                        zzatyVar = new zzaua(readStrongBinder);
                    }
                }
                zza(zzatyVar);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean isLoaded = isLoaded();
                        parcel2.writeNoException();
                        zzgy.writeBoolean(parcel2, isLoaded);
                        break;
                    case 6:
                        pause();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        resume();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        destroy();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        zzj(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 10:
                        zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 11:
                        zzl(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String mediationAdapterClassName = getMediationAdapterClassName();
                        parcel2.writeNoException();
                        parcel2.writeString(mediationAdapterClassName);
                        break;
                    case 13:
                        setUserId(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 14:
                        zza(zzxm.zzd(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle adMetadata = getAdMetadata();
                        parcel2.writeNoException();
                        zzgy.zzb(parcel2, adMetadata);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            if (queryLocalInterface2 instanceof zzatt) {
                                zzattVar = (zzatt) queryLocalInterface2;
                            } else {
                                zzattVar = new zzats(readStrongBinder2);
                            }
                        }
                        zza(zzattVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        setAppPackageName(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 18:
                        zzi(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 19:
                        setCustomData(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzrv = zzrv();
                        parcel2.writeNoException();
                        zzgy.writeBoolean(parcel2, zzrv);
                        break;
                    case 21:
                        zzyt zzkh = zzkh();
                        parcel2.writeNoException();
                        zzgy.zza(parcel2, zzkh);
                        break;
                    default:
                        return false;
                }
            } else {
                setImmersiveMode(zzgy.zza(parcel));
                parcel2.writeNoException();
            }
        } else {
            show();
            parcel2.writeNoException();
        }
        return true;
    }
}
