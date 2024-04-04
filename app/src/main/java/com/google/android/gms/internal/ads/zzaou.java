package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaou extends zzgw implements zzaos {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaou(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void zzvm() throws RemoteException {
        zzb(2, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void zzdl(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaos
    public final void zzg(zzvc zzvcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvcVar);
        zzb(4, zzdo);
    }
}
