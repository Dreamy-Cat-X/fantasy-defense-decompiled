package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzyq extends zzgw implements zzyo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzyo
    public final void zza(zzvr zzvrVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvrVar);
        zzb(1, zzdo);
    }
}
