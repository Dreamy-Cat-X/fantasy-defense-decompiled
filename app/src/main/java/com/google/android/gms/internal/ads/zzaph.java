package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaph implements MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> {
    private final /* synthetic */ zzaon zzdnd;
    private final /* synthetic */ zzamz zzdne;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaph(zzapi zzapiVar, zzaon zzaonVar, zzamz zzamzVar) {
        this.zzdnd = zzaonVar;
        this.zzdne = zzamzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final MediationBannerAdCallback onSuccess(MediationBannerAd mediationBannerAd) {
        if (mediationBannerAd == null) {
            zzaym.zzex("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdnd.zzdl("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzaym.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdnd.zzx(ObjectWrapper.wrap(mediationBannerAd.getView()));
        } catch (RemoteException e2) {
            zzaym.zzc("", e2);
        }
        return new zzapo(this.zzdne);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdnd.zzdl(str);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zzdnd.zzg(adError.zzdp());
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
