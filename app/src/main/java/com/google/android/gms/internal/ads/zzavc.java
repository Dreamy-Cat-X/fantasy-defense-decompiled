package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzavc extends zzgw implements zzavd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.zzavd
    public final void zza(zzaup zzaupVar, String str, String str2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaupVar);
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzb(2, zzdo);
    }
}
