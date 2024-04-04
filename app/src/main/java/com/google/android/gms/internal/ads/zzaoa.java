package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaoa<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> implements MediationBannerListener, MediationInterstitialListener {
    private final zzamz zzdmn;

    public zzaoa(zzamz zzamzVar) {
        this.zzdmn = zzamzVar;
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onClick(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaym.zzdy("Adapter called onClick.");
        zzwo.zzqm();
        if (!zzayd.zzzv()) {
            zzaym.zze("#008 Must be called on the main UI thread.", null);
            zzayd.zzaae.post(new zzanz(this));
        } else {
            try {
                this.zzdmn.onAdClicked();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onDismissScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaym.zzdy("Adapter called onDismissScreen.");
        zzwo.zzqm();
        if (!zzayd.zzzv()) {
            zzaym.zzex("#008 Must be called on the main UI thread.");
            zzayd.zzaae.post(new zzaoe(this));
        } else {
            try {
                this.zzdmn.onAdClosed();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        zzaym.zzdy(sb.toString());
        zzwo.zzqm();
        if (!zzayd.zzzv()) {
            zzaym.zze("#008 Must be called on the main UI thread.", null);
            zzayd.zzaae.post(new zzaod(this, errorCode));
        } else {
            try {
                this.zzdmn.onAdFailedToLoad(zzaom.zza(errorCode));
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onLeaveApplication(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaym.zzdy("Adapter called onLeaveApplication.");
        zzwo.zzqm();
        if (!zzayd.zzzv()) {
            zzaym.zze("#008 Must be called on the main UI thread.", null);
            zzayd.zzaae.post(new zzaog(this));
        } else {
            try {
                this.zzdmn.onAdLeftApplication();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onPresentScreen(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaym.zzdy("Adapter called onPresentScreen.");
        zzwo.zzqm();
        if (!zzayd.zzzv()) {
            zzaym.zze("#008 Must be called on the main UI thread.", null);
            zzayd.zzaae.post(new zzaof(this));
        } else {
            try {
                this.zzdmn.onAdOpened();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.MediationBannerListener
    public final void onReceivedAd(MediationBannerAdapter<?, ?> mediationBannerAdapter) {
        zzaym.zzdy("Adapter called onReceivedAd.");
        zzwo.zzqm();
        if (!zzayd.zzzv()) {
            zzaym.zze("#008 Must be called on the main UI thread.", null);
            zzayd.zzaae.post(new zzaoi(this));
        } else {
            try {
                this.zzdmn.onAdLoaded();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onDismissScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaym.zzdy("Adapter called onDismissScreen.");
        zzwo.zzqm();
        if (!zzayd.zzzv()) {
            zzaym.zze("#008 Must be called on the main UI thread.", null);
            zzayd.zzaae.post(new zzaoh(this));
        } else {
            try {
                this.zzdmn.onAdClosed();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, AdRequest.ErrorCode errorCode) {
        String valueOf = String.valueOf(errorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        zzaym.zzdy(sb.toString());
        zzwo.zzqm();
        if (!zzayd.zzzv()) {
            zzaym.zze("#008 Must be called on the main UI thread.", null);
            zzayd.zzaae.post(new zzaok(this, errorCode));
        } else {
            try {
                this.zzdmn.onAdFailedToLoad(zzaom.zza(errorCode));
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onLeaveApplication(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaym.zzdy("Adapter called onLeaveApplication.");
        zzwo.zzqm();
        if (!zzayd.zzzv()) {
            zzaym.zze("#008 Must be called on the main UI thread.", null);
            zzayd.zzaae.post(new zzaoj(this));
        } else {
            try {
                this.zzdmn.onAdLeftApplication();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onPresentScreen(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaym.zzdy("Adapter called onPresentScreen.");
        zzwo.zzqm();
        if (!zzayd.zzzv()) {
            zzaym.zze("#008 Must be called on the main UI thread.", null);
            zzayd.zzaae.post(new zzaoc(this));
        } else {
            try {
                this.zzdmn.onAdOpened();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialListener
    public final void onReceivedAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter) {
        zzaym.zzdy("Adapter called onReceivedAd.");
        zzwo.zzqm();
        if (!zzayd.zzzv()) {
            zzaym.zze("#008 Must be called on the main UI thread.", null);
            zzayd.zzaae.post(new zzaob(this));
        } else {
            try {
                this.zzdmn.onAdLoaded();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
