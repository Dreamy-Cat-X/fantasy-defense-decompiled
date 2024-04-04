package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzavh extends zzauu {
    private final RewardedAdCallback zzdxt;

    public zzavh(RewardedAdCallback rewardedAdCallback) {
        this.zzdxt = rewardedAdCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void onRewardedAdOpened() {
        RewardedAdCallback rewardedAdCallback = this.zzdxt;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void onRewardedAdClosed() {
        RewardedAdCallback rewardedAdCallback = this.zzdxt;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zza(zzaup zzaupVar) {
        RewardedAdCallback rewardedAdCallback = this.zzdxt;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onUserEarnedReward(new zzave(zzaupVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void onRewardedAdFailedToShow(int i) {
        RewardedAdCallback rewardedAdCallback = this.zzdxt;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzi(zzvc zzvcVar) {
        RewardedAdCallback rewardedAdCallback = this.zzdxt;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(zzvcVar.zzqa());
        }
    }
}
