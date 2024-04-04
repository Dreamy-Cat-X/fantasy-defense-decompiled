package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzyt extends IInterface {
    List<zzvt> getAdapterResponses() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    String getResponseId() throws RemoteException;
}
