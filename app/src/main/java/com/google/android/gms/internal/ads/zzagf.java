package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzagf extends zzgw implements zzagd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        Parcel zza = zza(2, zzdo);
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }
}
