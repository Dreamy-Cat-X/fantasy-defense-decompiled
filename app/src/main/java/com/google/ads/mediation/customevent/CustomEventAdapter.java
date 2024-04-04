package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.internal.ads.zzaym;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {
    private View zznb;
    private CustomEventBanner zznc;
    private CustomEventInterstitial zznd;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza implements CustomEventBannerListener {
        private final CustomEventAdapter zzmz;
        private final MediationBannerListener zzna;

        public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.zzmz = customEventAdapter;
            this.zzna = mediationBannerListener;
        }

        @Override // com.google.ads.mediation.customevent.CustomEventBannerListener
        public final void onReceivedAd(View view) {
            zzaym.zzdy("Custom event adapter called onReceivedAd.");
            this.zzmz.zza(view);
            this.zzna.onReceivedAd(this.zzmz);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onFailedToReceiveAd() {
            zzaym.zzdy("Custom event adapter called onFailedToReceiveAd.");
            this.zzna.onFailedToReceiveAd(this.zzmz, AdRequest.ErrorCode.NO_FILL);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventBannerListener
        public final void onClick() {
            zzaym.zzdy("Custom event adapter called onFailedToReceiveAd.");
            this.zzna.onClick(this.zzmz);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onPresentScreen() {
            zzaym.zzdy("Custom event adapter called onFailedToReceiveAd.");
            this.zzna.onPresentScreen(this.zzmz);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onDismissScreen() {
            zzaym.zzdy("Custom event adapter called onFailedToReceiveAd.");
            this.zzna.onDismissScreen(this.zzmz);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onLeaveApplication() {
            zzaym.zzdy("Custom event adapter called onFailedToReceiveAd.");
            this.zzna.onLeaveApplication(this.zzmz);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public class zzb implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzmz;
        private final MediationInterstitialListener zzne;

        public zzb(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzmz = customEventAdapter;
            this.zzne = mediationInterstitialListener;
        }

        @Override // com.google.ads.mediation.customevent.CustomEventInterstitialListener
        public final void onReceivedAd() {
            zzaym.zzdy("Custom event adapter called onReceivedAd.");
            this.zzne.onReceivedAd(CustomEventAdapter.this);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onFailedToReceiveAd() {
            zzaym.zzdy("Custom event adapter called onFailedToReceiveAd.");
            this.zzne.onFailedToReceiveAd(this.zzmz, AdRequest.ErrorCode.NO_FILL);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onPresentScreen() {
            zzaym.zzdy("Custom event adapter called onPresentScreen.");
            this.zzne.onPresentScreen(this.zzmz);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onDismissScreen() {
            zzaym.zzdy("Custom event adapter called onDismissScreen.");
            this.zzne.onDismissScreen(this.zzmz);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onLeaveApplication() {
            zzaym.zzdy("Custom event adapter called onLeaveApplication.");
            this.zzne.onLeaveApplication(this.zzmz);
        }
    }

    @Override // com.google.ads.mediation.MediationAdapter
    public final void destroy() {
        CustomEventBanner customEventBanner = this.zznc;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.zznd;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.MediationAdapter
    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.zznb;
    }

    @Override // com.google.ads.mediation.MediationAdapter
    public final Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        CustomEventBanner customEventBanner = (CustomEventBanner) zzal(customEventServerParameters.className);
        this.zznc = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
        } else {
            this.zznc.requestBannerAd(new zza(this, mediationBannerListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, adSize, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) zzal(customEventServerParameters.className);
        this.zznd = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
        } else {
            this.zznd.requestInterstitialAd(new zzb(this, mediationInterstitialListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.zznd.showInterstitial();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(View view) {
        this.zznb = view;
    }
}
