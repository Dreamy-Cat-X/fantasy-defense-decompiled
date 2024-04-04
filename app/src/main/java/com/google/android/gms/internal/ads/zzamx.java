package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzamx extends zzgv implements zzamy {
    public zzamx() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzamz zzamzVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzvp zzvpVar = (zzvp) zzgy.zza(parcel, zzvp.CREATOR);
                zzvi zzviVar = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof zzamz) {
                        zzamzVar = (zzamz) queryLocalInterface;
                    } else {
                        zzamzVar = new zzanb(readStrongBinder);
                    }
                }
                zza(asInterface, zzvpVar, zzviVar, readString, zzamzVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzut = zzut();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzut);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzvi zzviVar2 = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof zzamz) {
                        zzamzVar = (zzamz) queryLocalInterface2;
                    } else {
                        zzamzVar = new zzanb(readStrongBinder2);
                    }
                }
                zza(asInterface2, zzviVar2, readString2, zzamzVar);
                parcel2.writeNoException();
                return true;
            case 4:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 5:
                destroy();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzvp zzvpVar2 = (zzvp) zzgy.zza(parcel, zzvp.CREATOR);
                zzvi zzviVar3 = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof zzamz) {
                        zzamzVar = (zzamz) queryLocalInterface3;
                    } else {
                        zzamzVar = new zzanb(readStrongBinder3);
                    }
                }
                zza(asInterface3, zzvpVar2, zzviVar3, readString3, readString4, zzamzVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzvi zzviVar4 = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof zzamz) {
                        zzamzVar = (zzamz) queryLocalInterface4;
                    } else {
                        zzamzVar = new zzanb(readStrongBinder4);
                    }
                }
                zza(asInterface4, zzviVar4, readString5, readString6, zzamzVar);
                parcel2.writeNoException();
                return true;
            case 8:
                pause();
                parcel2.writeNoException();
                return true;
            case 9:
                resume();
                parcel2.writeNoException();
                return true;
            case 10:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzvi) zzgy.zza(parcel, zzvi.CREATOR), parcel.readString(), zzaui.zzap(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zza((zzvi) zzgy.zza(parcel, zzvi.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                showVideo();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean isInitialized = isInitialized();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, isInitialized);
                return true;
            case 14:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzvi zzviVar5 = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof zzamz) {
                        zzamzVar = (zzamz) queryLocalInterface5;
                    } else {
                        zzamzVar = new zzanb(readStrongBinder5);
                    }
                }
                zza(asInterface5, zzviVar5, readString7, readString8, zzamzVar, (zzadz) zzgy.zza(parcel, zzadz.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                zzang zzuu = zzuu();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzuu);
                return true;
            case 16:
                zzanh zzuv = zzuv();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzuv);
                return true;
            case 17:
                Bundle zzuw = zzuw();
                parcel2.writeNoException();
                zzgy.zzb(parcel2, zzuw);
                return true;
            case 18:
                Bundle interstitialAdapterInfo = getInterstitialAdapterInfo();
                parcel2.writeNoException();
                zzgy.zzb(parcel2, interstitialAdapterInfo);
                return true;
            case 19:
                Bundle zzux = zzux();
                parcel2.writeNoException();
                zzgy.zzb(parcel2, zzux);
                return true;
            case 20:
                zza((zzvi) zzgy.zza(parcel, zzvi.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                zzs(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzuy = zzuy();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, zzuy);
                return true;
            case 23:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzaui.zzap(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                zzaff zzuz = zzuz();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzuz);
                return true;
            case 25:
                setImmersiveMode(zzgy.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                zzyu videoController = getVideoController();
                parcel2.writeNoException();
                zzgy.zza(parcel2, videoController);
                return true;
            case 27:
                zzanm zzva = zzva();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzva);
                return true;
            case 28:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzvi zzviVar6 = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof zzamz) {
                        zzamzVar = (zzamz) queryLocalInterface6;
                    } else {
                        zzamzVar = new zzanb(readStrongBinder6);
                    }
                }
                zzb(asInterface6, zzviVar6, readString9, zzamzVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                zzt(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzaja.zzz(parcel.readStrongBinder()), parcel.createTypedArrayList(zzajf.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzvi zzviVar7 = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                String readString10 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof zzamz) {
                        zzamzVar = (zzamz) queryLocalInterface7;
                    } else {
                        zzamzVar = new zzanb(readStrongBinder7);
                    }
                }
                zzc(asInterface7, zzviVar7, readString10, zzamzVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzapn zzvb = zzvb();
                parcel2.writeNoException();
                zzgy.zzb(parcel2, zzvb);
                return true;
            case 34:
                zzapn zzvc = zzvc();
                parcel2.writeNoException();
                zzgy.zzb(parcel2, zzvc);
                return true;
        }
    }
}
