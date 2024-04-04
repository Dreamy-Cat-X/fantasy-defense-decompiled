package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaps implements com.google.android.gms.ads.internal.overlay.zzp {
    private final /* synthetic */ zzapp zzdns;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaps(zzapp zzappVar) {
        this.zzdns = zzappVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onUserLeaveHint() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zza(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        MediationInterstitialListener mediationInterstitialListener;
        zzaym.zzdy("AdMobCustomTabsAdapter overlay is closed.");
        mediationInterstitialListener = this.zzdns.zzdnq;
        mediationInterstitialListener.onAdClosed(this.zzdns);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onPause() {
        zzaym.zzdy("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onResume() {
        zzaym.zzdy("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzvn() {
        MediationInterstitialListener mediationInterstitialListener;
        zzaym.zzdy("Opening AdMobCustomTabsAdapter overlay.");
        mediationInterstitialListener = this.zzdns.zzdnq;
        mediationInterstitialListener.onAdOpened(this.zzdns);
    }
}
