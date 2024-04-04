package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzasc extends com.google.android.gms.ads.internal.zzc<zzasl> {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public zzasc(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzatp.zzy(context), looper, 8, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    public final zzasl zzwg() throws DeadObjectException {
        return (zzasl) super.getService();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (queryLocalInterface instanceof zzasl) {
            return (zzasl) queryLocalInterface;
        }
        return new zzasn(iBinder);
    }
}
