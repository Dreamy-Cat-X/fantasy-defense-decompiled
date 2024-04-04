package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzuz;
import com.google.android.gms.internal.ads.zzwo;
import com.google.android.gms.internal.ads.zzyu;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, com.google.android.gms.ads.mediation.zza, MediationRewardedVideoAdAdapter, zzbfd {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzmf;
    private InterstitialAd zzmg;
    private AdLoader zzmh;
    private Context zzmi;
    private InterstitialAd zzmj;
    private MediationRewardedVideoAdListener zzmk;
    private final RewardedVideoAdListener zzml = new com.google.ads.mediation.zzb(this);

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);

    private final AdRequest zza(Context context, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            Iterator<String> it = keywords.iterator();
            while (it.hasNext()) {
                builder.addKeyword(it.next());
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            zzwo.zzqm();
            builder.addTestDevice(zzayd.zzbm(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            builder.tagForChildDirectedTreatment(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    static final class zzc extends AdListener implements AppEventListener, zzuz {
        private final AbstractAdViewAdapter zzmp;
        private final com.google.android.gms.ads.mediation.MediationBannerListener zzmq;

        public zzc(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener) {
            this.zzmp = abstractAdViewAdapter;
            this.zzmq = mediationBannerListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            this.zzmq.onAdLoaded(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i) {
            this.zzmq.onAdFailedToLoad(this.zzmp, i);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.zzmq.onAdOpened(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.zzmq.onAdClosed(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.zzmq.onAdLeftApplication(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzuz
        public final void onAdClicked() {
            this.zzmq.onAdClicked(this.zzmp);
        }

        @Override // com.google.android.gms.ads.doubleclick.AppEventListener
        public final void onAppEvent(String str, String str2) {
            this.zzmq.zza(this.zzmp, str, str2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    static final class zzf extends AdListener implements zzuz {
        private final AbstractAdViewAdapter zzmp;
        private final com.google.android.gms.ads.mediation.MediationInterstitialListener zzmt;

        public zzf(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener) {
            this.zzmp = abstractAdViewAdapter;
            this.zzmt = mediationInterstitialListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            this.zzmt.onAdLoaded(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i) {
            this.zzmt.onAdFailedToLoad(this.zzmp, i);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.zzmt.onAdOpened(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.zzmt.onAdClosed(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.zzmt.onAdLeftApplication(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzuz
        public final void onAdClicked() {
            this.zzmt.onAdClicked(this.zzmp);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    static final class zze extends AdListener implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, UnifiedNativeAd.OnUnifiedNativeAdLoadedListener {
        private final AbstractAdViewAdapter zzmp;
        private final MediationNativeListener zzms;

        public zze(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.zzmp = abstractAdViewAdapter;
            this.zzms = mediationNativeListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i) {
            this.zzms.onAdFailedToLoad(this.zzmp, i);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.zzms.onAdOpened(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.zzms.onAdClosed(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.zzms.onAdLeftApplication(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzuz
        public final void onAdClicked() {
            this.zzms.onAdClicked(this.zzmp);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdImpression() {
            this.zzms.onAdImpression(this.zzmp);
        }

        @Override // com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener
        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.zzms.onAdLoaded(this.zzmp, new zzb(nativeAppInstallAd));
        }

        @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.zzms.onAdLoaded(this.zzmp, new zzd(unifiedNativeAd));
        }

        @Override // com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener
        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.zzms.onAdLoaded(this.zzmp, new zza(nativeContentAd));
        }

        @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener
        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.zzms.zza(this.zzmp, nativeCustomTemplateAd);
        }

        @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener
        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.zzms.zza(this.zzmp, nativeCustomTemplateAd, str);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    static class zza extends NativeContentAdMapper {
        private final NativeContentAd zzmn;

        public zza(NativeContentAd nativeContentAd) {
            this.zzmn = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.zzmn);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbnw.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.zzmn);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static class zzd extends UnifiedNativeAdMapper {
        private final UnifiedNativeAd zzmr;

        public zzd(UnifiedNativeAd unifiedNativeAd) {
            this.zzmr = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzm(unifiedNativeAd.zzjw());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.zzmr);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbnw.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.zzmr);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    static class zzb extends NativeAppInstallAdMapper {
        private final NativeAppInstallAd zzmo;

        public zzb(NativeAppInstallAd nativeAppInstallAd) {
            this.zzmo = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.zzmo);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbnw.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.zzmo);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.zzmf;
        if (adView != null) {
            adView.destroy();
            this.zzmf = null;
        }
        if (this.zzmg != null) {
            this.zzmg = null;
        }
        if (this.zzmh != null) {
            this.zzmh = null;
        }
        if (this.zzmj != null) {
            this.zzmj = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        AdView adView = this.zzmf;
        if (adView != null) {
            adView.pause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        AdView adView = this.zzmf;
        if (adView != null) {
            adView.resume();
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zzmf = adView;
        adView.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzmf.setAdUnitId(getAdUnitId(bundle));
        this.zzmf.setAdListener(new zzc(this, mediationBannerListener));
        this.zzmf.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzmf;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, Bundle bundle, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle2) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzmg = interstitialAd;
        interstitialAd.setAdUnitId(getAdUnitId(bundle));
        this.zzmg.setAdListener(new zzf(this, mediationInterstitialListener));
        this.zzmg.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzmg;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
        InterstitialAd interstitialAd2 = this.zzmj;
        if (interstitialAd2 != null) {
            interstitialAd2.setImmersiveMode(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.zza
    public zzyu getVideoController() {
        VideoController videoController;
        AdView adView = this.zzmf;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.zzdw();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzmg.show();
    }

    @Override // com.google.android.gms.internal.ads.zzbfd
    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzdw(1).zzaeq();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        zze zzeVar = new zze(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(zzeVar);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.forUnifiedNativeAd(zzeVar);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(zzeVar);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(zzeVar);
        }
        if (nativeMediationAdRequest.zzvk()) {
            for (String str : nativeMediationAdRequest.zzvl().keySet()) {
                withAdListener.forCustomTemplateAd(str, zzeVar, nativeMediationAdRequest.zzvl().get(str).booleanValue() ? zzeVar : null);
            }
        }
        AdLoader build = withAdListener.build();
        this.zzmh = build;
        build.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzmi = context.getApplicationContext();
        this.zzmk = mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener.onInitializationSucceeded(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        if (this.zzmi == null || this.zzmk == null) {
            zzaym.zzev("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        InterstitialAd interstitialAd = new InterstitialAd(this.zzmi);
        this.zzmj = interstitialAd;
        interstitialAd.zzd(true);
        this.zzmj.setAdUnitId(getAdUnitId(bundle));
        this.zzmj.setRewardedVideoAdListener(this.zzml);
        this.zzmj.setAdMetadataListener(new com.google.ads.mediation.zza(this));
        this.zzmj.loadAd(zza(this.zzmi, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        this.zzmj.show();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.zzmk != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ InterstitialAd zza(AbstractAdViewAdapter abstractAdViewAdapter, InterstitialAd interstitialAd) {
        abstractAdViewAdapter.zzmj = null;
        return null;
    }
}
