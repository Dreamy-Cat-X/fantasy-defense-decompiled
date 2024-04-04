package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzagk extends zzgw implements zzagi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void onUnconfirmedClickReceived(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void onUnconfirmedClickCancelled() throws RemoteException {
        zzb(2, zzdo());
    }
}
