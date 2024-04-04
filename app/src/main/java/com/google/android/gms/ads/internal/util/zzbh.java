package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzgw;
import com.google.android.gms.internal.ads.zzgy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbh extends zzgw implements zzbf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.zzbf
    public final boolean zzd(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str);
        zzdo.writeString(str2);
        Parcel zza = zza(1, zzdo);
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzbf
    public final void zzap(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(2, zzdo);
    }
}
