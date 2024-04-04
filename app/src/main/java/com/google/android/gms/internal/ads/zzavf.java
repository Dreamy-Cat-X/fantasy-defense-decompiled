package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzavf {
    private final Context zzaaf;
    private final zzauq zzdxs;

    public zzavf(Context context, String str) {
        this.zzaaf = context.getApplicationContext();
        this.zzdxs = zzwo.zzqn().zzc(context, str, new zzamu());
    }

    public final void zza(zzzc zzzcVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            this.zzdxs.zza(zzvn.zza(this.zzaaf, zzzcVar), new zzavi(rewardedAdLoadCallback));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.zzdxs.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return "";
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            this.zzdxs.zza(new zzavl(serverSideVerificationOptions));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zzdxs.zza(new zzaai(onAdMetadataChangedListener));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final Bundle getAdMetadata() {
        try {
            return this.zzdxs.getAdMetadata();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return new Bundle();
        }
    }

    public final boolean isLoaded() {
        try {
            return this.zzdxs.isLoaded();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback) {
        try {
            this.zzdxs.zza(new zzavh(rewardedAdCallback));
            this.zzdxs.zze(ObjectWrapper.wrap(activity));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback, boolean z) {
        try {
            this.zzdxs.zza(new zzavh(rewardedAdCallback));
            this.zzdxs.zza(ObjectWrapper.wrap(activity), z);
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final RewardItem getRewardItem() {
        try {
            zzaup zzru = this.zzdxs.zzru();
            if (zzru == null) {
                return null;
            }
            return new zzave(zzru);
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzyt zzytVar;
        try {
            zzytVar = this.zzdxs.zzkh();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            zzytVar = null;
        }
        return ResponseInfo.zza(zzytVar);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzdxs.zza(new zzaah(onPaidEventListener));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }
}
