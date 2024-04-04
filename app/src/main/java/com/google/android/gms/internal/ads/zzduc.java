package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzduc extends zzgw implements zzdud {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    public final zzdub zza(zzdtz zzdtzVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzdtzVar);
        Parcel zza = zza(1, zzdo);
        zzdub zzdubVar = (zzdub) zzgy.zza(zza, zzdub.CREATOR);
        zza.recycle();
        return zzdubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    public final void zza(zzdtu zzdtuVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzdtuVar);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    public final zzdul zza(zzduj zzdujVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzdujVar);
        Parcel zza = zza(3, zzdo);
        zzdul zzdulVar = (zzdul) zzgy.zza(zza, zzdul.CREATOR);
        zza.recycle();
        return zzdulVar;
    }
}
