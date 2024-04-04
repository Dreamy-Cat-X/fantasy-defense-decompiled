package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzajq extends zzgw implements zzajo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final void zzud() throws RemoteException {
        zzb(1, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final void zzdb(int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzb(2, zzdo);
    }
}
