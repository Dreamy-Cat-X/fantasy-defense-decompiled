package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcwz extends zzxj {
    private final Context context;
    private final ViewGroup zzfsr;
    private final zzdmx zzfve;
    private final zzwv zzgaf;
    private final zzblb zzgvz;

    public zzcwz(Context context, zzwv zzwvVar, zzdmx zzdmxVar, zzblb zzblbVar) {
        this.context = context;
        this.zzgaf = zzwvVar;
        this.zzfve = zzdmxVar;
        this.zzgvz = zzblbVar;
        FrameLayout frameLayout = new FrameLayout(this.context);
        frameLayout.removeAllViews();
        frameLayout.addView(this.zzgvz.zzajo(), com.google.android.gms.ads.internal.zzp.zzks().zzzb());
        frameLayout.setMinimumHeight(zzkf().heightPixels);
        frameLayout.setMinimumWidth(zzkf().widthPixels);
        this.zzfsr = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void showInterstitial() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void stopLoading() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzarc zzarcVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzari zzariVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzaty zzatyVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzsm zzsmVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvi zzviVar, zzww zzwwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvu zzvuVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxw zzxwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzza zzzaVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzbl(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zze(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final IObjectWrapper zzkd() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfsr);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgvz.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean zza(zzvi zzviVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zzd.zzew("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgvz.zzakn().zzcc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgvz.zzakn().zzcd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzke() throws RemoteException {
        this.zzgvz.zzke();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzvp zzkf() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzdnd.zzb(this.context, Collections.singletonList(this.zzgvz.zzajn()));
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgvz.zzako() != null) {
            return this.zzgvz.zzako().getMediationAdapterClassName();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzyu getVideoController() throws RemoteException {
        return this.zzgvz.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final String getAdUnitId() throws RemoteException {
        return this.zzfve.zzhje;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzxo zzki() throws RemoteException {
        return this.zzfve.zzhjk;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzwv zzkj() throws RemoteException {
        return this.zzgaf;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final String zzkg() throws RemoteException {
        if (this.zzgvz.zzako() != null) {
            return this.zzgvz.zzako().getMediationAdapterClassName();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzyt zzkh() {
        return this.zzgvz.zzako();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzaaq zzaaqVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zzd.zzew("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvp zzvpVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzblb zzblbVar = this.zzgvz;
        if (zzblbVar != null) {
            zzblbVar.zza(this.zzfsr, zzvpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzacd zzacdVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zzd.zzew("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwq zzwqVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zzd.zzew("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxu zzxuVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zzd.zzew("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        com.google.android.gms.ads.internal.util.zzd.zzew("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwv zzwvVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zzd.zzew("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxo zzxoVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zzd.zzew("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxn zzxnVar) throws RemoteException {
        com.google.android.gms.ads.internal.util.zzd.zzew("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final Bundle getAdMetadata() throws RemoteException {
        com.google.android.gms.ads.internal.util.zzd.zzew("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzyo zzyoVar) {
        com.google.android.gms.ads.internal.util.zzd.zzew("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }
}
