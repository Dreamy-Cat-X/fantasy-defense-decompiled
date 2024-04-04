package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzafz extends zzgw implements zzafx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final void zza(zzxg zzxgVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzxgVar);
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(1, zzdo);
    }
}
