package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzant extends zzanc {
    private final zzauj zzdme;
    private final Adapter zzdmm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzant(Adapter adapter, zzauj zzaujVar) {
        this.zzdmm = adapter;
        this.zzdme = zzaujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdImpression() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdLeftApplication() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAppEvent(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onVideoEnd() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onVideoPause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onVideoPlay() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzaff zzaffVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzane zzaneVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(Bundle bundle) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzaun zzaunVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(zzvc zzvcVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzdc(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzdi(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzdj(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzf(zzvc zzvcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdLoaded() throws RemoteException {
        zzauj zzaujVar = this.zzdme;
        if (zzaujVar != null) {
            zzaujVar.zzag(ObjectWrapper.wrap(this.zzdmm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdOpened() throws RemoteException {
        zzauj zzaujVar = this.zzdme;
        if (zzaujVar != null) {
            zzaujVar.zzah(ObjectWrapper.wrap(this.zzdmm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdClosed() throws RemoteException {
        zzauj zzaujVar = this.zzdme;
        if (zzaujVar != null) {
            zzaujVar.zzaj(ObjectWrapper.wrap(this.zzdmm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzaup zzaupVar) throws RemoteException {
        zzauj zzaujVar = this.zzdme;
        if (zzaujVar != null) {
            zzaujVar.zza(ObjectWrapper.wrap(this.zzdmm), new zzaun(zzaupVar.getType(), zzaupVar.getAmount()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzvd() throws RemoteException {
        zzauj zzaujVar = this.zzdme;
        if (zzaujVar != null) {
            zzaujVar.zzai(ObjectWrapper.wrap(this.zzdmm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzve() throws RemoteException {
        zzauj zzaujVar = this.zzdme;
        if (zzaujVar != null) {
            zzaujVar.zzam(ObjectWrapper.wrap(this.zzdmm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdClicked() throws RemoteException {
        zzauj zzaujVar = this.zzdme;
        if (zzaujVar != null) {
            zzaujVar.zzak(ObjectWrapper.wrap(this.zzdmm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdFailedToLoad(int i) throws RemoteException {
        zzauj zzaujVar = this.zzdme;
        if (zzaujVar != null) {
            zzaujVar.zze(ObjectWrapper.wrap(this.zzdmm), i);
        }
    }
}
