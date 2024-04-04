package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzagx extends zzagb {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zzdfr;

    public zzagx(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zzdfr = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzagc
    public final void zza(zzagj zzagjVar) {
        this.zzdfr.onUnifiedNativeAdLoaded(new zzago(zzagjVar));
    }
}
