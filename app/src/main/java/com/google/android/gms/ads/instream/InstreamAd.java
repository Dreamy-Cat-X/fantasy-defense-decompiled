package com.google.android.gms.ads.instream;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzajt;
import com.google.android.gms.internal.ads.zzajy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class InstreamAd {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static abstract class InstreamAdLoadCallback {
        @Deprecated
        public void onInstreamAdFailedToLoad(int i) {
        }

        public void onInstreamAdFailedToLoad(LoadAdError loadAdError) {
        }

        public void onInstreamAdLoaded(InstreamAd instreamAd) {
        }
    }

    public abstract void destroy();

    @Deprecated
    public abstract float getAspectRatio();

    public abstract MediaContent getMediaContent();

    @Deprecated
    public abstract VideoController getVideoController();

    @Deprecated
    public abstract float getVideoCurrentTime();

    @Deprecated
    public abstract float getVideoDuration();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zza(InstreamAdView instreamAdView);

    public static void load(Context context, String str, AdRequest adRequest, int i, InstreamAdLoadCallback instreamAdLoadCallback) {
        Preconditions.checkArgument(i == 2 || i == 3, "Instream ads only support Landscape and Portrait media aspect ratios");
        new zzajy(context, str).zza(instreamAdLoadCallback).zza(new zzajt(i)).zzuh().loadAd(adRequest);
    }

    public static void load(Context context, String str, InstreamAdLoadCallback instreamAdLoadCallback) {
        new zzajy(context, "").zza(instreamAdLoadCallback).zza(new zzajt(str)).zzuh().loadAd(new PublisherAdRequest.Builder().build());
    }
}
