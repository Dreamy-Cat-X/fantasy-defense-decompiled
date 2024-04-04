package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdhf extends zzxj implements com.google.android.gms.ads.internal.overlay.zzy, zzbsl, zzsd {
    private final zzayt zzbos;
    private final String zzbup;
    private final ViewGroup zzfsr;
    private final zzbff zzgtg;
    private final Context zzgwb;
    private final zzdhd zzhdg;
    private final zzdht zzhdh;
    private zzbjs zzhdj;
    protected zzbki zzhdk;
    private AtomicBoolean zzhdf = new AtomicBoolean();
    private long zzhdi = -1;

    public zzdhf(zzbff zzbffVar, Context context, String str, zzdhd zzdhdVar, zzdht zzdhtVar, zzayt zzaytVar) {
        this.zzfsr = new FrameLayout(context);
        this.zzgtg = zzbffVar;
        this.zzgwb = context;
        this.zzbup = str;
        this.zzhdg = zzdhdVar;
        this.zzhdh = zzdhtVar;
        zzdhtVar.zza(this);
        this.zzbos = zzaytVar;
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
    public final zzxo zzki() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzwv zzkj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final IObjectWrapper zzkd() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzfsr);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvu zzvuVar) {
        this.zzhdg.zza(zzvuVar);
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
        return this.zzhdg.zza(zzviVar, this.zzbup, new zzdhk(this), new zzdhj(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.ads.internal.overlay.zzr zza(zzbki zzbkiVar) {
        boolean zzacp = zzbkiVar.zzacp();
        int intValue = ((Integer) zzwo.zzqq().zzd(zzabh.zzcui)).intValue();
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = new com.google.android.gms.ads.internal.overlay.zzq();
        zzqVar.size = 50;
        zzqVar.paddingLeft = zzacp ? intValue : 0;
        zzqVar.paddingRight = zzacp ? 0 : intValue;
        zzqVar.paddingTop = 0;
        zzqVar.paddingBottom = intValue;
        return new com.google.android.gms.ads.internal.overlay.zzr(this.zzgwb, zzqVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RelativeLayout.LayoutParams zzb(zzbki zzbkiVar) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(zzbkiVar.zzacp() ? 11 : 9);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(zzbki zzbkiVar) {
        zzbkiVar.zza(this);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzy
    public final void zzvt() {
        zzec(zzbjy.zzfsc);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzms() {
        zzec(zzbjy.zzfsb);
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zzalo() {
        if (this.zzhdk == null) {
            return;
        }
        this.zzhdi = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
        int zzaje = this.zzhdk.zzaje();
        if (zzaje <= 0) {
            return;
        }
        zzbjs zzbjsVar = new zzbjs(this.zzgtg.zzaeu(), com.google.android.gms.ads.internal.zzp.zzkx());
        this.zzhdj = zzbjsVar;
        zzbjsVar.zza(zzaje, new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdhh
            private final zzdhf zzhdo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhdo = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzhdo.zzauf();
            }
        });
    }

    private final synchronized void zzec(int i) {
        if (this.zzhdf.compareAndSet(false, true)) {
            if (this.zzhdk != null && this.zzhdk.zzajq() != null) {
                this.zzhdh.zzb(this.zzhdk.zzajq());
            }
            this.zzhdh.onAdClosed();
            this.zzfsr.removeAllViews();
            if (this.zzhdj != null) {
                com.google.android.gms.ads.internal.zzp.zzkt().zzb(this.zzhdj);
            }
            if (this.zzhdk != null) {
                long j = -1;
                if (this.zzhdi != -1) {
                    j = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - this.zzhdi;
                }
                this.zzhdk.zzb(j, i);
            }
            destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzvp zzaue() {
        return zzdnd.zzb(this.zzgwb, Collections.singletonList(this.zzhdk.zzajn()));
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzhdk != null) {
            this.zzhdk.destroy();
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
    public final synchronized zzvp zzkf() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        if (this.zzhdk == null) {
            return null;
        }
        return zzdnd.zzb(this.zzgwb, Collections.singletonList(this.zzhdk.zzajn()));
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized void zza(zzvp zzvpVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
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
    public final synchronized zzyt zzkh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized boolean isLoading() {
        return this.zzhdg.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final synchronized String getAdUnitId() {
        return this.zzbup;
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
    public final /* synthetic */ void zzauf() {
        zzwo.zzqm();
        if (zzayd.zzzv()) {
            zzec(zzbjy.zzfsd);
        } else {
            this.zzgtg.zzaet().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdhi
                private final zzdhf zzhdo;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzhdo = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzhdo.zzaug();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaug() {
        zzec(zzbjy.zzfsd);
    }
}
