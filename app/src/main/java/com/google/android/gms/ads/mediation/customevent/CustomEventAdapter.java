package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.zzaym;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    private static final AdError zzetu = new AdError(0, "Could not instantiate custom event adapter", MobileAds.ERROR_DOMAIN);
    private CustomEventBanner zzetv;
    private CustomEventInterstitial zzetw;
    private CustomEventNative zzetx;
    private View zznb;

    private static <T> T zzal(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzaym.zzex(sb.toString());
            return null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    class zza implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzety;
        private final MediationInterstitialListener zzetz;

        public zza(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzety = customEventAdapter;
            this.zzetz = mediationInterstitialListener;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
        public final void onAdLoaded() {
            zzaym.zzdy("Custom event adapter called onReceivedAd.");
            this.zzetz.onAdLoaded(CustomEventAdapter.this);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(int i) {
            zzaym.zzdy("Custom event adapter called onFailedToReceiveAd.");
            this.zzetz.onAdFailedToLoad(this.zzety, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(AdError adError) {
            zzaym.zzdy("Custom event adapter called onFailedToReceiveAd.");
            this.zzetz.onAdFailedToLoad(this.zzety, adError);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClicked() {
            zzaym.zzdy("Custom event adapter called onAdClicked.");
            this.zzetz.onAdClicked(this.zzety);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdOpened() {
            zzaym.zzdy("Custom event adapter called onAdOpened.");
            this.zzetz.onAdOpened(this.zzety);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClosed() {
            zzaym.zzdy("Custom event adapter called onAdClosed.");
            this.zzetz.onAdClosed(this.zzety);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdLeftApplication() {
            zzaym.zzdy("Custom event adapter called onAdLeftApplication.");
            this.zzetz.onAdLeftApplication(this.zzety);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    static final class zzb implements CustomEventBannerListener {
        private final CustomEventAdapter zzety;
        private final MediationBannerListener zzeub;

        public zzb(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.zzety = customEventAdapter;
            this.zzeub = mediationBannerListener;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
        public final void onAdLoaded(View view) {
            zzaym.zzdy("Custom event adapter called onAdLoaded.");
            this.zzety.zza(view);
            this.zzeub.onAdLoaded(this.zzety);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(int i) {
            zzaym.zzdy("Custom event adapter called onAdFailedToLoad.");
            this.zzeub.onAdFailedToLoad(this.zzety, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(AdError adError) {
            zzaym.zzdy("Custom event adapter called onAdFailedToLoad.");
            this.zzeub.onAdFailedToLoad(this.zzety, adError);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClicked() {
            zzaym.zzdy("Custom event adapter called onAdClicked.");
            this.zzeub.onAdClicked(this.zzety);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdOpened() {
            zzaym.zzdy("Custom event adapter called onAdOpened.");
            this.zzeub.onAdOpened(this.zzety);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClosed() {
            zzaym.zzdy("Custom event adapter called onAdClosed.");
            this.zzeub.onAdClosed(this.zzety);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdLeftApplication() {
            zzaym.zzdy("Custom event adapter called onAdLeftApplication.");
            this.zzeub.onAdLeftApplication(this.zzety);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    static class zzc implements CustomEventNativeListener {
        private final CustomEventAdapter zzety;
        private final MediationNativeListener zzeuc;

        public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.zzety = customEventAdapter;
            this.zzeuc = mediationNativeListener;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
        public final void onAdLoaded(NativeAdMapper nativeAdMapper) {
            zzaym.zzdy("Custom event adapter called onAdLoaded.");
            this.zzeuc.onAdLoaded(this.zzety, nativeAdMapper);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
        public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
            zzaym.zzdy("Custom event adapter called onAdLoaded.");
            this.zzeuc.onAdLoaded(this.zzety, unifiedNativeAdMapper);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(int i) {
            zzaym.zzdy("Custom event adapter called onAdFailedToLoad.");
            this.zzeuc.onAdFailedToLoad(this.zzety, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(AdError adError) {
            zzaym.zzdy("Custom event adapter called onAdFailedToLoad.");
            this.zzeuc.onAdFailedToLoad(this.zzety, adError);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdOpened() {
            zzaym.zzdy("Custom event adapter called onAdOpened.");
            this.zzeuc.onAdOpened(this.zzety);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClicked() {
            zzaym.zzdy("Custom event adapter called onAdClicked.");
            this.zzeuc.onAdClicked(this.zzety);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClosed() {
            zzaym.zzdy("Custom event adapter called onAdClosed.");
            this.zzeuc.onAdClosed(this.zzety);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdLeftApplication() {
            zzaym.zzdy("Custom event adapter called onAdLeftApplication.");
            this.zzeuc.onAdLeftApplication(this.zzety);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
        public final void onAdImpression() {
            zzaym.zzdy("Custom event adapter called onAdImpression.");
            this.zzeuc.onAdImpression(this.zzety);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.zzetv;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.zzetw;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.zzetx;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        CustomEventBanner customEventBanner = this.zzetv;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.zzetw;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.zzetx;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        CustomEventBanner customEventBanner = this.zzetv;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.zzetw;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.zzetx;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.zznb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) zzal(bundle.getString("class_name"));
        this.zzetv = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onAdFailedToLoad(this, zzetu);
        } else {
            this.zzetv.requestBannerAd(context, new zzb(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) zzal(bundle.getString("class_name"));
        this.zzetw = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, zzetu);
        } else {
            this.zzetw.requestInterstitialAd(context, new zza(this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) zzal(bundle.getString("class_name"));
        this.zzetx = customEventNative;
        if (customEventNative == null) {
            mediationNativeListener.onAdFailedToLoad(this, zzetu);
        } else {
            this.zzetx.requestNativeAd(context, new zzc(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.zzetw.showInterstitial();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(View view) {
        this.zznb = view;
    }
}
