package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zza extends AdMetadataListener {
    private final /* synthetic */ AbstractAdViewAdapter zzmm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.zzmm = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        InterstitialAd interstitialAd;
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        InterstitialAd interstitialAd2;
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener2;
        interstitialAd = this.zzmm.zzmj;
        if (interstitialAd != null) {
            mediationRewardedVideoAdListener = this.zzmm.zzmk;
            if (mediationRewardedVideoAdListener != null) {
                interstitialAd2 = this.zzmm.zzmj;
                Bundle adMetadata = interstitialAd2.getAdMetadata();
                mediationRewardedVideoAdListener2 = this.zzmm.zzmk;
                mediationRewardedVideoAdListener2.zzb(adMetadata);
            }
        }
    }
}
