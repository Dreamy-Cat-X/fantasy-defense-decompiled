package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzanr implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    private final /* synthetic */ zzamz zzdmj;
    private final /* synthetic */ zzanp zzdmk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanr(zzanp zzanpVar, zzamz zzamzVar) {
        this.zzdmk = zzanpVar;
        this.zzdmj = zzamzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            this.zzdmk.zzdmg = mediationRewardedAd;
            this.zzdmj.onAdLoaded();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
        return new zzavn(this.zzdmj);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.zzdmk.zzdmc;
            String canonicalName = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            zzaym.zzdy(sb.toString());
            this.zzdmj.zzc(0, str);
            this.zzdmj.onAdFailedToLoad(0);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.zzdmk.zzdmc;
            String canonicalName = obj.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 87 + String.valueOf(message).length() + String.valueOf(domain).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ErrorCode = ");
            sb.append(code);
            sb.append(". ErrorMessage = ");
            sb.append(message);
            sb.append(". ErrorDomain = ");
            sb.append(domain);
            zzaym.zzdy(sb.toString());
            this.zzdmj.zzc(adError.zzdp());
            this.zzdmj.zzc(adError.getCode(), adError.getMessage());
            this.zzdmj.onAdFailedToLoad(adError.getCode());
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
