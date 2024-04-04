package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdih extends zzxj implements com.google.android.gms.ads.internal.overlay.zzp, zzsd {
    private final String zzbup;
    private final zzbff zzgtg;
    private final Context zzgwb;
    private final zzdht zzhdh;
    private zzbjs zzhdj;
    private final zzdif zzhei;
    protected zzbks zzhek;
    private AtomicBoolean zzhdf = new AtomicBoolean();
    private long zzhej = -1;

    public zzdih(zzbff zzbffVar, Context context, String str, zzdif zzdifVar, zzdht zzdhtVar) {
        this.zzgtg = zzbffVar;
        this.zzgwb = context;
        this.zzbup = str;
        this.zzhei = zzdifVar;
        this.zzhdh = zzdhtVar;
        zzdhtVar.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean isReady() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onResume() {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setUserId(String str) {
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
    public final void zza(zzvi zzviVar, zzww zzwwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwq zzwqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwv zzwvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxn zzxnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxo zzxoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxw zzxwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzyo zzyoVar) {
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
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzxo zzki() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzwv zzkj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvu zzvuVar) {
        this.zzhei.zza(zzvuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized boolean zza(zzvi zzviVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (com.google.android.gms.ads.internal.util.zzm.zzba(this.zzgwb) && zzviVar.zzchk == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Failed to load the ad because app ID is missing.");
            this.zzhdh.zzd(zzdns.zza(zzdnu.APP_ID_MISSING, null, null));
            return false;
        }
        if (isLoading()) {
            return false;
        }
        this.zzhdf = new AtomicBoolean();
        return this.zzhei.zza(zzviVar, this.zzbup, new zzdim(this), new zzdil(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzbks zzbksVar) {
        zzbksVar.zza(this);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zza(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        int i = zzdio.zzhen[zzlVar.ordinal()];
        if (i == 1) {
            zzec(zzbjy.zzfsb);
            return;
        }
        if (i == 2) {
            zzec(zzbjy.zzfsa);
        } else if (i == 3) {
            zzec(zzbjy.zzfsc);
        } else {
            if (i != 4) {
                return;
            }
            zzec(zzbjy.zzfse);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void onUserLeaveHint() {
        if (this.zzhek != null) {
            this.zzhek.zzb(com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - this.zzhej, zzbjy.zzfrz);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzms() {
        zzec(zzbjy.zzfsb);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzvn() {
        if (this.zzhek == null) {
            return;
        }
        this.zzhej = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
        int zzaje = this.zzhek.zzaje();
        if (zzaje <= 0) {
            return;
        }
        zzbjs zzbjsVar = new zzbjs(this.zzgtg.zzaeu(), com.google.android.gms.ads.internal.zzp.zzkx());
        this.zzhdj = zzbjsVar;
        zzbjsVar.zza(zzaje, new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdij
            private final zzdih zzhel;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhel = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzhel.zzaui();
            }
        });
    }

    private final synchronized void zzec(int i) {
        if (this.zzhdf.compareAndSet(false, true)) {
            this.zzhdh.onAdClosed();
            if (this.zzhdj != null) {
                com.google.android.gms.ads.internal.zzp.zzkt().zzb(this.zzhdj);
            }
            if (this.zzhek != null) {
                long j = -1;
                if (this.zzhej != -1) {
                    j = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - this.zzhej;
                }
                this.zzhek.zzb(j, i);
            }
            destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzhek != null) {
            this.zzhek.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzsm zzsmVar) {
        this.zzhdh.zzb(zzsmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zza(zzvp zzvpVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized boolean isLoading() {
        return this.zzhei.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized String getAdUnitId() {
        return this.zzbup;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized zzyt zzkh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized zzvp zzkf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized String getMediationAdapterClassName() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized String zzkg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zzke() {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zza(zzxu zzxuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void setManualImpressionsEnabled(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized zzyu getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zza(zzaaq zzaaqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zza(zzacd zzacdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final Bundle getAdMetadata() {
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaui() {
        this.zzgtg.zzaet().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdik
            private final zzdih zzhel;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhel = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzhel.zzauj();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzauj() {
        zzec(zzbjy.zzfsd);
    }
}
