package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzxc extends zzgv implements zzxd {
    public zzxc() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzwv zzwvVar = null;
        zzxu zzxuVar = null;
        switch (i) {
            case 1:
                zzwy zzqy = zzqy();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzqy);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzwv) {
                        zzwvVar = (zzwv) queryLocalInterface;
                    } else {
                        zzwvVar = new zzwx(readStrongBinder);
                    }
                }
                zzb(zzwvVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zza(zzafm.zzs(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                zza(zzafn.zzt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                zza(parcel.readString(), zzaft.zzv(parcel.readStrongBinder()), zzafs.zzu(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                zza((zzadz) zzgy.zza(parcel, zzadz.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof zzxu) {
                        zzxuVar = (zzxu) queryLocalInterface2;
                    } else {
                        zzxuVar = new zzxx(readStrongBinder2);
                    }
                }
                zzb(zzxuVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zza(zzaga.zzw(parcel.readStrongBinder()), (zzvp) zzgy.zza(parcel, zzvp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zza((PublisherAdViewOptions) zzgy.zza(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                zza(zzagb.zzx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zza((zzajh) zzgy.zza(parcel, zzajh.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zza(zzajs.zzab(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zza((AdManagerAdViewOptions) zzgy.zza(parcel, AdManagerAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
