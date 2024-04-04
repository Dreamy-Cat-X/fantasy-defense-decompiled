package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbis implements zzbqr, zzbrf, zzbrj, zzbsg, zzuz {
    private final Context context;
    private final Executor executor;
    private final zzacm zzeqv;
    private final ScheduledExecutorService zzfpk;
    private final zzdmt zzfpl;
    private final zzdmi zzfpm;
    private final zzdsf zzfpn;
    private final zzdnj zzfpo;
    private final zzef zzfpp;
    private final zzacn zzfpq;
    private final WeakReference<View> zzfpr;
    private boolean zzfps;
    private boolean zzfpt;

    public zzbis(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, zzdmt zzdmtVar, zzdmi zzdmiVar, zzdsf zzdsfVar, zzdnj zzdnjVar, View view, zzef zzefVar, zzacm zzacmVar, zzacn zzacnVar) {
        this.context = context;
        this.executor = executor;
        this.zzfpk = scheduledExecutorService;
        this.zzfpl = zzdmtVar;
        this.zzfpm = zzdmiVar;
        this.zzfpn = zzdsfVar;
        this.zzfpo = zzdnjVar;
        this.zzfpp = zzefVar;
        this.zzfpr = new WeakReference<>(view);
        this.zzeqv = zzacmVar;
        this.zzfpq = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final synchronized void onAdLoaded() {
        if (this.zzfps) {
            ArrayList arrayList = new ArrayList(this.zzfpm.zzdlh);
            arrayList.addAll(this.zzfpm.zzhhn);
            this.zzfpo.zzj(this.zzfpn.zza(this.zzfpl, this.zzfpm, true, null, null, arrayList));
        } else {
            this.zzfpo.zzj(this.zzfpn.zza(this.zzfpl, this.zzfpm, this.zzfpm.zzhhp));
            this.zzfpo.zzj(this.zzfpn.zza(this.zzfpl, this.zzfpm, this.zzfpm.zzhhn));
        }
        this.zzfps = true;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void onAdClicked() {
        if ((((Boolean) zzwo.zzqq().zzd(zzabh.zzcny)).booleanValue() && this.zzfpl.zzhiz.zzera.zzecf) || !zzadb.zzdcl.get().booleanValue()) {
            zzdnj zzdnjVar = this.zzfpo;
            zzdsf zzdsfVar = this.zzfpn;
            zzdmt zzdmtVar = this.zzfpl;
            zzdmi zzdmiVar = this.zzfpm;
            List<String> zza = zzdsfVar.zza(zzdmtVar, zzdmiVar, zzdmiVar.zzdlg);
            com.google.android.gms.ads.internal.zzp.zzkq();
            zzdnjVar.zza(zza, com.google.android.gms.ads.internal.util.zzm.zzbb(this.context) ? zzcpz.zzgqc : zzcpz.zzgqb);
            return;
        }
        zzdyz.zza(zzdyu.zzg(this.zzfpq.zza(this.context, this.zzeqv.zzsx(), this.zzeqv.zzsy())).zza(((Long) zzwo.zzqq().zzd(zzabh.zzcow)).longValue(), TimeUnit.MILLISECONDS, this.zzfpk), new zzbiv(this), this.executor);
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final synchronized void onAdImpression() {
        if (!this.zzfpt) {
            String zza = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcrw)).booleanValue() ? this.zzfpp.zzca().zza(this.context, this.zzfpr.get(), (Activity) null) : null;
            if (!(((Boolean) zzwo.zzqq().zzd(zzabh.zzcny)).booleanValue() && this.zzfpl.zzhiz.zzera.zzecf) && zzadb.zzdcm.get().booleanValue()) {
                zzdyz.zza(zzdyu.zzg(this.zzfpq.zzk(this.context)).zza(((Long) zzwo.zzqq().zzd(zzabh.zzcow)).longValue(), TimeUnit.MILLISECONDS, this.zzfpk), new zzbiu(this, zza), this.executor);
                this.zzfpt = true;
            }
            this.zzfpo.zzj(this.zzfpn.zza(this.zzfpl, this.zzfpm, false, zza, null, this.zzfpm.zzdlh));
            this.zzfpt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzb(zzato zzatoVar, String str, String str2) {
        zzdnj zzdnjVar = this.zzfpo;
        zzdsf zzdsfVar = this.zzfpn;
        zzdmi zzdmiVar = this.zzfpm;
        zzdnjVar.zzj(zzdsfVar.zza(zzdmiVar, zzdmiVar.zzdut, zzatoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoStarted() {
        zzdnj zzdnjVar = this.zzfpo;
        zzdsf zzdsfVar = this.zzfpn;
        zzdmt zzdmtVar = this.zzfpl;
        zzdmi zzdmiVar = this.zzfpm;
        zzdnjVar.zzj(zzdsfVar.zza(zzdmtVar, zzdmiVar, zzdmiVar.zzdus));
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoCompleted() {
        zzdnj zzdnjVar = this.zzfpo;
        zzdsf zzdsfVar = this.zzfpn;
        zzdmt zzdmtVar = this.zzfpl;
        zzdmi zzdmiVar = this.zzfpm;
        zzdnjVar.zzj(zzdsfVar.zza(zzdmtVar, zzdmiVar, zzdmiVar.zzhho));
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzk(zzvc zzvcVar) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcql)).booleanValue()) {
            this.zzfpo.zzj(this.zzfpn.zza(this.zzfpl, this.zzfpm, zzdsf.zza(2, zzvcVar.errorCode, this.zzfpm.zzhhq)));
        }
    }
}
