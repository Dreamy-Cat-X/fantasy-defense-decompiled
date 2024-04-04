package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzatv extends IInterface {
    void destroy() throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setAppPackageName(String str) throws RemoteException;

    void setCustomData(String str) throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void show() throws RemoteException;

    void zza(zzatt zzattVar) throws RemoteException;

    void zza(zzaty zzatyVar) throws RemoteException;

    void zza(zzaue zzaueVar) throws RemoteException;

    void zza(zzxn zzxnVar) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzyt zzkh() throws RemoteException;

    void zzl(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzrv() throws RemoteException;
}
