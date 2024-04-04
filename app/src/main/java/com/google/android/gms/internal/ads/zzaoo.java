package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaoo extends zzanl {
    private final UnifiedNativeAdMapper zzdnc;

    public zzaoo(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzdnc = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final zzaeb zztn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getHeadline() {
        return this.zzdnc.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final List getImages() {
        List<NativeAd.Image> images = this.zzdnc.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzadv(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getBody() {
        return this.zzdnc.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final zzaej zztm() {
        NativeAd.Image icon = this.zzdnc.getIcon();
        if (icon != null) {
            return new zzadv(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getCallToAction() {
        return this.zzdnc.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getAdvertiser() {
        return this.zzdnc.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final double getStarRating() {
        if (this.zzdnc.getStarRating() != null) {
            return this.zzdnc.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getStore() {
        return this.zzdnc.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final String getPrice() {
        return this.zzdnc.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final zzyu getVideoController() {
        if (this.zzdnc.getVideoController() != null) {
            return this.zzdnc.getVideoController().zzdw();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final IObjectWrapper zzvf() {
        View adChoicesContent = this.zzdnc.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final IObjectWrapper zzvg() {
        View zzaer = this.zzdnc.zzaer();
        if (zzaer == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzaer);
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final float getMediaContentAspectRatio() {
        return this.zzdnc.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final float getVideoDuration() {
        return this.zzdnc.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final float getVideoCurrentTime() {
        return this.zzdnc.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final IObjectWrapper zzto() {
        Object zzjw = this.zzdnc.zzjw();
        if (zzjw == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzjw);
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final Bundle getExtras() {
        return this.zzdnc.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final boolean getOverrideImpressionRecording() {
        return this.zzdnc.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final boolean getOverrideClickHandling() {
        return this.zzdnc.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final void recordImpression() {
        this.zzdnc.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdnc.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdnc.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzanm
    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdnc.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
