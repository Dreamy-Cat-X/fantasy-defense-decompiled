package com.google.ads;

import android.content.Context;
import com.sncompany.newtower.GameThread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    private final com.google.android.gms.ads.AdSize zzdq;
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "mb");
    public static final AdSize BANNER = new AdSize(320, 50, "mb");
    public static final AdSize IAB_MRECT = new AdSize(300, 250, "as");
    public static final AdSize IAB_BANNER = new AdSize(468, 60, "as");
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90, "as");
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, GameThread.MYSCORE_WAVE_PERFECT, "as");

    public AdSize(com.google.android.gms.ads.AdSize adSize) {
        this.zzdq = adSize;
    }

    public final boolean isCustomAdSize() {
        return false;
    }

    public AdSize(int i, int i2) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }

    private AdSize(int i, int i2, String str) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AdSize) {
            return this.zzdq.equals(((AdSize) obj).zzdq);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzdq.hashCode();
    }

    public final int getWidth() {
        return this.zzdq.getWidth();
    }

    public final int getHeight() {
        return this.zzdq.getHeight();
    }

    public final boolean isFullWidth() {
        return this.zzdq.isFullWidth();
    }

    public final boolean isAutoHeight() {
        return this.zzdq.isAutoHeight();
    }

    public final String toString() {
        return this.zzdq.toString();
    }

    public final int getWidthInPixels(Context context) {
        return this.zzdq.getWidthInPixels(context);
    }

    public final int getHeightInPixels(Context context) {
        return this.zzdq.getHeightInPixels(context);
    }

    public final boolean isSizeAppropriate(int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        float f = i;
        float f2 = width;
        if (f > f2 * 1.25f || f < f2 * 0.8f) {
            return false;
        }
        float f3 = i2;
        float f4 = height;
        return f3 <= 1.25f * f4 && f3 >= f4 * 0.8f;
    }

    public final AdSize findBestSize(AdSize... adSizeArr) {
        AdSize adSize = null;
        if (adSizeArr == null) {
            return null;
        }
        float f = 0.0f;
        int width = getWidth();
        int height = getHeight();
        for (AdSize adSize2 : adSizeArr) {
            if (isSizeAppropriate(adSize2.getWidth(), adSize2.getHeight())) {
                float f2 = (r7 * r8) / (width * height);
                if (f2 > 1.0f) {
                    f2 = 1.0f / f2;
                }
                if (f2 > f) {
                    adSize = adSize2;
                    f = f2;
                }
            }
        }
        return adSize;
    }
}
