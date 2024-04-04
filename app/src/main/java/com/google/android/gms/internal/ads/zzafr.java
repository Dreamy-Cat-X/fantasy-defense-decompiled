package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzafr extends zzgw implements zzafp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zza(zzaff zzaffVar, String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaffVar);
        zzdo.writeString(str);
        zzb(1, zzdo);
    }
}
