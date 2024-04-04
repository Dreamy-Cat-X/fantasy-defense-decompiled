package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzavf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class RewardedAd {
    private final zzavf zzhqo;

    public RewardedAd(Context context, String str) {
        Preconditions.checkNotNull(context, "context cannot be null");
        Preconditions.checkNotNull(str, "adUnitID cannot be null");
        this.zzhqo = new zzavf(context, str);
    }

    public final void loadAd(AdRequest adRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzhqo.zza(adRequest.zzds(), rewardedAdLoadCallback);
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzhqo.zza(publisherAdRequest.zzds(), rewardedAdLoadCallback);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzhqo.getMediationAdapterClassName();
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.zzhqo.setServerSideVerificationOptions(serverSideVerificationOptions);
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzhqo.setOnAdMetadataChangedListener(onAdMetadataChangedListener);
    }

    public final Bundle getAdMetadata() {
        return this.zzhqo.getAdMetadata();
    }

    public final boolean isLoaded() {
        return this.zzhqo.isLoaded();
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback) {
        this.zzhqo.show(activity, rewardedAdCallback);
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback, boolean z) {
        this.zzhqo.show(activity, rewardedAdCallback, z);
    }

    public final RewardItem getRewardItem() {
        return this.zzhqo.getRewardItem();
    }

    public final ResponseInfo getResponseInfo() {
        return this.zzhqo.getResponseInfo();
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzhqo.setOnPaidEventListener(onPaidEventListener);
    }
}
