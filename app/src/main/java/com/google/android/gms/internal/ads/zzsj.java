package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzsj extends zzgw implements zzsh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final zzxg zzdx() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        zzxg zzc = zzxj.zzc(zza.readStrongBinder());
        zza.recycle();
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void zza(zzsn zzsnVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzsnVar);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final void zza(IObjectWrapper iObjectWrapper, zzsr zzsrVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzsrVar);
        zzb(4, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    public final zzyt zzkh() throws RemoteException {
        Parcel zza = zza(5, zzdo());
        zzyt zzj = zzys.zzj(zza.readStrongBinder());
        zza.recycle();
        return zzj;
    }
}
