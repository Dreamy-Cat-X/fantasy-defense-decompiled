package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzaei extends IInterface {
    float getAspectRatio() throws RemoteException;

    float getCurrentTime() throws RemoteException;

    float getDuration() throws RemoteException;

    zzyu getVideoController() throws RemoteException;

    boolean hasVideoContent() throws RemoteException;

    void zza(zzafv zzafvVar) throws RemoteException;

    void zzo(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zztk() throws RemoteException;
}
