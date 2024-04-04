package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzxj extends zzgv implements zzxg {
    public zzxj() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzxg zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzxg) {
            return (zzxg) queryLocalInterface;
        }
        return new zzxi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzwv zzwvVar = null;
        zzxw zzxwVar = null;
        zzww zzwwVar = null;
        zzyo zzyoVar = null;
        zzxn zzxnVar = null;
        zzxu zzxuVar = null;
        zzwq zzwqVar = null;
        zzxo zzxoVar = null;
        switch (i) {
            case 1:
                IObjectWrapper zzkd = zzkd();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzkd);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean isReady = isReady();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, isReady);
                return true;
            case 4:
                boolean zza = zza((zzvi) zzgy.zza(parcel, zzvi.CREATOR));
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, zza);
                return true;
            case 5:
                pause();
                parcel2.writeNoException();
                return true;
            case 6:
                resume();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzwv) {
                        zzwvVar = (zzwv) queryLocalInterface;
                    } else {
                        zzwvVar = new zzwx(readStrongBinder);
                    }
                }
                zza(zzwvVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzxo) {
                        zzxoVar = (zzxo) queryLocalInterface2;
                    } else {
                        zzxoVar = new zzxq(readStrongBinder2);
                    }
                }
                zza(zzxoVar);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                stopLoading();
                parcel2.writeNoException();
                return true;
            case 11:
                zzke();
                parcel2.writeNoException();
                return true;
            case 12:
                zzvp zzkf = zzkf();
                parcel2.writeNoException();
                zzgy.zzb(parcel2, zzkf);
                return true;
            case 13:
                zza((zzvp) zzgy.zza(parcel, zzvp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zza(zzarf.zzaj(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zza(zzarl.zzal(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 19:
                zza(zzacg.zzl(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzwq) {
                        zzwqVar = (zzwq) queryLocalInterface3;
                    } else {
                        zzwqVar = new zzws(readStrongBinder3);
                    }
                }
                zza(zzwqVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzxu) {
                        zzxuVar = (zzxu) queryLocalInterface4;
                    } else {
                        zzxuVar = new zzxx(readStrongBinder4);
                    }
                }
                zza(zzxuVar);
                parcel2.writeNoException();
                return true;
            case 22:
                setManualImpressionsEnabled(zzgy.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                boolean isLoading = isLoading();
                parcel2.writeNoException();
                zzgy.writeBoolean(parcel2, isLoading);
                return true;
            case 24:
                zza(zzaub.zzao(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                setUserId(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                zzyu videoController = getVideoController();
                parcel2.writeNoException();
                zzgy.zza(parcel2, videoController);
                return true;
            case 29:
                zza((zzaaq) zzgy.zza(parcel, zzaaq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zza((zzza) zzgy.zza(parcel, zzza.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String adUnitId = getAdUnitId();
                parcel2.writeNoException();
                parcel2.writeString(adUnitId);
                return true;
            case 32:
                zzxo zzki = zzki();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzki);
                return true;
            case 33:
                zzwv zzkj = zzkj();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzkj);
                return true;
            case 34:
                setImmersiveMode(zzgy.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                String zzkg = zzkg();
                parcel2.writeNoException();
                parcel2.writeString(zzkg);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzxn) {
                        zzxnVar = (zzxn) queryLocalInterface5;
                    } else {
                        zzxnVar = new zzxp(readStrongBinder5);
                    }
                }
                zza(zzxnVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle adMetadata = getAdMetadata();
                parcel2.writeNoException();
                zzgy.zzb(parcel2, adMetadata);
                return true;
            case 38:
                zzbl(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                zza((zzvu) zzgy.zza(parcel, zzvu.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zza(zzsl.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 41:
                zzyt zzkh = zzkh();
                parcel2.writeNoException();
                zzgy.zza(parcel2, zzkh);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface6 instanceof zzyo) {
                        zzyoVar = (zzyo) queryLocalInterface6;
                    } else {
                        zzyoVar = new zzyq(readStrongBinder6);
                    }
                }
                zza(zzyoVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzvi zzviVar = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface7 instanceof zzww) {
                        zzwwVar = (zzww) queryLocalInterface7;
                    } else {
                        zzwwVar = new zzwz(readStrongBinder7);
                    }
                }
                zza(zzviVar, zzwwVar);
                parcel2.writeNoException();
                return true;
            case 44:
                zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface8 instanceof zzxw) {
                        zzxwVar = (zzxw) queryLocalInterface8;
                    } else {
                        zzxwVar = new zzxz(readStrongBinder8);
                    }
                }
                zza(zzxwVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
