package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzxg extends IInterface {
    void destroy() throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getAdUnitId() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzyu getVideoController() throws RemoteException;

    boolean isLoading() throws RemoteException;

    boolean isReady() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setManualImpressionsEnabled(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void stopLoading() throws RemoteException;

    void zza(zzaaq zzaaqVar) throws RemoteException;

    void zza(zzacd zzacdVar) throws RemoteException;

    void zza(zzarc zzarcVar) throws RemoteException;

    void zza(zzari zzariVar, String str) throws RemoteException;

    void zza(zzaty zzatyVar) throws RemoteException;

    void zza(zzsm zzsmVar) throws RemoteException;

    void zza(zzvi zzviVar, zzww zzwwVar) throws RemoteException;

    void zza(zzvp zzvpVar) throws RemoteException;

    void zza(zzvu zzvuVar) throws RemoteException;

    void zza(zzwq zzwqVar) throws RemoteException;

    void zza(zzwv zzwvVar) throws RemoteException;

    void zza(zzxn zzxnVar) throws RemoteException;

    void zza(zzxo zzxoVar) throws RemoteException;

    void zza(zzxu zzxuVar) throws RemoteException;

    void zza(zzxw zzxwVar) throws RemoteException;

    void zza(zzyo zzyoVar) throws RemoteException;

    void zza(zzza zzzaVar) throws RemoteException;

    boolean zza(zzvi zzviVar) throws RemoteException;

    void zzbl(String str) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzkd() throws RemoteException;

    void zzke() throws RemoteException;

    zzvp zzkf() throws RemoteException;

    String zzkg() throws RemoteException;

    zzyt zzkh() throws RemoteException;

    zzxo zzki() throws RemoteException;

    zzwv zzkj() throws RemoteException;
}
