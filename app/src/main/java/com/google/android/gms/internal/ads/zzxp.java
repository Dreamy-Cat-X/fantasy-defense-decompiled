package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzxp extends zzgw implements zzxn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void onAdMetadataChanged() throws RemoteException {
        zzb(1, zzdo());
    }
}
