package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaul extends zzgw implements zzauj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaul(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzaf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzd(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeInt(i);
        zzb(2, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzag(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzah(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(4, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzai(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(5, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzaj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(6, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zza(IObjectWrapper iObjectWrapper, zzaun zzaunVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzgy.zza(zzdo, zzaunVar);
        zzb(7, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzak(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(8, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzdo.writeInt(i);
        zzb(9, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzal(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(10, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzam(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(11, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, bundle);
        zzb(12, zzdo);
    }
}
