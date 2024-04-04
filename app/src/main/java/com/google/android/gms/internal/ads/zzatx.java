package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzatx extends zzgw implements zzatv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza(zzaue zzaueVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaueVar);
        zzb(1, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void show() throws RemoteException {
        zzb(2, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza(zzaty zzatyVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzatyVar);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final boolean isLoaded() throws RemoteException {
        Parcel zza = zza(5, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void pause() throws RemoteException {
        zzb(6, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void resume() throws RemoteException {
        zzb(7, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void destroy() throws RemoteException {
        zzb(8, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(9, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(10, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(11, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel zza = zza(12, zzdo());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void setUserId(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(13, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza(zzxn zzxnVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzxnVar);
        zzb(14, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel zza = zza(15, zzdo());
        Bundle bundle = (Bundle) zzgy.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zza(zzatt zzattVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzattVar);
        zzb(16, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void setAppPackageName(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(17, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, iObjectWrapper);
        zzb(18, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void setCustomData(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(19, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.writeBoolean(zzdo, z);
        zzb(34, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final boolean zzrv() throws RemoteException {
        Parcel zza = zza(20, zzdo());
        boolean zza2 = zzgy.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final zzyt zzkh() throws RemoteException {
        Parcel zza = zza(21, zzdo());
        zzyt zzj = zzys.zzj(zza.readStrongBinder());
        zza.recycle();
        return zzj;
    }
}
