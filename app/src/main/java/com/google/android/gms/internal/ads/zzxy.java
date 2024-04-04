package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzxy extends IInterface {
    String getVersionString() throws RemoteException;

    void initialize() throws RemoteException;

    void setAppMuted(boolean z) throws RemoteException;

    void setAppVolume(float f) throws RemoteException;

    void zza(zzaak zzaakVar) throws RemoteException;

    void zza(zzajc zzajcVar) throws RemoteException;

    void zza(zzamt zzamtVar) throws RemoteException;

    void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzcd(String str) throws RemoteException;

    void zzce(String str) throws RemoteException;

    float zzqz() throws RemoteException;

    boolean zzra() throws RemoteException;

    List<zzaiv> zzrb() throws RemoteException;

    void zzrc() throws RemoteException;
}
