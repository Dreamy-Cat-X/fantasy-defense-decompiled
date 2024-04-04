package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzth extends zzgw implements zzti {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzth(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzti
    public final zztc zza(zztd zztdVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zztdVar);
        Parcel zza = zza(1, zzdo);
        zztc zztcVar = (zztc) zzgy.zza(zza, zztc.CREATOR);
        zza.recycle();
        return zztcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzti
    public final zztc zzc(zztd zztdVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zztdVar);
        Parcel zza = zza(2, zzdo);
        zztc zztcVar = (zztc) zzgy.zza(zza, zztc.CREATOR);
        zza.recycle();
        return zztcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzti
    public final long zzb(zztd zztdVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zztdVar);
        Parcel zza = zza(3, zzdo);
        long readLong = zza.readLong();
        zza.recycle();
        return readLong;
    }
}
