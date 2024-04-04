package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzauz extends zzgw implements zzauw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final IBinder zzd(IObjectWrapper iObjectWrapper, String str, zzamt zzamtVar, int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zza = zza(1, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        zza.recycle();
        return readStrongBinder;
    }
}
