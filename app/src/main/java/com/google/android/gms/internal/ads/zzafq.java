package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzafq extends zzgw implements zzafo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafo
    public final void zza(zzafb zzafbVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzafbVar);
        zzb(1, zzdo);
    }
}
