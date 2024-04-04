package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzxg;
import com.google.android.gms.internal.ads.zzze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class PublisherAdView extends ViewGroup {
    private final zzze zzadz;

    public PublisherAdView(Context context) {
        super(context);
        this.zzadz = new zzze(this);
    }

    @Deprecated
    public final void setCorrelator(Correlator correlator) {
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzadz = new zzze(this, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzadz = new zzze(this, attributeSet, true);
    }

    public final VideoController getVideoController() {
        return this.zzadz.getVideoController();
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzadz.setVideoOptions(videoOptions);
    }

    public final VideoOptions getVideoOptions() {
        return this.zzadz.getVideoOptions();
    }

    public final void destroy() {
        this.zzadz.destroy();
    }

    public final AdListener getAdListener() {
        return this.zzadz.getAdListener();
    }

    public final AdSize getAdSize() {
        return this.zzadz.getAdSize();
    }

    public final AdSize[] getAdSizes() {
        return this.zzadz.getAdSizes();
    }

    public final String getAdUnitId() {
        return this.zzadz.getAdUnitId();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzadz.zzrq();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzadz.getOnCustomRenderedAdLoadedListener();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzadz.zza(publisherAdRequest.zzds());
    }

    public final void pause() {
        this.zzadz.pause();
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzadz.setManualImpressionsEnabled(z);
    }

    public final void recordManualImpression() {
        this.zzadz.recordManualImpression();
    }

    public final void resume() {
        this.zzadz.resume();
    }

    public final void setAdListener(AdListener adListener) {
        this.zzadz.setAdListener(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zzadz.zza(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        this.zzadz.setAdUnitId(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzadz.zza(appEventListener);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzadz.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzadz.getMediationAdapterClassName();
    }

    public final boolean isLoading() {
        return this.zzadz.isLoading();
    }

    public final ResponseInfo getResponseInfo() {
        return this.zzadz.getResponseInfo();
    }

    public final boolean zza(zzxg zzxgVar) {
        return this.zzadz.zza(zzxgVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        } else {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzaym.zzc("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }
}
