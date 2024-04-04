package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaqn extends zzgw implements zzaqm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final zzaqh zzc(IObjectWrapper iObjectWrapper, zzamt zzamtVar, int i) throws RemoteException {
        zzaqh zzaqjVar;
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zza = zza(1, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzaqjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (queryLocalInterface instanceof zzaqh) {
                zzaqjVar = (zzaqh) queryLocalInterface;
            } else {
                zzaqjVar = new zzaqj(readStrongBinder);
            }
        }
        zza.recycle();
        return zzaqjVar;
    }
}
