package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaey extends zzgw implements zzaev {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaey(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final IBinder zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, iObjectWrapper2);
        zzgy.zza(zzdo, iObjectWrapper3);
        Parcel zza = zza(1, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        zza.recycle();
        return readStrongBinder;
    }
}
