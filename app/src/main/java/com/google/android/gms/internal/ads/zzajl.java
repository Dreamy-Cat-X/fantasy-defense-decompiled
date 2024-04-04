package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzajl extends zzgw implements zzajj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final zzyu getVideoController() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        zzyu zzk = zzyx.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void destroy() throws RemoteException {
        zzb(4, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zza(IObjectWrapper iObjectWrapper, zzajo zzajoVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzajoVar);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(6, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final zzaei zztx() throws RemoteException {
        Parcel zza = zza(7, zzdo());
        zzaei zzn = zzaeh.zzn(zza.readStrongBinder());
        zza.recycle();
        return zzn;
    }
}
