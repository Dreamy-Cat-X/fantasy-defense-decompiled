package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzacf extends zzgw implements zzacd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzacd
    public final void zza(zzacc zzaccVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaccVar);
        zzb(1, zzdo);
    }
}
