package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaxe extends zzgw implements zzaxc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final void zza(IObjectWrapper iObjectWrapper, zzaxi zzaxiVar, zzaxb zzaxbVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzaxiVar);
        zzgy.zza(zzdo, zzaxbVar);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final void zzan(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, iObjectWrapper2);
        Parcel zza = zza(3, zzdo);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final IObjectWrapper zzao(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        Parcel zza = zza(4, zzdo);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final void zza(List<Uri> list, IObjectWrapper iObjectWrapper, zzarn zzarnVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeTypedList(list);
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzarnVar);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final void zzb(List<Uri> list, IObjectWrapper iObjectWrapper, zzarn zzarnVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeTypedList(list);
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzarnVar);
        zzb(6, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final void zza(zzaru zzaruVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaruVar);
        zzb(7, zzdo);
    }
}
