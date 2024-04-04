package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaov extends zzgw implements zzaot {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaov(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zza(zzanm zzanmVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzanmVar);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zzdl(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaot
    public final void zzg(zzvc zzvcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvcVar);
        zzb(3, zzdo);
    }
}
