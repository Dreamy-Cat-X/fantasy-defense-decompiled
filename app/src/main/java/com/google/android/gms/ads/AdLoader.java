package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzadz;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzagt;
import com.google.android.gms.internal.ads.zzagv;
import com.google.android.gms.internal.ads.zzagw;
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzve;
import com.google.android.gms.internal.ads.zzvn;
import com.google.android.gms.internal.ads.zzvp;
import com.google.android.gms.internal.ads.zzwo;
import com.google.android.gms.internal.ads.zzwy;
import com.google.android.gms.internal.ads.zzxd;
import com.google.android.gms.internal.ads.zzzc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class AdLoader {
    private final Context context;
    private final zzvn zzacq;
    private final zzwy zzacr;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static class Builder {
        private final Context context;
        private final zzxd zzacp;

        @Deprecated
        public Builder withCorrelator(Correlator correlator) {
            return this;
        }

        public Builder(Context context, String str) {
            this((Context) Preconditions.checkNotNull(context, "context cannot be null"), zzwo.zzqn().zzb(context, str, new zzamu()));
        }

        private Builder(Context context, zzxd zzxdVar) {
            this.context = context;
            this.zzacp = zzxdVar;
        }

        @Deprecated
        public Builder forContentAd(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.zzacp.zza(new zzagw(onContentAdLoadedListener));
            } catch (RemoteException e) {
                zzaym.zzd("Failed to add content ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.zzacp.zza(new zzagt(onAppInstallAdLoadedListener));
            } catch (RemoteException e) {
                zzaym.zzd("Failed to add app install ad listener", e);
            }
            return this;
        }

        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzacp.zza(new zzagx(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzaym.zzd("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzagp zzagpVar = new zzagp(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzacp.zza(str, zzagpVar.zzty(), zzagpVar.zztz());
            } catch (RemoteException e) {
                zzaym.zzd("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzacp.zza(new zzagv(onPublisherAdViewLoadedListener), new zzvp(this.context, adSizeArr));
            } catch (RemoteException e) {
                zzaym.zzd("Failed to add publisher banner ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzacp.zzb(new zzve(adListener));
            } catch (RemoteException e) {
                zzaym.zzd("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzacp.zza(new zzadz(nativeAdOptions));
            } catch (RemoteException e) {
                zzaym.zzd("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.zzacp.zza(publisherAdViewOptions);
            } catch (RemoteException e) {
                zzaym.zzd("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.context, this.zzacp.zzqy());
            } catch (RemoteException e) {
                zzaym.zzc("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    AdLoader(Context context, zzwy zzwyVar) {
        this(context, zzwyVar, zzvn.zzchp);
    }

    private AdLoader(Context context, zzwy zzwyVar, zzvn zzvnVar) {
        this.context = context;
        this.zzacr = zzwyVar;
        this.zzacq = zzvnVar;
    }

    private final void zza(zzzc zzzcVar) {
        try {
            this.zzacr.zzb(zzvn.zza(this.context, zzzcVar));
        } catch (RemoteException e) {
            zzaym.zzc("Failed to load ad.", e);
        }
    }

    public void loadAd(AdRequest adRequest) {
        zza(adRequest.zzds());
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzds());
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzacr.zza(zzvn.zza(this.context, adRequest.zzds()), i);
        } catch (RemoteException e) {
            zzaym.zzc("Failed to load ads.", e);
        }
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        try {
            return this.zzacr.zzkg();
        } catch (RemoteException e) {
            zzaym.zzd("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.zzacr.isLoading();
        } catch (RemoteException e) {
            zzaym.zzd("Failed to check if ad is loading.", e);
            return false;
        }
    }
}
