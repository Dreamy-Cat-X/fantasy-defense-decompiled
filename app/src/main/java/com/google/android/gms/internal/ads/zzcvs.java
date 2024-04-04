package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzcvs extends zzanc {
    private final zzbsb zzfum;
    private final zzbrr zzfvb;
    private final zzbqy zzfzp;
    private final zzbso zzfzs;
    private final zzbri zzgap;
    private final zzbqq zzgaq;
    private final zzbuy zzghn;
    private final zzbur zzgun;
    private final zzbxu zzguu;

    public zzcvs(zzbqq zzbqqVar, zzbri zzbriVar, zzbrr zzbrrVar, zzbsb zzbsbVar, zzbuy zzbuyVar, zzbso zzbsoVar, zzbxu zzbxuVar, zzbur zzburVar, zzbqy zzbqyVar) {
        this.zzgaq = zzbqqVar;
        this.zzgap = zzbriVar;
        this.zzfvb = zzbrrVar;
        this.zzfum = zzbsbVar;
        this.zzghn = zzbuyVar;
        this.zzfzs = zzbsoVar;
        this.zzguu = zzbxuVar;
        this.zzgun = zzburVar;
        this.zzfzp = zzbqyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdFailedToLoad(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzaff zzaffVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzane zzaneVar) {
    }

    public void zza(zzaup zzaupVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(Bundle bundle) throws RemoteException {
    }

    public void zzb(zzaun zzaunVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(zzvc zzvcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzdi(String str) {
    }

    public void zzve() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdClicked() {
        this.zzgaq.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdClosed() {
        this.zzfzs.zza(com.google.android.gms.ads.internal.overlay.zzl.OTHER);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdLeftApplication() {
        this.zzfvb.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdOpened() {
        this.zzfzs.zzvn();
        this.zzgun.zzald();
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAppEvent(String str, String str2) {
        this.zzghn.onAppEvent(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onAdLoaded() {
        this.zzfum.onAdLoaded();
    }

    public void onAdImpression() {
        this.zzgap.onAdImpression();
        this.zzgun.zzalb();
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onVideoPause() {
        this.zzguu.onVideoPause();
    }

    public void zzvd() {
        this.zzguu.onVideoStart();
    }

    public void onVideoEnd() {
        this.zzguu.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void onVideoPlay() throws RemoteException {
        this.zzguu.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    @Deprecated
    public final void zzdc(int i) throws RemoteException {
        zzf(new zzvc(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzdj(String str) {
        zzf(new zzvc(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzf(zzvc zzvcVar) {
        this.zzfzp.zzl(zzdns.zza(zzdnu.MEDIATION_SHOW_ERROR, zzvcVar));
    }
}
