package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class UnifiedNativeAdMapper {
    private Bundle extras = new Bundle();
    private VideoController zzcjq;
    private String zzdub;
    private View zzeta;
    private boolean zzetb;
    private String zzetc;
    private List<NativeAd.Image> zzetd;
    private String zzetf;
    private String zzetg;
    private NativeAd.Image zzeth;
    private String zzetj;
    private String zzetk;
    private Double zzeto;
    private View zzetp;
    private Object zzetq;
    private boolean zzetr;
    private boolean zzets;
    private float zzett;

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public void handleClick(View view) {
    }

    public void recordImpression() {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final void setHeadline(String str) {
        this.zzetc = str;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzetd = list;
    }

    public final void setBody(String str) {
        this.zzdub = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.zzeth = image;
    }

    public final void setCallToAction(String str) {
        this.zzetf = str;
    }

    public final void setAdvertiser(String str) {
        this.zzetg = str;
    }

    public final void setStarRating(Double d) {
        this.zzeto = d;
    }

    public final void setStore(String str) {
        this.zzetj = str;
    }

    public final void setPrice(String str) {
        this.zzetk = str;
    }

    public final void zza(VideoController videoController) {
        this.zzcjq = videoController;
    }

    public void setHasVideoContent(boolean z) {
        this.zzetb = z;
    }

    public void setAdChoicesContent(View view) {
        this.zzetp = view;
    }

    public void setMediaView(View view) {
        this.zzeta = view;
    }

    public void setMediaContentAspectRatio(float f) {
        this.zzett = f;
    }

    public final void zzm(Object obj) {
        this.zzetq = obj;
    }

    public final void setExtras(Bundle bundle) {
        this.extras = bundle;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.zzetr = z;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.zzets = z;
    }

    public final String getHeadline() {
        return this.zzetc;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzetd;
    }

    public final String getBody() {
        return this.zzdub;
    }

    public final NativeAd.Image getIcon() {
        return this.zzeth;
    }

    public final String getCallToAction() {
        return this.zzetf;
    }

    public final String getAdvertiser() {
        return this.zzetg;
    }

    public final Double getStarRating() {
        return this.zzeto;
    }

    public final String getStore() {
        return this.zzetj;
    }

    public final String getPrice() {
        return this.zzetk;
    }

    public final VideoController getVideoController() {
        return this.zzcjq;
    }

    public boolean hasVideoContent() {
        return this.zzetb;
    }

    public View getAdChoicesContent() {
        return this.zzetp;
    }

    public final View zzaer() {
        return this.zzeta;
    }

    public float getMediaContentAspectRatio() {
        return this.zzett;
    }

    public final Object zzjw() {
        return this.zzetq;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzetr;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzets;
    }
}
