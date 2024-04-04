package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzvp;
import com.google.android.gms.internal.ads.zzwo;
import com.sncompany.newtower.GameThread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int height;
    private final int width;
    private final String zzacv;
    private boolean zzacw;
    private boolean zzacx;
    private int zzacy;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, GameThread.MYSCORE_WAVE_PERFECT, "160x600_as");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zzacu = new AdSize(50, 50, "50x50_mb");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdSize(int i, int i2) {
        this(i, i2, r3.toString());
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("x");
        sb.append(valueOf2);
        sb.append("_as");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.width = i;
        this.height = i2;
        this.zzacv = str;
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize zza = zzayd.zza(context, i, 50, 1);
        zza.zzacw = true;
        return zza;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize zza = zzayd.zza(context, i, 50, 2);
        zza.zzacw = true;
        return zza;
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize zza = zzayd.zza(context, i, 50, 0);
        zza.zzacw = true;
        return zza;
    }

    @Deprecated
    public static AdSize getPortraitBannerAdSizeWithWidth(Context context, int i) {
        return getPortraitAnchoredAdaptiveBannerAdSize(context, i);
    }

    @Deprecated
    public static AdSize getLandscapeBannerAdSizeWithWidth(Context context, int i) {
        return getLandscapeAnchoredAdaptiveBannerAdSize(context, i);
    }

    @Deprecated
    public static AdSize getCurrentOrientationBannerAdSizeWithWidth(Context context, int i) {
        return getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i);
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i) {
        int zzg = zzayd.zzg(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (zzg == -1) {
            return INVALID;
        }
        adSize.zzacy = zzg;
        adSize.zzacx = true;
        return adSize;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i) {
        int zzg = zzayd.zzg(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (zzg == -1) {
            return INVALID;
        }
        adSize.zzacy = zzg;
        adSize.zzacx = true;
        return adSize;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int zzg = zzayd.zzg(context, 0);
        if (zzg == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzacy = zzg;
        adSize.zzacx = true;
        return adSize;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.width == adSize.width && this.height == adSize.height && this.zzacv.equals(adSize.zzacv);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getHeightInPixels(Context context) {
        int i = this.height;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzvp.zzc(context.getResources().getDisplayMetrics());
        }
        zzwo.zzqm();
        return zzayd.zze(context, this.height);
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getWidthInPixels(Context context) {
        int i = this.width;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -1) {
            return zzvp.zzb(context.getResources().getDisplayMetrics());
        }
        zzwo.zzqm();
        return zzayd.zze(context, this.width);
    }

    public final int hashCode() {
        return this.zzacv.hashCode();
    }

    public final boolean isAutoHeight() {
        return this.height == -2;
    }

    public final boolean isFullWidth() {
        return this.width == -1;
    }

    public final boolean isFluid() {
        return this.width == -3 && this.height == -4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzdt() {
        return this.zzacw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzdu() {
        return this.zzacx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(boolean z) {
        this.zzacx = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzr(int i) {
        this.zzacy = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzdv() {
        return this.zzacy;
    }

    public final String toString() {
        return this.zzacv;
    }
}
