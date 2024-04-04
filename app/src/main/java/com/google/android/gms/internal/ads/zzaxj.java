package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaxj extends zzgw implements zzaxh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzaxh
    public final zzaxc zze(IObjectWrapper iObjectWrapper, zzamt zzamtVar, int i) throws RemoteException {
        zzaxc zzaxeVar;
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzamtVar);
        zzdo.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zza = zza(2, zzdo);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzaxeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof zzaxc) {
                zzaxeVar = (zzaxc) queryLocalInterface;
            } else {
                zzaxeVar = new zzaxe(readStrongBinder);
            }
        }
        zza.recycle();
        return zzaxeVar;
    }
}
