package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzagw extends zzafn {
    private final NativeContentAd.OnContentAdLoadedListener zzdfq;

    public zzagw(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.zzdfq = onContentAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafo
    public final void zza(zzafb zzafbVar) {
        this.zzdfq.onContentAdLoaded(new zzafg(zzafbVar));
    }
}
