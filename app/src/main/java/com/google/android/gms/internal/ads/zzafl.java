package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzafl extends zzgw implements zzafj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final void zza(zzaex zzaexVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaexVar);
        zzb(1, zzdo);
    }
}
