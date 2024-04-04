package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzsp extends zzgw implements zzsn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void onAppOpenAdClosed() throws RemoteException {
        zzb(1, zzdo());
    }
}
