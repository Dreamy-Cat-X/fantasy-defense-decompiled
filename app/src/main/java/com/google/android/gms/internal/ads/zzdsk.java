package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdsk extends zzgw implements zzdsi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final boolean zzav(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        Parcel zza = zza(2, zzdo);
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final void zzab(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(4, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, iObjectWrapper2);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final String getVersion() throws RemoteException {
        Parcel zza = zza(6, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final void zzac(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(7, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final void zzd(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, iObjectWrapper2);
        zzb(8, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final IObjectWrapper zza(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str2);
        zzdo.writeString(str3);
        zzdo.writeString(str4);
        zzdo.writeString(str5);
        Parcel zza = zza(9, zzdo);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final IObjectWrapper zza(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str2);
        zzdo.writeString(str3);
        zzdo.writeString(str4);
        zzdo.writeString(str5);
        zzdo.writeString(str6);
        zzdo.writeString(str7);
        zzdo.writeString(str8);
        Parcel zza = zza(10, zzdo);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final IObjectWrapper zzb(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str2);
        zzdo.writeString(str3);
        zzdo.writeString(str4);
        zzdo.writeString(str5);
        zzdo.writeString(str6);
        zzdo.writeString(str7);
        zzdo.writeString(str8);
        Parcel zza = zza(11, zzdo);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
        zza.recycle();
        return asInterface;
    }
}
