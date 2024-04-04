package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaao extends zzagg {
    private final ShouldDelayBannerRenderingListener zzcld;

    public zzaao(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.zzcld = shouldDelayBannerRenderingListener;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        return this.zzcld.shouldDelayBannerRendering((Runnable) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
