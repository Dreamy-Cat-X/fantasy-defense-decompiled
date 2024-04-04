package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzaoz extends IInterface {
    zzyu getVideoController() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzvp zzvpVar, zzape zzapeVar) throws RemoteException;

    void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaon zzaonVar, zzamz zzamzVar, zzvp zzvpVar) throws RemoteException;

    void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaos zzaosVar, zzamz zzamzVar) throws RemoteException;

    void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaot zzaotVar, zzamz zzamzVar) throws RemoteException;

    void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaoy zzaoyVar, zzamz zzamzVar) throws RemoteException;

    void zza(String[] strArr, Bundle[] bundleArr) throws RemoteException;

    boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzb(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaoy zzaoyVar, zzamz zzamzVar) throws RemoteException;

    void zzdm(String str) throws RemoteException;

    zzapn zzvb() throws RemoteException;

    zzapn zzvc() throws RemoteException;

    void zzy(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException;
}
