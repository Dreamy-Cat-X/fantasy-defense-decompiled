package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzace extends zzgw implements zzacc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzace(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final String zzsr() throws RemoteException {
        Parcel zza = zza(1, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final String getContent() throws RemoteException {
        Parcel zza = zza(2, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void recordClick() throws RemoteException {
        zzb(4, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void recordImpression() throws RemoteException {
        zzb(5, zzdo());
    }
}
