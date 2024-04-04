package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzr extends com.google.android.gms.internal.common.zzb implements zzq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzq
    public final boolean zza(com.google.android.gms.common.zzj zzjVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a_ = a_();
        com.google.android.gms.internal.common.zzd.zza(a_, zzjVar);
        com.google.android.gms.internal.common.zzd.zza(a_, iObjectWrapper);
        Parcel zza = zza(5, a_);
        boolean zza2 = com.google.android.gms.internal.common.zzd.zza(zza);
        zza.recycle();
        return zza2;
    }
}
