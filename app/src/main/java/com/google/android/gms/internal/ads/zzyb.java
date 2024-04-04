package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzyb extends zzgv implements zzxy {
    public zzyb() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                initialize();
                parcel2.writeNoException();
                return true;
            case 2:
                setAppVolume(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                zzcd(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                setAppMuted(zzgy.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zza(parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float zzqz = zzqz();
                parcel2.writeNoException();
                parcel2.writeFloat(zzqz);
                return true;
            case 8:
                boolean zzra = zzra();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, zzra);
                return true;
            case 9:
                String versionString = getVersionString();
                parcel2.writeNoException();
                parcel2.writeString(versionString);
                return true;
            case 10:
                zzce(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zza(zzamw.zzac(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                zza(zzajb.zzaa(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<zzaiv> zzrb = zzrb();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzrb);
                return true;
            case 14:
                zza((zzaak) zzgy.zza(parcel, zzaak.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzrc();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
