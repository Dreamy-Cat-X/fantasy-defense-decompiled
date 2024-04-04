package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzavr extends RewardedInterstitialAd {
    private final Context zzaaf;
    private final zzauq zzdxs;
    private final zzavp zzdyk = new zzavp();

    public zzavr(Context context, String str) {
        this.zzaaf = context.getApplicationContext();
        this.zzdxs = zzwo.zzqn().zzc(context, str, new zzamu());
    }

    public final void zza(zzzc zzzcVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            this.zzdxs.zzb(zzvn.zza(this.zzaaf, zzzcVar), new zzavo(rewardedInterstitialAdLoadCallback, this));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzdyk.setFullScreenContentCallback(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            this.zzdxs.zza(new zzavl(serverSideVerificationOptions));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zzdxs.zza(new zzaai(onAdMetadataChangedListener));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            return this.zzdxs.getAdMetadata();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return new Bundle();
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            zzaup zzru = this.zzdxs.zzru();
            if (zzru != null) {
                return new zzave(zzru);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzyt zzytVar;
        try {
            zzytVar = this.zzdxs.zzkh();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            zzytVar = null;
        }
        return ResponseInfo.zza(zzytVar);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzdyk.zza(onUserEarnedRewardListener);
        try {
            this.zzdxs.zza(this.zzdyk);
            this.zzdxs.zze(ObjectWrapper.wrap(activity));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzdxs.zza(new zzaah(onPaidEventListener));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }
}
