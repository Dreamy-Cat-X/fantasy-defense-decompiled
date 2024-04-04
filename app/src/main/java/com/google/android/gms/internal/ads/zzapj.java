package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzapj implements MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> {
    private final /* synthetic */ zzamz zzdne;
    private final /* synthetic */ zzaot zzdni;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapj(zzapi zzapiVar, zzaot zzaotVar, zzamz zzamzVar) {
        this.zzdni = zzaotVar;
        this.zzdne = zzamzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final MediationNativeAdCallback onSuccess(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        if (unifiedNativeAdMapper == null) {
            zzaym.zzex("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdni.zzdl("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzaym.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdni.zza(new zzaoo(unifiedNativeAdMapper));
        } catch (RemoteException e2) {
            zzaym.zzc("", e2);
        }
        return new zzapo(this.zzdne);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdni.zzdl(str);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zzdni.zzg(adError.zzdp());
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
