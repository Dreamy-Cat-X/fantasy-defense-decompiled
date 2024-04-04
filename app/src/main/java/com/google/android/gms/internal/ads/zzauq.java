package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzauq extends IInterface {
    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    void zza(zzauv zzauvVar) throws RemoteException;

    void zza(zzavd zzavdVar) throws RemoteException;

    void zza(zzavl zzavlVar) throws RemoteException;

    void zza(zzvi zzviVar, zzauy zzauyVar) throws RemoteException;

    void zza(zzyn zzynVar) throws RemoteException;

    void zza(zzyo zzyoVar) throws RemoteException;

    void zzb(zzvi zzviVar, zzauy zzauyVar) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzyt zzkh() throws RemoteException;

    zzaup zzru() throws RemoteException;
}
