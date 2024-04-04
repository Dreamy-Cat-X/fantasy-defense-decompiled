package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.ads.zzzj;
import com.google.android.gms.internal.ads.zzzn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    @Deprecated
    /* loaded from: D:\decomp\classes.dex */
    public static final class Settings {
        private final zzzn zzadj = new zzzn();

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }
    }

    private MobileAds() {
    }

    @Deprecated
    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        zzzj.zzrr().zza(context, str, null);
    }

    public static void initialize(Context context) {
        initialize(context, null, null);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzzj.zzrr().zza(context, null, onInitializationCompleteListener);
    }

    @Deprecated
    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return zzzj.zzrr().getRewardedVideoAdInstance(context);
    }

    public static void setAppVolume(float f) {
        zzzj.zzrr().setAppVolume(f);
    }

    public static void setAppMuted(boolean z) {
        zzzj.zzrr().setAppMuted(z);
    }

    public static void openDebugMenu(Context context, String str) {
        zzzj.zzrr().openDebugMenu(context, str);
    }

    public static String getVersionString() {
        return zzzj.zzrr().getVersionString();
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzzj.zzrr().registerRtbAdapter(cls);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzzj.zzrr().getInitializationStatus();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzzj.zzrr().getRequestConfiguration();
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzzj.zzrr().setRequestConfiguration(requestConfiguration);
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzzj.zzrr().disableMediationAdapterInitialization(context);
    }
}
