package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzyp extends zzgw implements zzyn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzyn
    public final void onAdMetadataChanged() throws RemoteException {
        zzb(1, zzdo());
    }
}
