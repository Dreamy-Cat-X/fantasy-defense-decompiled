package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzdsi extends IInterface {
    String getVersion() throws RemoteException;

    IObjectWrapper zza(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5) throws RemoteException;

    IObjectWrapper zza(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException;

    void zzab(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzac(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzav(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzb(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException;

    void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;
}
