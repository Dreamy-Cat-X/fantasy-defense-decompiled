package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;

    @Deprecated
    public static final int ORIENTATION_ANY = 0;

    @Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;

    @Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zzbno;
    private final int zzbnp;
    private final int zzbnq;
    private final boolean zzbnr;
    private final int zzbns;
    private final VideoOptions zzbnt;
    private final boolean zzbnu;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public @interface NativeMediaAspectRatio {
    }

    private NativeAdOptions(Builder builder) {
        this.zzbno = builder.zzbno;
        this.zzbnp = builder.zzbnp;
        this.zzbnq = builder.zzbnq;
        this.zzbnr = builder.zzbnr;
        this.zzbns = builder.zzbns;
        this.zzbnt = builder.zzbnt;
        this.zzbnu = builder.zzbnu;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder {
        private VideoOptions zzbnt;
        private boolean zzbno = false;
        private int zzbnp = -1;
        private int zzbnq = 0;
        private boolean zzbnr = false;
        private int zzbns = 1;
        private boolean zzbnu = false;

        public final Builder setReturnUrlsForImageAssets(boolean z) {
            this.zzbno = z;
            return this;
        }

        @Deprecated
        public final Builder setImageOrientation(int i) {
            this.zzbnp = i;
            return this;
        }

        public final Builder setMediaAspectRatio(int i) {
            this.zzbnq = i;
            return this;
        }

        public final Builder setRequestMultipleImages(boolean z) {
            this.zzbnr = z;
            return this;
        }

        public final Builder setAdChoicesPlacement(int i) {
            this.zzbns = i;
            return this;
        }

        public final Builder setVideoOptions(VideoOptions videoOptions) {
            this.zzbnt = videoOptions;
            return this;
        }

        public final Builder setRequestCustomMuteThisAd(boolean z) {
            this.zzbnu = z;
            return this;
        }

        public final NativeAdOptions build() {
            return new NativeAdOptions(this);
        }
    }

    public final boolean shouldReturnUrlsForImageAssets() {
        return this.zzbno;
    }

    @Deprecated
    public final int getImageOrientation() {
        return this.zzbnp;
    }

    public final int getMediaAspectRatio() {
        return this.zzbnq;
    }

    public final boolean shouldRequestMultipleImages() {
        return this.zzbnr;
    }

    public final int getAdChoicesPlacement() {
        return this.zzbns;
    }

    public final VideoOptions getVideoOptions() {
        return this.zzbnt;
    }

    public final boolean zzjt() {
        return this.zzbnu;
    }
}
