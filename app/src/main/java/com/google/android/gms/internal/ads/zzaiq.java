package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaiq extends zzgw implements zzain {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaiq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final void zza(zzaih zzaihVar, zzail zzailVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaihVar);
        zzgy.zza(zzdo, zzailVar);
        zzc(2, zzdo);
    }
}
