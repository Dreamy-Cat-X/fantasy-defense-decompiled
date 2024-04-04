package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbfc extends zzgw implements zzbfb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zza(IObjectWrapper iObjectWrapper, zzbez zzbezVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzbezVar);
        zzb(2, zzdo);
    }
}
