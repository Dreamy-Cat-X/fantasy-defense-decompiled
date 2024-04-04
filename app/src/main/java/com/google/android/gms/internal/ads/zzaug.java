package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaug implements RewardedVideoAd {
    private final Context context;
    private final zzatv zzdxm;
    private String zzdxo;
    private String zzdxp;
    private final Object lock = new Object();
    private final zzauf zzdxn = new zzauf(null);

    public zzaug(Context context, zzatv zzatvVar) {
        this.zzdxm = zzatvVar == null ? new zzaag() : zzatvVar;
        this.context = context.getApplicationContext();
    }

    private final void zza(String str, zzzc zzzcVar) {
        synchronized (this.lock) {
            if (this.zzdxm == null) {
                return;
            }
            try {
                this.zzdxm.zza(zzvn.zza(this.context, zzzcVar, str));
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, AdRequest adRequest) {
        zza(str, adRequest.zzds());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        zza(str, publisherAdRequest.zzds());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void show() {
        synchronized (this.lock) {
            if (this.zzdxm == null) {
                return;
            }
            try {
                this.zzdxm.show();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.lock) {
            this.zzdxn.setRewardedVideoAdListener(rewardedVideoAdListener);
            if (this.zzdxm != null) {
                try {
                    this.zzdxm.zza(this.zzdxn);
                } catch (RemoteException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.lock) {
            if (this.zzdxm != null) {
                try {
                    this.zzdxm.zza(new zzvj(adMetadataListener));
                } catch (RemoteException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final Bundle getAdMetadata() {
        synchronized (this.lock) {
            if (this.zzdxm != null) {
                try {
                    return this.zzdxm.getAdMetadata();
                } catch (RemoteException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
            return new Bundle();
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setUserId(String str) {
        synchronized (this.lock) {
            this.zzdxo = str;
            if (this.zzdxm != null) {
                try {
                    this.zzdxm.setUserId(str);
                } catch (RemoteException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final boolean isLoaded() {
        synchronized (this.lock) {
            if (this.zzdxm == null) {
                return false;
            }
            try {
                return this.zzdxm.isLoaded();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause() {
        pause(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause(Context context) {
        synchronized (this.lock) {
            if (this.zzdxm == null) {
                return;
            }
            try {
                this.zzdxm.zzj(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume() {
        resume(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume(Context context) {
        synchronized (this.lock) {
            if (this.zzdxm == null) {
                return;
            }
            try {
                this.zzdxm.zzk(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy() {
        destroy(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy(Context context) {
        synchronized (this.lock) {
            this.zzdxn.setRewardedVideoAdListener(null);
            if (this.zzdxm == null) {
                return;
            }
            try {
                this.zzdxm.zzl(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener rewardedVideoAdListener;
        synchronized (this.lock) {
            rewardedVideoAdListener = this.zzdxn.getRewardedVideoAdListener();
        }
        return rewardedVideoAdListener;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getUserId() {
        String str;
        synchronized (this.lock) {
            str = this.zzdxo;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getMediationAdapterClassName() {
        try {
            if (this.zzdxm != null) {
                return this.zzdxm.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setImmersiveMode(boolean z) {
        synchronized (this.lock) {
            if (this.zzdxm != null) {
                try {
                    this.zzdxm.setImmersiveMode(z);
                } catch (RemoteException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setCustomData(String str) {
        synchronized (this.lock) {
            if (this.zzdxm != null) {
                try {
                    this.zzdxm.setCustomData(str);
                    this.zzdxp = str;
                } catch (RemoteException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getCustomData() {
        String str;
        synchronized (this.lock) {
            str = this.zzdxp;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final ResponseInfo getResponseInfo() {
        zzyt zzytVar = null;
        try {
            if (this.zzdxm != null) {
                zzytVar = this.zzdxm.zzkh();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzytVar);
    }
}
