package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzasq extends zzgw implements zzaso {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaso
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, parcelFileDescriptor);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaso
    public final void zza(com.google.android.gms.ads.internal.util.zzap zzapVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzapVar);
        zzb(2, zzdo);
    }
}
