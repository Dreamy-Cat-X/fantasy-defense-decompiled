package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzanh extends IInterface {
    String getAdvertiser() throws RemoteException;

    String getBody() throws RemoteException;

    String getCallToAction() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getHeadline() throws RemoteException;

    List getImages() throws RemoteException;

    boolean getOverrideClickHandling() throws RemoteException;

    boolean getOverrideImpressionRecording() throws RemoteException;

    zzyu getVideoController() throws RemoteException;

    void recordImpression() throws RemoteException;

    void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    zzaeb zztn() throws RemoteException;

    IObjectWrapper zzto() throws RemoteException;

    zzaej zztp() throws RemoteException;

    void zzu(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzv(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzvf() throws RemoteException;

    IObjectWrapper zzvg() throws RemoteException;

    void zzw(IObjectWrapper iObjectWrapper) throws RemoteException;
}
