package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzafy extends zzgw implements zzafv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafv
    public final void zztv() throws RemoteException {
        zzb(2, zzdo());
    }
}
