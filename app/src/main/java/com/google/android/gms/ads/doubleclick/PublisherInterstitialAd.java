package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzzg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class PublisherInterstitialAd {
    private final zzzg zzadh;

    public PublisherInterstitialAd(Context context) {
        this.zzadh = new zzzg(context, this);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    @Deprecated
    public final void setCorrelator(Correlator correlator) {
    }

    public final AdListener getAdListener() {
        return this.zzadh.getAdListener();
    }

    public final String getAdUnitId() {
        return this.zzadh.getAdUnitId();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzadh.getAppEventListener();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzadh.getOnCustomRenderedAdLoadedListener();
    }

    public final boolean isLoaded() {
        return this.zzadh.isLoaded();
    }

    public final boolean isLoading() {
        return this.zzadh.isLoading();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzadh.zza(publisherAdRequest.zzds());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzadh.setAdListener(adListener);
    }

    public final void setAdUnitId(String str) {
        this.zzadh.setAdUnitId(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzadh.setAppEventListener(appEventListener);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzadh.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzadh.getMediationAdapterClassName();
    }

    public final void show() {
        this.zzadh.show();
    }

    public final void setImmersiveMode(boolean z) {
        this.zzadh.setImmersiveMode(z);
    }

    public final ResponseInfo getResponseInfo() {
        return this.zzadh.getResponseInfo();
    }
}
