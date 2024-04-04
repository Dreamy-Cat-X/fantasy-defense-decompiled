package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzzg {
    private final Context context;
    private final zzvn zzacq;
    private AppEventListener zzbob;
    private zzxg zzbuo;
    private String zzbup;
    private final zzamu zzbur;
    private zzuz zzcgr;
    private AdListener zzcgw;
    private AdMetadataListener zzchn;
    private OnCustomRenderedAdLoadedListener zzcjt;
    private OnPaidEventListener zzcjw;
    private RewardedVideoAdListener zzckb;
    private boolean zzckc;
    private Boolean zzckd;

    public zzzg(Context context) {
        this(context, zzvn.zzchp, null);
    }

    public zzzg(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzvn.zzchp, publisherInterstitialAd);
    }

    private zzzg(Context context, zzvn zzvnVar, PublisherInterstitialAd publisherInterstitialAd) {
        this.zzbur = new zzamu();
        this.context = context;
        this.zzacq = zzvnVar;
    }

    public final AdListener getAdListener() {
        return this.zzcgw;
    }

    public final String getAdUnitId() {
        return this.zzbup;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbob;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzcjt;
    }

    public final boolean isLoaded() {
        try {
            if (this.zzbuo == null) {
                return false;
            }
            return this.zzbuo.isReady();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzbuo == null) {
                return false;
            }
            return this.zzbuo.isLoading();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final void zza(zzzc zzzcVar) {
        try {
            if (this.zzbuo == null) {
                if (this.zzbup == null) {
                    zzcn("loadAd");
                }
                zzvp zzqe = this.zzckc ? zzvp.zzqe() : new zzvp();
                zzvz zzqn = zzwo.zzqn();
                Context context = this.context;
                zzxg zzd = new zzwj(zzqn, context, zzqe, this.zzbup, this.zzbur).zzd(context, false);
                this.zzbuo = zzd;
                if (this.zzcgw != null) {
                    zzd.zza(new zzve(this.zzcgw));
                }
                if (this.zzcgr != null) {
                    this.zzbuo.zza(new zzvb(this.zzcgr));
                }
                if (this.zzchn != null) {
                    this.zzbuo.zza(new zzvj(this.zzchn));
                }
                if (this.zzbob != null) {
                    this.zzbuo.zza(new zzvv(this.zzbob));
                }
                if (this.zzcjt != null) {
                    this.zzbuo.zza(new zzaci(this.zzcjt));
                }
                if (this.zzckb != null) {
                    this.zzbuo.zza(new zzauf(this.zzckb));
                }
                this.zzbuo.zza(new zzaah(this.zzcjw));
                if (this.zzckd != null) {
                    this.zzbuo.setImmersiveMode(this.zzckd.booleanValue());
                }
            }
            if (this.zzbuo.zza(zzvn.zza(this.context, zzzcVar))) {
                this.zzbur.zzf(zzzcVar.zzrj());
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        try {
            this.zzcgw = adListener;
            if (this.zzbuo != null) {
                this.zzbuo.zza(adListener != null ? new zzve(adListener) : null);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void zza(zzuz zzuzVar) {
        try {
            this.zzcgr = zzuzVar;
            if (this.zzbuo != null) {
                this.zzbuo.zza(zzuzVar != null ? new zzvb(zzuzVar) : null);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdUnitId(String str) {
        if (this.zzbup != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.zzbup = str;
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        try {
            this.zzchn = adMetadataListener;
            if (this.zzbuo != null) {
                this.zzbuo.zza(adMetadataListener != null ? new zzvj(adMetadataListener) : null);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final Bundle getAdMetadata() {
        try {
            if (this.zzbuo != null) {
                return this.zzbuo.getAdMetadata();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzbob = appEventListener;
            if (this.zzbuo != null) {
                this.zzbuo.zza(appEventListener != null ? new zzvv(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.zzcjt = onCustomRenderedAdLoadedListener;
            if (this.zzbuo != null) {
                this.zzbuo.zza(onCustomRenderedAdLoadedListener != null ? new zzaci(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.zzckb = rewardedVideoAdListener;
            if (this.zzbuo != null) {
                this.zzbuo.zza(rewardedVideoAdListener != null ? new zzauf(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void zzd(boolean z) {
        this.zzckc = true;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbuo != null) {
                return this.zzbuo.zzkg();
            }
            return null;
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzyt zzytVar = null;
        try {
            if (this.zzbuo != null) {
                zzytVar = this.zzbuo.zzkh();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzytVar);
    }

    public final void show() {
        try {
            zzcn("show");
            this.zzbuo.showInterstitial();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setImmersiveMode(boolean z) {
        try {
            this.zzckd = Boolean.valueOf(z);
            if (this.zzbuo != null) {
                this.zzbuo.setImmersiveMode(z);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzcjw = onPaidEventListener;
            if (this.zzbuo != null) {
                this.zzbuo.zza(new zzaah(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    private final void zzcn(String str) {
        if (this.zzbuo != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
        sb.append("The ad unit ID must be set on InterstitialAd before ");
        sb.append(str);
        sb.append(" is called.");
        throw new IllegalStateException(sb.toString());
    }
}
