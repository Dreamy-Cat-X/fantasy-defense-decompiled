package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzanb extends zzgw implements zzamz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdClicked() throws RemoteException {
        zzb(1, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdClosed() throws RemoteException {
        zzb(2, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdFailedToLoad(int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzb(3, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdLeftApplication() throws RemoteException {
        zzb(4, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdOpened() throws RemoteException {
        zzb(5, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdLoaded() throws RemoteException {
        zzb(6, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzane zzaneVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaneVar);
        zzb(7, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdImpression() throws RemoteException {
        zzb(8, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAppEvent(String str, String str2) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzdo.writeString(str2);
        zzb(9, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzaff zzaffVar, String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaffVar);
        zzdo.writeString(str);
        zzb(10, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onVideoEnd() throws RemoteException {
        zzb(11, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzdi(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(12, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzvd() throws RemoteException {
        zzb(13, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzaun zzaunVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaunVar);
        zzb(14, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onVideoPause() throws RemoteException {
        zzb(15, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzaup zzaupVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzaupVar);
        zzb(16, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzdc(int i) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzb(17, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzve() throws RemoteException {
        zzb(18, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, bundle);
        zzb(19, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onVideoPlay() throws RemoteException {
        zzb(20, zzdo());
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzdj(String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeString(str);
        zzb(21, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(int i, String str) throws RemoteException {
        Parcel zzdo = zzdo();
        zzdo.writeInt(i);
        zzdo.writeString(str);
        zzb(22, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(zzvc zzvcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvcVar);
        zzb(23, zzdo);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzf(zzvc zzvcVar) throws RemoteException {
        Parcel zzdo = zzdo();
        zzgy.zza(zzdo, zzvcVar);
        zzb(24, zzdo);
    }
}
