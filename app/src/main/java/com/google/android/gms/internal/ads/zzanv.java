package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzanv extends zzank {
    private final NativeContentAdMapper zzdmr;

    public zzanv(NativeContentAdMapper nativeContentAdMapper) {
        this.zzdmr = nativeContentAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final zzaeb zztn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final IObjectWrapper zzto() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final String getHeadline() {
        return this.zzdmr.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final List getImages() {
        List<NativeAd.Image> images = this.zzdmr.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image image : images) {
            arrayList.add(new zzadv(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final String getBody() {
        return this.zzdmr.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final zzaej zztp() {
        NativeAd.Image logo = this.zzdmr.getLogo();
        if (logo != null) {
            return new zzadv(logo.getDrawable(), logo.getUri(), logo.getScale(), logo.getWidth(), logo.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final String getCallToAction() {
        return this.zzdmr.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final String getAdvertiser() {
        return this.zzdmr.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final void recordImpression() {
        this.zzdmr.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdmr.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final void zzv(IObjectWrapper iObjectWrapper) {
        this.zzdmr.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdmr.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdmr.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final boolean getOverrideImpressionRecording() {
        return this.zzdmr.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final boolean getOverrideClickHandling() {
        return this.zzdmr.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final Bundle getExtras() {
        return this.zzdmr.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final IObjectWrapper zzvf() {
        View adChoicesContent = this.zzdmr.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final zzyu getVideoController() {
        if (this.zzdmr.getVideoController() != null) {
            return this.zzdmr.getVideoController().zzdw();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzanh
    public final IObjectWrapper zzvg() {
        View zzaer = this.zzdmr.zzaer();
        if (zzaer == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzaer);
    }
}
