package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzagt extends zzafm {
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzdfo;

    public zzagt(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.zzdfo = onAppInstallAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final void zza(zzaex zzaexVar) {
        this.zzdfo.onAppInstallAdLoaded(new zzafc(zzaexVar));
    }
}
