package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsk extends zzanc implements zzbrz {
    private zzamz zzdno;
    private zzbsc zzgsn;

    public final synchronized void zzb(zzamz zzamzVar) {
        this.zzdno = zzamzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrz
    public final synchronized void zza(zzbsc zzbscVar) {
        this.zzgsn = zzbscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void onAdClicked() throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void onAdClosed() throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.onAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void onAdFailedToLoad(int i) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.onAdFailedToLoad(i);
        }
        if (this.zzgsn != null) {
            this.zzgsn.onAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zzc(int i, String str) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zzc(i, str);
        }
        if (this.zzgsn != null) {
            this.zzgsn.zzf(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zzc(zzvc zzvcVar) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zzc(zzvcVar);
        }
        if (this.zzgsn != null) {
            this.zzgsn.zzd(zzvcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void onAdLeftApplication() throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void onAdOpened() throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.onAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void onAdLoaded() throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.onAdLoaded();
        }
        if (this.zzgsn != null) {
            this.zzgsn.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zza(zzane zzaneVar) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zza(zzaneVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void onAdImpression() throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void onAppEvent(String str, String str2) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.onAppEvent(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zza(zzaff zzaffVar, String str) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zza(zzaffVar, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void onVideoEnd() throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.onVideoEnd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zzdi(String str) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zzdi(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zzvd() throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zzvd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void onVideoPlay() throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.onVideoPlay();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zzb(zzaun zzaunVar) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zzb(zzaunVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void onVideoPause() throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.onVideoPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zzb(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zzve() throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zzve();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zzdc(int i) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zzdc(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zzdj(String str) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zzdj(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zzf(zzvc zzvcVar) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zzf(zzvcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final synchronized void zza(zzaup zzaupVar) throws RemoteException {
        if (this.zzdno != null) {
            this.zzdno.zza(zzaupVar);
        }
    }
}
