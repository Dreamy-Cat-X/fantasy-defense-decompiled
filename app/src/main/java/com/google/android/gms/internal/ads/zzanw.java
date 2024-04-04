package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzanw extends zzanf {
    private final NativeAppInstallAdMapper zzdms;

    public zzanw(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.zzdms = nativeAppInstallAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaeb zztn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper zzto() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getHeadline() {
        return this.zzdms.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final List getImages() {
        List<NativeAd.Image> images = this.zzdms.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image image : images) {
            arrayList.add(new zzadv(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getBody() {
        return this.zzdms.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaej zztm() {
        NativeAd.Image icon = this.zzdms.getIcon();
        if (icon != null) {
            return new zzadv(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getCallToAction() {
        return this.zzdms.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final double getStarRating() {
        return this.zzdms.getStarRating();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getStore() {
        return this.zzdms.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getPrice() {
        return this.zzdms.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void recordImpression() {
        this.zzdms.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdms.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzv(IObjectWrapper iObjectWrapper) {
        this.zzdms.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdms.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdms.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final boolean getOverrideImpressionRecording() {
        return this.zzdms.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final boolean getOverrideClickHandling() {
        return this.zzdms.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final Bundle getExtras() {
        return this.zzdms.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzyu getVideoController() {
        if (this.zzdms.getVideoController() != null) {
            return this.zzdms.getVideoController().zzdw();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper zzvf() {
        View adChoicesContent = this.zzdms.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final IObjectWrapper zzvg() {
        View zzaer = this.zzdms.zzaer();
        if (zzaer == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzaer);
    }
}
