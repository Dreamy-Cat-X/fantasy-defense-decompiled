package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwz extends zzgw implements zzww {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final void onAdLoaded() throws RemoteException {
        zzb(1, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final void zzd(zzvc zzvcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvcVar);
        zzb(2, zzdo);
    }
}
