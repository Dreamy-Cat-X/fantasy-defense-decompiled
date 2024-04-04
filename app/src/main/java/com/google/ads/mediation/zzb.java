package com.google.ads.mediation;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzb implements RewardedVideoAdListener {
    private final /* synthetic */ AbstractAdViewAdapter zzmm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.zzmm = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdLoaded() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzmm.zzmk;
        mediationRewardedVideoAdListener.onAdLoaded(this.zzmm);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdOpened() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzmm.zzmk;
        mediationRewardedVideoAdListener.onAdOpened(this.zzmm);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoStarted() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzmm.zzmk;
        mediationRewardedVideoAdListener.onVideoStarted(this.zzmm);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdClosed() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzmm.zzmk;
        mediationRewardedVideoAdListener.onAdClosed(this.zzmm);
        AbstractAdViewAdapter.zza(this.zzmm, (InterstitialAd) null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewarded(RewardItem rewardItem) {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzmm.zzmk;
        mediationRewardedVideoAdListener.onRewarded(this.zzmm, rewardItem);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdLeftApplication() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzmm.zzmk;
        mediationRewardedVideoAdListener.onAdLeftApplication(this.zzmm);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdFailedToLoad(int i) {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzmm.zzmk;
        mediationRewardedVideoAdListener.onAdFailedToLoad(this.zzmm, i);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener = this.zzmm.zzmk;
        mediationRewardedVideoAdListener.onVideoCompleted(this.zzmm);
    }
}
