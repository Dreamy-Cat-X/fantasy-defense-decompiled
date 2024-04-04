package com.google.ads.mediation.customevent;

import android.app.Activity;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public interface CustomEventBanner extends CustomEvent {
    void requestBannerAd(CustomEventBannerListener customEventBannerListener, Activity activity, String str, String str2, AdSize adSize, MediationAdRequest mediationAdRequest, Object obj);
}
