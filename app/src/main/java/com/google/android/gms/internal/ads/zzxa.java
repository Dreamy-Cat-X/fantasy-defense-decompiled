package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzxa extends zzgw implements zzwy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final void zzb(zzvi zzviVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzviVar);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final boolean isLoading() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final String zzkg() throws RemoteException {
        Parcel zza = zza(4, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final void zza(zzvi zzviVar, int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzviVar);
        zzdo.writeInt(i);
        zzb(5, zzdo);
    }
}
