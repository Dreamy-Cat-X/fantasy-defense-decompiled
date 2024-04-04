package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzamz extends IInterface {
    void onAdClicked() throws RemoteException;

    void onAdClosed() throws RemoteException;

    void onAdFailedToLoad(int i) throws RemoteException;

    void onAdImpression() throws RemoteException;

    void onAdLeftApplication() throws RemoteException;

    void onAdLoaded() throws RemoteException;

    void onAdOpened() throws RemoteException;

    void onAppEvent(String str, String str2) throws RemoteException;

    void onVideoEnd() throws RemoteException;

    void onVideoPause() throws RemoteException;

    void onVideoPlay() throws RemoteException;

    void zza(zzaff zzaffVar, String str) throws RemoteException;

    void zza(zzane zzaneVar) throws RemoteException;

    void zza(zzaup zzaupVar) throws RemoteException;

    void zzb(Bundle bundle) throws RemoteException;

    void zzb(zzaun zzaunVar) throws RemoteException;

    void zzc(int i, String str) throws RemoteException;

    void zzc(zzvc zzvcVar) throws RemoteException;

    void zzdc(int i) throws RemoteException;

    void zzdi(String str) throws RemoteException;

    void zzdj(String str) throws RemoteException;

    void zzf(zzvc zzvcVar) throws RemoteException;

    void zzvd() throws RemoteException;

    void zzve() throws RemoteException;
}
