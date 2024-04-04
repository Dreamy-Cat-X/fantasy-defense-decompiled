package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzajr extends zzgw implements zzajp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzajp
    public final void zza(zzajj zzajjVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzajjVar);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzajp
    public final void onInstreamAdFailedToLoad(int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzajp
    public final void zze(zzvc zzvcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvcVar);
        zzb(3, zzdo);
    }
}
