package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaii extends com.google.android.gms.ads.internal.zzc<zzain> {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaii(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzatp.zzy(context), looper, 166, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    public final zzain zzuc() throws DeadObjectException {
        return (zzain) super.getService();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        if (queryLocalInterface instanceof zzain) {
            return (zzain) queryLocalInterface;
        }
        return new zzaiq(iBinder);
    }
}
