package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaop extends zzgw implements zzaon {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaop(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzx(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzdl(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzg(zzvc zzvcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvcVar);
        zzb(3, zzdo);
    }
}
