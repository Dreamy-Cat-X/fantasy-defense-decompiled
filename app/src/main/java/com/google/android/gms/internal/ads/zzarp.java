package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzarp extends zzgw implements zzarn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void onSuccess(List<Uri> list) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeTypedList(list);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void onError(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(2, zzdo);
    }
}
