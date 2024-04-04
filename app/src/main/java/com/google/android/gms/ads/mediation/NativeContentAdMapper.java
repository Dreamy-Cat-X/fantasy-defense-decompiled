package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public class NativeContentAdMapper extends NativeAdMapper {
    private String zzdub;
    private String zzetc;
    private List<NativeAd.Image> zzetd;
    private NativeAd.Image zzete;
    private String zzetf;
    private String zzetg;

    public final void setHeadline(String str) {
        this.zzetc = str;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzetd = list;
    }

    public final void setBody(String str) {
        this.zzdub = str;
    }

    public final void setLogo(NativeAd.Image image) {
        this.zzete = image;
    }

    public final void setCallToAction(String str) {
        this.zzetf = str;
    }

    public final void setAdvertiser(String str) {
        this.zzetg = str;
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

    public final NativeAd.Image getLogo() {
        return this.zzete;
    }

    public final String getCallToAction() {
        return this.zzetf;
    }

    public final String getAdvertiser() {
        return this.zzetg;
    }
}
