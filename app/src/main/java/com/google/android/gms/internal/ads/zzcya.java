package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcya extends zzxj {
    private final zzvp zzbpe;
    private final String zzbup;
    private final Context zzgwb;
    private final zzcxf zzgwg;
    private final zzdkf zzgwt;
    private final zzdkp zzgwu;
    private zzbyd zzgwv;
    private boolean zzgww = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcof)).booleanValue();

    public zzcya(Context context, zzvp zzvpVar, String str, zzdkf zzdkfVar, zzcxf zzcxfVar, zzdkp zzdkpVar) {
        this.zzbpe = zzvpVar;
        this.zzbup = str;
        this.zzgwb = context;
        this.zzgwt = zzdkfVar;
        this.zzgwg = zzcxfVar;
        this.zzgwu = zzdkpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzyu getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setManualImpressionsEnabled(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void stopLoading() {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzaaq zzaaqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzarc zzarcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzari zzariVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzsm zzsmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvp zzvpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvu zzvuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwq zzwqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxu zzxuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzza zzzaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzbl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final IObjectWrapper zzkd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzke() {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzvp zzkf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized boolean zza(zzvi zzviVar) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (com.google.android.gms.ads.internal.util.zzm.zzba(this.zzgwb) && zzviVar.zzchk == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Failed to load the ad because app ID is missing.");
            if (this.zzgwg != null) {
                this.zzgwg.zzd(zzdns.zza(zzdnu.APP_ID_MISSING, null, null));
            }
            return false;
        }
        if (zzaso()) {
            return false;
        }
        zzdnp.zze(this.zzgwb, zzviVar.zzcha);
        this.zzgwv = null;
        return this.zzgwt.zza(zzviVar, this.zzbup, new zzdkg(this.zzbpe), new zzcyd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvi zzviVar, zzww zzwwVar) {
        this.zzgwg.zza(zzwwVar);
        zza(zzviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        if (this.zzgwv == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Interstitial can not be shown before loaded.");
            this.zzgwg.zzk(zzdns.zza(zzdnu.NOT_READY, null, null));
        } else {
            this.zzgwv.zzb(this.zzgww, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxw zzxwVar) {
        this.zzgwg.zzb(zzxwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgwv != null) {
            this.zzgwv.zzakn().zzce(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgwv != null) {
            this.zzgwv.zzakn().zzcc(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgwv != null) {
            this.zzgwv.zzakn().zzcd(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwv zzwvVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgwg.zzc(zzwvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxo zzxoVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgwg.zzb(zzxoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void showInterstitial() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzgwv == null) {
            return;
        }
        this.zzgwv.zzb(this.zzgww, null);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized String getMediationAdapterClassName() {
        if (this.zzgwv == null || this.zzgwv.zzako() == null) {
            return null;
        }
        return this.zzgwv.zzako().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized String zzkg() {
        if (this.zzgwv == null || this.zzgwv.zzako() == null) {
            return null;
        }
        return this.zzgwv.zzako().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized zzyt zzkh() {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcyb)).booleanValue()) {
            return null;
        }
        if (this.zzgwv == null) {
            return null;
        }
        return this.zzgwv.zzako();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized boolean isLoading() {
        return this.zzgwt.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized boolean isReady() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzaso();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized String getAdUnitId() {
        return this.zzbup;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzxo zzki() {
        return this.zzgwg.zzasm();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzwv zzkj() {
        return this.zzgwg.zzasl();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzgww = z;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zza(zzacd zzacdVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgwt.zza(zzacdVar);
    }

    private final synchronized boolean zzaso() {
        boolean z;
        if (this.zzgwv != null) {
            z = this.zzgwv.isClosed() ? false : true;
        }
        return z;
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

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzaty zzatyVar) {
        this.zzgwu.zzb(zzatyVar);
    }
}
