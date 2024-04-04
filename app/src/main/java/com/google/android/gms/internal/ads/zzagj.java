package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzagj extends IInterface {
    void cancelUnconfirmedClick() throws RemoteException;

    void destroy() throws RemoteException;

    String getAdvertiser() throws RemoteException;

    String getBody() throws RemoteException;

    String getCallToAction() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getHeadline() throws RemoteException;

    List getImages() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    List getMuteThisAdReasons() throws RemoteException;

    String getPrice() throws RemoteException;

    double getStarRating() throws RemoteException;

    String getStore() throws RemoteException;

    zzyu getVideoController() throws RemoteException;

    boolean isCustomClickGestureEnabled() throws RemoteException;

    boolean isCustomMuteThisAdEnabled() throws RemoteException;

    void performClick(Bundle bundle) throws RemoteException;

    void recordCustomClickGesture() throws RemoteException;

    boolean recordImpression(Bundle bundle) throws RemoteException;

    void reportTouchEvent(Bundle bundle) throws RemoteException;

    void zza(zzagi zzagiVar) throws RemoteException;

    void zza(zzyf zzyfVar) throws RemoteException;

    void zza(zzyj zzyjVar) throws RemoteException;

    void zza(zzyo zzyoVar) throws RemoteException;

    zzyt zzkh() throws RemoteException;

    IObjectWrapper zztl() throws RemoteException;

    zzaej zztm() throws RemoteException;

    zzaeb zztn() throws RemoteException;

    IObjectWrapper zzto() throws RemoteException;

    void zztw() throws RemoteException;

    zzaei zztx() throws RemoteException;
}
