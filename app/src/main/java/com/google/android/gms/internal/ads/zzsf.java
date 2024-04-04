package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAdPresentationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzsf extends zzsq {
    private final AppOpenAdPresentationCallback zzbuh;

    public zzsf(AppOpenAdPresentationCallback appOpenAdPresentationCallback) {
        this.zzbuh = appOpenAdPresentationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    public final void onAppOpenAdClosed() {
        this.zzbuh.onAppOpenAdClosed();
    }
}
