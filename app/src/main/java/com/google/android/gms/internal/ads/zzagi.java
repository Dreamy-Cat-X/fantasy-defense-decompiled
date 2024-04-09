package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzagi extends IInterface {
    void onUnconfirmedClickCancelled() throws RemoteException;

    void onUnconfirmedClickReceived(String str) throws RemoteException;
}