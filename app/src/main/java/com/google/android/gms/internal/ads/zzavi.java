package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzavi extends zzavb {
    private final RewardedAdLoadCallback zzdxu;

    public zzavi(RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzdxu = rewardedAdLoadCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void onRewardedAdLoaded() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zzdxu;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void onRewardedAdFailedToLoad(int i) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zzdxu;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void zzj(zzvc zzvcVar) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zzdxu;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(zzvcVar.zzqb());
        }
    }
}
