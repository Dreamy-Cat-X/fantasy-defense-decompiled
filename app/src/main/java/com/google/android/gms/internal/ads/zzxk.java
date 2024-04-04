package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzxk extends zzgw implements zzxl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final IBinder zza(IObjectWrapper iObjectWrapper, zzvp zzvpVar, String str, zzamt zzamtVar, int i, int i2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzvpVar);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzdo.writeInt(i2);
        Parcel zza = zza(2, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        zza.recycle();
        return readStrongBinder;
    }
}
