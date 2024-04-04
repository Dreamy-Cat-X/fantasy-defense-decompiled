package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzwy extends IInterface {
    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoading() throws RemoteException;

    void zza(zzvi zzviVar, int i) throws RemoteException;

    void zzb(zzvi zzviVar) throws RemoteException;

    String zzkg() throws RemoteException;
}
