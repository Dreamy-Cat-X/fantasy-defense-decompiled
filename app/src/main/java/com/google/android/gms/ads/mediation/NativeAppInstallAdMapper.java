package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public class NativeAppInstallAdMapper extends NativeAdMapper {
    private String zzdub;
    private String zzetc;
    private List<NativeAd.Image> zzetd;
    private String zzetf;
    private NativeAd.Image zzeth;
    private double zzeti;
    private String zzetj;
    private String zzetk;

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

    public final void setStarRating(double d) {
        this.zzeti = d;
    }

    public final void setStore(String str) {
        this.zzetj = str;
    }

    public final void setPrice(String str) {
        this.zzetk = str;
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

    public final double getStarRating() {
        return this.zzeti;
    }

    public final String getStore() {
        return this.zzetj;
    }

    public final String getPrice() {
        return this.zzetk;
    }
}
