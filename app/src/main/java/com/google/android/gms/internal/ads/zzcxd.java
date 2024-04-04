package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcxd extends zzxj implements zzbtb {
    private final String zzbup;
    private zzblb zzgvz;
    private final Context zzgwb;
    private final zzdmz zzgwc;
    private final zzdiq zzgwf;
    private final zzcxf zzgwg;
    private zzvp zzgwh;

    public zzcxd(Context context, zzvp zzvpVar, String str, zzdiq zzdiqVar, zzcxf zzcxfVar) {
        this.zzgwb = context;
        this.zzgwf = zzdiqVar;
        this.zzgwh = zzvpVar;
        this.zzbup = str;
        this.zzgwg = zzcxfVar;
        this.zzgwc = zzdiqVar.zzaul();
        zzdiqVar.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean isReady() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void stopLoading() {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzarc zzarcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzari zzariVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzaty zzatyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzsm zzsmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvi zzviVar, zzww zzwwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvu zzvuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxw zzxwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzza zzzaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzbl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zze(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final IObjectWrapper zzkd() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzgwf.zzauk());
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized boolean zza(zzvi zzviVar) throws RemoteException {
        zzf(this.zzgwh);
        return zzg(zzviVar);
    }

    private final synchronized void zzf(zzvp zzvpVar) {
        this.zzgwc.zzg(zzvpVar);
        this.zzgwc.zzbl(this.zzgwh.zzchx);
    }

    private final synchronized boolean zzg(zzvi zzviVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (com.google.android.gms.ads.internal.util.zzm.zzba(this.zzgwb) && zzviVar.zzchk == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Failed to load the ad because app ID is missing.");
            if (this.zzgwg != null) {
                this.zzgwg.zzd(zzdns.zza(zzdnu.APP_ID_MISSING, null, null));
            }
            return false;
        }
        zzdnp.zze(this.zzgwb, zzviVar.zzcha);
        return this.zzgwf.zza(zzviVar, this.zzbup, null, new zzcxc(this));
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgvz != null) {
            this.zzgvz.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgvz != null) {
            this.zzgvz.zzakn().zzcc(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgvz != null) {
            this.zzgvz.zzakn().zzcd(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwv zzwvVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgwg.zzc(zzwvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzwv zzkj() {
        return this.zzgwg.zzasl();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxo zzxoVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgwg.zzb(zzxoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzxo zzki() {
        return this.zzgwg.zzasm();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zzke() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        if (this.zzgvz != null) {
            this.zzgvz.zzke();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized zzvp zzkf() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        if (this.zzgvz != null) {
            return zzdnd.zzb(this.zzgwb, Collections.singletonList(this.zzgvz.zzajn()));
        }
        return this.zzgwc.zzkf();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zza(zzvp zzvpVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzgwc.zzg(zzvpVar);
        this.zzgwh = zzvpVar;
        if (this.zzgvz != null) {
            this.zzgvz.zza(this.zzgwf.zzauk(), zzvpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized String getMediationAdapterClassName() {
        if (this.zzgvz == null || this.zzgvz.zzako() == null) {
            return null;
        }
        return this.zzgvz.zzako().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized String zzkg() {
        if (this.zzgvz == null || this.zzgvz.zzako() == null) {
            return null;
        }
        return this.zzgvz.zzako().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized zzyt zzkh() {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcyb)).booleanValue()) {
            return null;
        }
        if (this.zzgvz == null) {
            return null;
        }
        return this.zzgvz.zzako();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zza(zzxu zzxuVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzgwc.zzc(zzxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzgwc.zzbm(z);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized boolean isLoading() {
        return this.zzgwf.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized zzyu getVideoController() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        if (this.zzgvz == null) {
            return null;
        }
        return this.zzgvz.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized String getAdUnitId() {
        return this.zzbup;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zza(zzaaq zzaaqVar) {
        Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        this.zzgwc.zzc(zzaaqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwq zzwqVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgwf.zza(zzwqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zza(zzacd zzacdVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgwf.zza(zzacdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final synchronized void zzals() {
        if (this.zzgwf.zzaum()) {
            zzvp zzkf = this.zzgwc.zzkf();
            if (this.zzgvz != null && this.zzgvz.zzajw() != null && this.zzgwc.zzavj()) {
                zzkf = zzdnd.zzb(this.zzgwb, Collections.singletonList(this.zzgvz.zzajw()));
            }
            zzf(zzkf);
            try {
                zzg(this.zzgwc.zzavf());
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Failed to refresh the banner ad.");
                return;
            }
        }
        this.zzgwf.zzaun();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzyo zzyoVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zzgwg.zzb(zzyoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxn zzxnVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }
}
