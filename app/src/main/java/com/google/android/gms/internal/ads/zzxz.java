package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzxz extends zzgw implements zzxw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzb(zzvc zzvcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvcVar);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void onAdShowedFullScreenContent() throws RemoteException {
        zzb(2, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void onAdDismissedFullScreenContent() throws RemoteException {
        zzb(3, zzdo());
    }
}
