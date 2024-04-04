package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzc<T extends IInterface> extends BaseGmsClient<T> {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzc(Context context, Looper looper, int i, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        super(context, looper, i, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }
}
