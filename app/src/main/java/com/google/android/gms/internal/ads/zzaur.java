package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaur extends zzgw implements zzaup {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaur(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String getType() throws RemoteException {
        Parcel zza = zza(1, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final int getAmount() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
