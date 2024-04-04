package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzxs extends zzgv implements zzxt {
    public zzxs() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzxg zza = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzvp) zzgy.zza(parcel, zzvp.CREATOR), parcel.readString(), zzamw.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zza);
                return true;
            case 2:
                zzxg zzb = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzvp) zzgy.zza(parcel, zzvp.CREATOR), parcel.readString(), zzamw.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzb);
                return true;
            case 3:
                zzxd zza2 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzamw.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zza2);
                return true;
            case 4:
                zzxy zzc = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzc);
                return true;
            case 5:
                zzaen zza3 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgy.zza(parcel2, zza3);
                return true;
            case 6:
                zzatv zza4 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzamw.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zza4);
                return true;
            case 7:
                zzarh zzd = zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzd);
                return true;
            case 8:
                zzaqs zzb2 = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzb2);
                return true;
            case 9:
                zzxy zza5 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zza5);
                return true;
            case 10:
                zzxg zza6 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzvp) zzgy.zza(parcel, zzvp.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zza6);
                return true;
            case 11:
                zzaeu zza7 = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgy.zza(parcel2, zza7);
                return true;
            case 12:
                zzauq zzb3 = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzamw.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzb3);
                return true;
            case 13:
                zzxg zzc2 = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzvp) zzgy.zza(parcel, zzvp.CREATOR), parcel.readString(), zzamw.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzc2);
                return true;
            case 14:
                zzaxc zzb4 = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzamw.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzb4);
                return true;
            case 15:
                zzaqh zzc3 = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzamw.zzac(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzc3);
                return true;
            default:
                return false;
        }
    }
}
