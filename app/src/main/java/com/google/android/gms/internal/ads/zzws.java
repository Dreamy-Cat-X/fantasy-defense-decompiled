package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzws extends zzgw implements zzwq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzws(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzwq
    public final void onAdClicked() throws RemoteException {
        zzb(1, zzdo());
    }
}
