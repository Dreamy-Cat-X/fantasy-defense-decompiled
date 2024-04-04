package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class AdView extends BaseAdView {
    public AdView(Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public final VideoController getVideoController() {
        if (this.zzadc != null) {
            return this.zzadc.getVideoController();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        super.setOnPaidEventListener(onPaidEventListener);
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ ResponseInfo getResponseInfo() {
        return super.getResponseInfo();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    @Deprecated
    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ void setAdSize(AdSize adSize) {
        super.setAdSize(adSize);
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ void setAdListener(AdListener adListener) {
        super.setAdListener(adListener);
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ boolean isLoading() {
        return super.isLoading();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ void resume() {
        super.resume();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ void pause() {
        super.pause();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ void loadAd(AdRequest adRequest) {
        super.loadAd(adRequest);
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ AdSize getAdSize() {
        return super.getAdSize();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ AdListener getAdListener() {
        return super.getAdListener();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public final /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }
}
