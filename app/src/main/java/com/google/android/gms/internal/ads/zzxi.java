package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzxi extends zzgw implements zzxg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final IObjectWrapper zzkd() throws RemoteException {
        Parcel zza = zza(1, zzdo());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void destroy() throws RemoteException {
        zzb(2, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean isReady() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean zza(zzvi zzviVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzviVar);
        Parcel zza = zza(4, zzdo);
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void pause() throws RemoteException {
        zzb(5, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void resume() throws RemoteException {
        zzb(6, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwv zzwvVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzwvVar);
        zzb(7, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxo zzxoVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzxoVar);
        zzb(8, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void showInterstitial() throws RemoteException {
        zzb(9, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void stopLoading() throws RemoteException {
        zzb(10, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzke() throws RemoteException {
        zzb(11, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzvp zzkf() throws RemoteException {
        Parcel zza = zza(12, zzdo());
        zzvp zzvpVar = (zzvp) zzgy.zza(zza, zzvp.CREATOR);
        zza.recycle();
        return zzvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvp zzvpVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvpVar);
        zzb(13, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzarc zzarcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzarcVar);
        zzb(14, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzari zzariVar, String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzariVar);
        zzdo.writeString(str);
        zzb(15, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel zza = zza(18, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzacd zzacdVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzacdVar);
        zzb(19, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwq zzwqVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzwqVar);
        zzb(20, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxu zzxuVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzxuVar);
        zzb(21, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.writeBoolean(zzdo, z);
        zzb(22, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean isLoading() throws RemoteException {
        Parcel zza = zza(23, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzaty zzatyVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzatyVar);
        zzb(24, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setUserId(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(25, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzyu getVideoController() throws RemoteException {
        zzyu zzywVar;
        Parcel zza = zza(26, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzywVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof zzyu) {
                zzywVar = (zzyu) queryLocalInterface;
            } else {
                zzywVar = new zzyw(readStrongBinder);
            }
        }
        zza.recycle();
        return zzywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzaaq zzaaqVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaaqVar);
        zzb(29, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzza zzzaVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzzaVar);
        zzb(30, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final String getAdUnitId() throws RemoteException {
        Parcel zza = zza(31, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzxo zzki() throws RemoteException {
        zzxo zzxqVar;
        Parcel zza = zza(32, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzxqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof zzxo) {
                zzxqVar = (zzxo) queryLocalInterface;
            } else {
                zzxqVar = new zzxq(readStrongBinder);
            }
        }
        zza.recycle();
        return zzxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzwv zzkj() throws RemoteException {
        zzwv zzwxVar;
        Parcel zza = zza(33, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzwxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            if (queryLocalInterface instanceof zzwv) {
                zzwxVar = (zzwv) queryLocalInterface;
            } else {
                zzwxVar = new zzwx(readStrongBinder);
            }
        }
        zza.recycle();
        return zzwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.writeBoolean(zzdo, z);
        zzb(34, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final String zzkg() throws RemoteException {
        Parcel zza = zza(35, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxn zzxnVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzxnVar);
        zzb(36, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel zza = zza(37, zzdo());
        Bundle bundle = (Bundle) zzgy.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzbl(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(38, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvu zzvuVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvuVar);
        zzb(39, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzsm zzsmVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzsmVar);
        zzb(40, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzyt zzkh() throws RemoteException {
        zzyt zzyvVar;
        Parcel zza = zza(41, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzyvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof zzyt) {
                zzyvVar = (zzyt) queryLocalInterface;
            } else {
                zzyvVar = new zzyv(readStrongBinder);
            }
        }
        zza.recycle();
        return zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzyo zzyoVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzyoVar);
        zzb(42, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvi zzviVar, zzww zzwwVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzviVar);
        zzgy.zza(zzdo, zzwwVar);
        zzb(43, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(44, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxw zzxwVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzxwVar);
        zzb(45, zzdo);
    }
}
