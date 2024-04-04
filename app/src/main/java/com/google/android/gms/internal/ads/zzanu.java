package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzanu implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    private final zzamz zzdmn;
    private NativeAdMapper zzdmo;
    private UnifiedNativeAdMapper zzdmp;
    private NativeCustomTemplateAd zzdmq;

    public zzanu(zzamz zzamzVar) {
        this.zzdmn = zzamzVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAppEvent.");
        try {
            this.zzdmn.onAppEvent(str, str2);
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdClicked.");
        try {
            this.zzdmn.onAdClicked();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdClosed.");
        try {
            this.zzdmn.onAdClosed();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        zzaym.zzdy(sb.toString());
        try {
            this.zzdmn.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 97 + String.valueOf(domain).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(code);
        sb.append(". ErrorMessage: ");
        sb.append(message);
        sb.append(". ErrorDomain: ");
        sb.append(domain);
        zzaym.zzdy(sb.toString());
        try {
            this.zzdmn.zzc(adError.zzdp());
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdLeftApplication.");
        try {
            this.zzdmn.onAdLeftApplication();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdOpened.");
        try {
            this.zzdmn.onAdOpened();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdLoaded.");
        try {
            this.zzdmn.onAdLoaded();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdClicked.");
        try {
            this.zzdmn.onAdClicked();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdClosed.");
        try {
            this.zzdmn.onAdClosed();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        zzaym.zzdy(sb.toString());
        try {
            this.zzdmn.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 97 + String.valueOf(domain).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(code);
        sb.append(". ErrorMessage: ");
        sb.append(message);
        sb.append(". ErrorDomain: ");
        sb.append(domain);
        zzaym.zzdy(sb.toString());
        try {
            this.zzdmn.zzc(adError.zzdp());
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdLeftApplication.");
        try {
            this.zzdmn.onAdLeftApplication();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdOpened.");
        try {
            this.zzdmn.onAdOpened();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdLoaded.");
        try {
            this.zzdmn.onAdLoaded();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdLoaded.");
        this.zzdmo = nativeAdMapper;
        this.zzdmp = null;
        zza(mediationNativeAdapter, (UnifiedNativeAdMapper) null, nativeAdMapper);
        try {
            this.zzdmn.onAdLoaded();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdLoaded.");
        this.zzdmp = unifiedNativeAdMapper;
        this.zzdmo = null;
        zza(mediationNativeAdapter, unifiedNativeAdMapper, (NativeAdMapper) null);
        try {
            this.zzdmn.onAdLoaded();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    private static void zza(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper, NativeAdMapper nativeAdMapper) {
        if (mediationNativeAdapter instanceof AdMobAdapter) {
            return;
        }
        VideoController videoController = new VideoController();
        videoController.zza(new zzann());
        if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
            unifiedNativeAdMapper.zza(videoController);
        }
        if (nativeAdMapper == null || !nativeAdMapper.hasVideoContent()) {
            return;
        }
        nativeAdMapper.zza(videoController);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        zzaym.zzdy(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.zzdmq = nativeCustomTemplateAd;
        try {
            this.zzdmn.onAdLoaded();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof zzafk) {
            try {
                this.zzdmn.zza(((zzafk) nativeCustomTemplateAd).zztu(), str);
                return;
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
                return;
            }
        }
        zzaym.zzex("Unexpected native custom template ad type.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        zzaym.zzdy(sb.toString());
        try {
            this.zzdmn.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 97 + String.valueOf(domain).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(code);
        sb.append(". ErrorMessage: ");
        sb.append(message);
        sb.append(". ErrorDomain: ");
        sb.append(domain);
        zzaym.zzdy(sb.toString());
        try {
            this.zzdmn.zzc(adError.zzdp());
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdOpened.");
        try {
            this.zzdmn.onAdOpened();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdClosed.");
        try {
            this.zzdmn.onAdClosed();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onAdLeftApplication.");
        try {
            this.zzdmn.onAdLeftApplication();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.zzdmo;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzdmp;
        if (this.zzdmq == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzaym.zze("#007 Could not call remote method.", null);
                return;
            }
            if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzaym.zzdy("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideClickHandling()) {
                zzaym.zzdy("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzaym.zzdy("Adapter called onAdClicked.");
        try {
            this.zzdmn.onAdClicked();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.zzdmo;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzdmp;
        if (this.zzdmq == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzaym.zze("#007 Could not call remote method.", null);
                return;
            }
            if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzaym.zzdy("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideImpressionRecording()) {
                zzaym.zzdy("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzaym.zzdy("Adapter called onAdImpression.");
        try {
            this.zzdmn.onAdImpression();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzaym.zzdy("Adapter called onVideoEnd.");
        try {
            this.zzdmn.onVideoEnd();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final NativeAdMapper zzvh() {
        return this.zzdmo;
    }

    public final UnifiedNativeAdMapper zzvi() {
        return this.zzdmp;
    }

    public final NativeCustomTemplateAd zzvj() {
        return this.zzdmq;
    }
}
