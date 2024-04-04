package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzckv implements AppEventListener, zzbqr, zzbqw, zzbrj, zzbrm, zzbsg, zzbtf, zzdre, zzuz {
    private long startTime;
    private final List<Object> zzefy;
    private final zzckj zzgkw;

    public zzckv(zzckj zzckjVar, zzbff zzbffVar) {
        this.zzgkw = zzckjVar;
        this.zzefy = Collections.singletonList(zzbffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzb(zzdmt zzdmtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzcc(Context context) {
        zza(zzbrm.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzcd(Context context) {
        zza(zzbrm.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzce(Context context) {
        zza(zzbrm.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zza(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void onAdLoaded() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - this.startTime;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
        zza(zzbsg.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzd(zzvc zzvcVar) {
        zza(zzbqw.class, "onAdFailedToLoad", Integer.valueOf(zzvcVar.errorCode), zzvcVar.zzcgs, zzvcVar.zzcgt);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdOpened() {
        zza(zzbqr.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdClosed() {
        zza(zzbqr.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdLeftApplication() {
        zza(zzbqr.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void onAdClicked() {
        zza(zzuz.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void onAdImpression() {
        zza(zzbrj.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoStarted() {
        zza(zzbqr.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    @ParametersAreNonnullByDefault
    public final void zzb(zzato zzatoVar, String str, String str2) {
        zza(zzbqr.class, "onRewarded", zzatoVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoCompleted() {
        zza(zzbqr.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zza(zzdqz zzdqzVar, String str) {
        zza(zzdqw.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zzb(zzdqz zzdqzVar, String str) {
        zza(zzdqw.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zza(zzdqz zzdqzVar, String str, Throwable th) {
        zza(zzdqw.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zzc(zzdqz zzdqzVar, String str) {
        zza(zzdqw.class, "onTaskSucceeded", str);
    }

    private final void zza(Class<?> cls, String str, Object... objArr) {
        zzckj zzckjVar = this.zzgkw;
        List<Object> list = this.zzefy;
        String valueOf = String.valueOf(cls.getSimpleName());
        zzckjVar.zza(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzd(zzasu zzasuVar) {
        this.startTime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
        zza(zzbtf.class, "onAdRequest", new Object[0]);
    }
}
