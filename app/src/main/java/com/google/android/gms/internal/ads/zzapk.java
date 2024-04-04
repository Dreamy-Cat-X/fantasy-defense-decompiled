package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzapk implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {
    private final /* synthetic */ zzamz zzdne;
    private final /* synthetic */ zzaos zzdnj;
    private final /* synthetic */ zzapi zzdnk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapk(zzapi zzapiVar, zzaos zzaosVar, zzamz zzamzVar) {
        this.zzdnk = zzapiVar;
        this.zzdnj = zzaosVar;
        this.zzdne = zzamzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        if (mediationInterstitialAd == null) {
            zzaym.zzex("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdnj.zzdl("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzaym.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdnk.zzdng = mediationInterstitialAd;
            this.zzdnj.zzvm();
        } catch (RemoteException e2) {
            zzaym.zzc("", e2);
        }
        return new zzapo(this.zzdne);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdnj.zzdl(str);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zzdnj.zzg(adError.zzdp());
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
