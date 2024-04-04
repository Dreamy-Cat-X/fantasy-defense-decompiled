package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzyv extends zzgw implements zzyt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel zza = zza(1, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final String getResponseId() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final List<zzvt> getAdapterResponses() throws RemoteException {
        Parcel zza = zza(3, zzdo());
        ArrayList createTypedArrayList = zza.createTypedArrayList(zzvt.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }
}
