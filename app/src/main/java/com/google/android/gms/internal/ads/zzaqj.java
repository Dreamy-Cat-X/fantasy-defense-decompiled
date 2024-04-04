package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaqj extends zzgw implements zzaqh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(Intent intent) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, intent);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzvp() throws RemoteException {
        zzb(3, zzdo());
    }
}
