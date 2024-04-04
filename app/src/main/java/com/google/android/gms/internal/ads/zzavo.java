package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzavo extends zzavb {
    private final RewardedInterstitialAdLoadCallback zzdxv;
    private final zzavr zzdxw;

    public zzavo(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzavr zzavrVar) {
        this.zzdxv = rewardedInterstitialAdLoadCallback;
        this.zzdxw = zzavrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void onRewardedAdLoaded() {
        zzavr zzavrVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zzdxv;
        if (rewardedInterstitialAdLoadCallback == null || (zzavrVar = this.zzdxw) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdLoaded(zzavrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void onRewardedAdFailedToLoad(int i) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zzdxv;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final void zzj(zzvc zzvcVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zzdxv;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdFailedToLoad(zzvcVar.zzqb());
        }
    }
}
