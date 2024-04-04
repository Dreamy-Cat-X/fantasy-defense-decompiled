package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzso extends zzgw implements zzsm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzso(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final void zza(zzsh zzshVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzshVar);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final void onAppOpenAdFailedToLoad(int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final void zza(zzvc zzvcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvcVar);
        zzb(3, zzdo);
    }
}
