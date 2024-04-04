package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzaff extends IInterface {
    void destroy() throws RemoteException;

    List<String> getAvailableAssetNames() throws RemoteException;

    String getCustomTemplateId() throws RemoteException;

    zzyu getVideoController() throws RemoteException;

    void performClick(String str) throws RemoteException;

    void recordImpression() throws RemoteException;

    String zzct(String str) throws RemoteException;

    zzaej zzcu(String str) throws RemoteException;

    boolean zzp(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzq(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zztl() throws RemoteException;

    IObjectWrapper zztq() throws RemoteException;

    boolean zztr() throws RemoteException;

    boolean zzts() throws RemoteException;

    void zztt() throws RemoteException;
}
