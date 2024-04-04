package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.ArrayUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzte extends com.google.android.gms.ads.internal.zzc<zzti> {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzte(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzatp.zzy(context), looper, 123, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.ads.zzb.zzadg;
    }

    public final zzti zznc() throws DeadObjectException {
        return (zzti) super.getService();
    }

    public final boolean zznd() {
        return ((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue() && ArrayUtils.contains(getAvailableFeatures(), com.google.android.gms.ads.zzb.zzadf);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        if (queryLocalInterface instanceof zzti) {
            return (zzti) queryLocalInterface;
        }
        return new zzth(iBinder);
    }
}
