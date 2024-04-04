package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzatq extends zzgw implements zzato {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzato
    public final String getType() throws RemoteException {
        Parcel zza = zza(1, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzato
    public final int getAmount() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
