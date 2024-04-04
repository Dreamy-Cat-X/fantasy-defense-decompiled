package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaje extends zzgw implements zzajc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaje(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zze(List<zzaiv> list) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeTypedList(list);
        zzb(1, zzdo);
    }
}
