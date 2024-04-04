package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzavp extends zzauu {
    private FullScreenContentCallback zzdxx;
    private OnUserEarnedRewardListener zzdxy;

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void onRewardedAdFailedToShow(int i) {
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzdxx = fullScreenContentCallback;
    }

    public final void zza(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzdxy = onUserEarnedRewardListener;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void onRewardedAdOpened() {
        FullScreenContentCallback fullScreenContentCallback = this.zzdxx;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void onRewardedAdClosed() {
        FullScreenContentCallback fullScreenContentCallback = this.zzdxx;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzi(zzvc zzvcVar) {
        FullScreenContentCallback fullScreenContentCallback = this.zzdxx;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzvcVar.zzqa());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zza(zzaup zzaupVar) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.zzdxy;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new zzave(zzaupVar));
        }
    }
}
