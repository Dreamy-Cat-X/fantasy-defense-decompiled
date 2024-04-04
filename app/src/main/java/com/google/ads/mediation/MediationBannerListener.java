package com.google.ads.mediation;

import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public interface MediationBannerListener {
    void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter);

    void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter);

    void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, AdRequest.ErrorCode errorCode);

    void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter);

    void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter);

    void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter);
}
