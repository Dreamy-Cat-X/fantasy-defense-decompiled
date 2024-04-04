package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzats extends zzgw implements zzatt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzats(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final void zza(zzato zzatoVar, String str, String str2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzatoVar);
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzb(2, zzdo);
    }
}
