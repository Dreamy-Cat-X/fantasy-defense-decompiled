package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzafi extends zzgv implements zzaff {
    public zzafi() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzaff zzr(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof zzaff) {
            return (zzaff) queryLocalInterface;
        }
        return new zzafh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String zzct = zzct(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(zzct);
                return true;
            case 2:
                zzaej zzcu = zzcu(parcel.readString());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzcu);
                return true;
            case 3:
                List<String> availableAssetNames = getAvailableAssetNames();
                parcel2.writeNoException();
                parcel2.writeStringList(availableAssetNames);
                return true;
            case 4:
                String customTemplateId = getCustomTemplateId();
                parcel2.writeNoException();
                parcel2.writeString(customTemplateId);
                return true;
            case 5:
                performClick(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 7:
                zzyu videoController = getVideoController();
                parcel2.writeNoException();
                zzgy.zza(parcel2, videoController);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper zztq = zztq();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zztq);
                return true;
            case 10:
                boolean zzp = zzp(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, zzp);
                return true;
            case 11:
                IObjectWrapper zztl = zztl();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zztl);
                return true;
            case 12:
                boolean zztr = zztr();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, zztr);
                return true;
            case 13:
                boolean zzts = zzts();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, zzts);
                return true;
            case 14:
                zzq(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zztt();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
