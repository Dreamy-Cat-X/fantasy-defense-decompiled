package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaxd extends zzgw implements zzaxb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zzj(String str, String str2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void onError(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zza(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzgy.zza(zzdo, bundle);
        zzb(3, zzdo);
    }
}
