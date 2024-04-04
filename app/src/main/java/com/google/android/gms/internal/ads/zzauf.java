package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzauf extends zzaub {
    private RewardedVideoAdListener zzckb;

    public zzauf(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzckb = rewardedVideoAdListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoAdLoaded() {
        RewardedVideoAdListener rewardedVideoAdListener = this.zzckb;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoAdOpened() {
        RewardedVideoAdListener rewardedVideoAdListener = this.zzckb;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoStarted() {
        RewardedVideoAdListener rewardedVideoAdListener = this.zzckb;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoStarted();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoAdClosed() {
        RewardedVideoAdListener rewardedVideoAdListener = this.zzckb;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void zza(zzato zzatoVar) {
        RewardedVideoAdListener rewardedVideoAdListener = this.zzckb;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewarded(new zzaud(zzatoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoAdLeftApplication() {
        RewardedVideoAdListener rewardedVideoAdListener = this.zzckb;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoAdFailedToLoad(int i) {
        RewardedVideoAdListener rewardedVideoAdListener = this.zzckb;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void onRewardedVideoCompleted() {
        RewardedVideoAdListener rewardedVideoAdListener = this.zzckb;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoCompleted();
        }
    }

    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        return this.zzckb;
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzckb = rewardedVideoAdListener;
    }
}
