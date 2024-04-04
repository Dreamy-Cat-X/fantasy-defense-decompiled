package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzapl implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    private final /* synthetic */ zzamz zzdne;
    private final /* synthetic */ zzapi zzdnk;
    private final /* synthetic */ zzaoy zzdnl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapl(zzapi zzapiVar, zzaoy zzaoyVar, zzamz zzamzVar) {
        this.zzdnk = zzapiVar;
        this.zzdnl = zzaoyVar;
        this.zzdne = zzamzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        if (mediationRewardedAd == null) {
            zzaym.zzex("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdnl.zzdl("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzaym.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdnk.zzdmg = mediationRewardedAd;
            this.zzdnl.zzvm();
        } catch (RemoteException e2) {
            zzaym.zzc("", e2);
        }
        return new zzapo(this.zzdne);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdnl.zzdl(str);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zzdnl.zzg(adError.zzdp());
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
