package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzage extends zzgw implements zzagc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzage(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzagc
    public final void zza(zzagj zzagjVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzagjVar);
        zzb(1, zzdo);
    }
}
