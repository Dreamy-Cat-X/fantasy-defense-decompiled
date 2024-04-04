package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzuz;
import com.google.android.gms.internal.ads.zzzg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class InterstitialAd {
    private final zzzg zzadh;

    public InterstitialAd(Context context) {
        this.zzadh = new zzzg(context);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.zzadh.getAdListener();
    }

    public final String getAdUnitId() {
        return this.zzadh.getAdUnitId();
    }

    public final boolean isLoaded() {
        return this.zzadh.isLoaded();
    }

    public final boolean isLoading() {
        return this.zzadh.isLoading();
    }

    public final void loadAd(AdRequest adRequest) {
        this.zzadh.zza(adRequest.zzds());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setAdListener(AdListener adListener) {
        this.zzadh.setAdListener(adListener);
        if (adListener != 0 && (adListener instanceof zzuz)) {
            this.zzadh.zza((zzuz) adListener);
        } else if (adListener == 0) {
            this.zzadh.zza((zzuz) null);
        }
    }

    public final void setAdUnitId(String str) {
        this.zzadh.setAdUnitId(str);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzadh.getMediationAdapterClassName();
    }

    public final void show() {
        this.zzadh.show();
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzadh.setRewardedVideoAdListener(rewardedVideoAdListener);
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        this.zzadh.setAdMetadataListener(adMetadataListener);
    }

    public final Bundle getAdMetadata() {
        return this.zzadh.getAdMetadata();
    }

    public final void zzd(boolean z) {
        this.zzadh.zzd(true);
    }

    public final void setImmersiveMode(boolean z) {
        this.zzadh.setImmersiveMode(z);
    }

    public final ResponseInfo getResponseInfo() {
        return this.zzadh.getResponseInfo();
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzadh.setOnPaidEventListener(onPaidEventListener);
    }
}
