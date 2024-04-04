package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzzb extends zzgw implements zzyz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onVideoStart() throws RemoteException {
        zzb(1, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onVideoPlay() throws RemoteException {
        zzb(2, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onVideoPause() throws RemoteException {
        zzb(3, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onVideoEnd() throws RemoteException {
        zzb(4, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onVideoMute(boolean z) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.writeBoolean(zzdo, z);
        zzb(5, zzdo);
    }
}
