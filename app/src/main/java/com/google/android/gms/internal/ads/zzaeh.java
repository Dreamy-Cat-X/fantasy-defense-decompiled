package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzaeh extends zzgv implements zzaei {
    public zzaeh() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public static zzaei zzn(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        if (queryLocalInterface instanceof zzaei) {
            return (zzaei) queryLocalInterface;
        }
        return new zzaek(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzafv zzafyVar;
        switch (i) {
            case 2:
                float aspectRatio = getAspectRatio();
                parcel2.writeNoException();
                parcel2.writeFloat(aspectRatio);
                return true;
            case 3:
                zzo(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper zztk = zztk();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zztk);
                return true;
            case 5:
                float duration = getDuration();
                parcel2.writeNoException();
                parcel2.writeFloat(duration);
                return true;
            case 6:
                float currentTime = getCurrentTime();
                parcel2.writeNoException();
                parcel2.writeFloat(currentTime);
                return true;
            case 7:
                zzyu videoController = getVideoController();
                parcel2.writeNoException();
                zzgy.zza(parcel2, videoController);
                return true;
            case 8:
                boolean hasVideoContent = hasVideoContent();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, hasVideoContent);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzafyVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    if (queryLocalInterface instanceof zzafv) {
                        zzafyVar = (zzafv) queryLocalInterface;
                    } else {
                        zzafyVar = new zzafy(readStrongBinder);
                    }
                }
                zza(zzafyVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
