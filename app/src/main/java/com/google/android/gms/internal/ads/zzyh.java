package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzyh extends zzgw implements zzyf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final void onAdMuted() throws RemoteException {
        zzb(1, zzdo());
    }
}
