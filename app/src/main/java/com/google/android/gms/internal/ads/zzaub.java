package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaub extends zzgv implements zzaty {
    public zzaub() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public static zzaty zzao(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzaty) {
            return (zzaty) queryLocalInterface;
        }
        return new zzaua(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzato zzatqVar;
        switch (i) {
            case 1:
                onRewardedVideoAdLoaded();
                break;
            case 2:
                onRewardedVideoAdOpened();
                break;
            case 3:
                onRewardedVideoStarted();
                break;
            case 4:
                onRewardedVideoAdClosed();
                break;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzatqVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    if (queryLocalInterface instanceof zzato) {
                        zzatqVar = (zzato) queryLocalInterface;
                    } else {
                        zzatqVar = new zzatq(readStrongBinder);
                    }
                }
                zza(zzatqVar);
                break;
            case 6:
                onRewardedVideoAdLeftApplication();
                break;
            case 7:
                onRewardedVideoAdFailedToLoad(parcel.readInt());
                break;
            case 8:
                onRewardedVideoCompleted();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
