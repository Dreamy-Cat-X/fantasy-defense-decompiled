package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaep extends zzgw implements zzaen {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaep(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final IObjectWrapper zzco(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        Parcel zza = zza(2, zzdo);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zza(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void destroy() throws RemoteException {
        zzb(4, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zzc(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeInt(i);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(6, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(7, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zza(zzaei zzaeiVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaeiVar);
        zzb(8, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(9, zzdo);
    }
}
