package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzapm implements SignalCallbacks {
    private final /* synthetic */ zzape zzdnm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapm(zzapi zzapiVar, zzape zzapeVar) {
        this.zzdnm = zzapeVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.zzdnm.zzdn(str);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            this.zzdnm.onFailure(str);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        try {
            this.zzdnm.zzh(adError.zzdp());
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
