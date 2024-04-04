package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaus extends zzgw implements zzauq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaus(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzvi zzviVar, zzauy zzauyVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzviVar);
        zzgy.zza(zzdo, zzauyVar);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzauv zzauvVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzauvVar);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final boolean isLoaded() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel zza = zza(4, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzavd zzavdVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzavdVar);
        zzb(6, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzavl zzavlVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzavlVar);
        zzb(7, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzyn zzynVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzynVar);
        zzb(8, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel zza = zza(9, zzdo());
        Bundle bundle = (Bundle) zzgy.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.writeBoolean(zzdo, z);
        zzb(10, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final zzaup zzru() throws RemoteException {
        zzaup zzaurVar;
        Parcel zza = zza(11, zzdo());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzaurVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (queryLocalInterface instanceof zzaup) {
                zzaurVar = (zzaup) queryLocalInterface;
            } else {
                zzaurVar = new zzaur(readStrongBinder);
            }
        }
        zza.recycle();
        return zzaurVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final zzyt zzkh() throws RemoteException {
        Parcel zza = zza(12, zzdo());
        zzyt zzj = zzys.zzj(zza.readStrongBinder());
        zza.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zza(zzyo zzyoVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzyoVar);
        zzb(13, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauq
    public final void zzb(zzvi zzviVar, zzauy zzauyVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzviVar);
        zzgy.zza(zzdo, zzauyVar);
        zzb(14, zzdo);
    }
}
