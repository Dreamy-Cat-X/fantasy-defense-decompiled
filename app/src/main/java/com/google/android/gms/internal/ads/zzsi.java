package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzsi extends zzsu {
    private final FullScreenContentCallback zzbuj;

    public zzsi(FullScreenContentCallback fullScreenContentCallback) {
        this.zzbuj = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void onAdShowedFullScreenContent() throws RemoteException {
        this.zzbuj.onAdShowedFullScreenContent();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void onAdDismissedFullScreenContent() throws RemoteException {
        this.zzbuj.onAdDismissedFullScreenContent();
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final void zzb(zzvc zzvcVar) throws RemoteException {
        this.zzbuj.onAdFailedToShowFullScreenContent(zzvcVar.zzqa());
    }
}
