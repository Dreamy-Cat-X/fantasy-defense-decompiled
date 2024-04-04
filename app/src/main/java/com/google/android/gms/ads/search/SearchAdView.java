package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class SearchAdView extends ViewGroup {
    private final zzze zzadz;

    public SearchAdView(Context context) {
        super(context);
        this.zzadz = new zzze(this);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzadz = new zzze(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzadz = new zzze(this, attributeSet, false);
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

    public final String getAdUnitId() {
        return this.zzadz.getAdUnitId();
    }

    public final void loadAd(SearchAdRequest searchAdRequest) {
        this.zzadz.zza(searchAdRequest.zzds());
    }

    public final void loadAd(DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (!AdSize.SEARCH.equals(getAdSize())) {
            throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        }
        this.zzadz.zza(dynamicHeightSearchAdRequest.zzds());
    }

    public final void pause() {
        this.zzadz.pause();
    }

    public final void resume() {
        this.zzadz.resume();
    }

    public final void setAdListener(AdListener adListener) {
        this.zzadz.setAdListener(adListener);
    }

    public final void setAdSize(AdSize adSize) {
        this.zzadz.setAdSizes(adSize);
    }

    public final void setAdUnitId(String str) {
        this.zzadz.setAdUnitId(str);
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
