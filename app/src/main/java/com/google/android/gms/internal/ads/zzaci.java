package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaci extends zzacg {
    private final OnCustomRenderedAdLoadedListener zzcjt;

    public zzaci(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzcjt = onCustomRenderedAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzacd
    public final void zza(zzacc zzaccVar) {
        this.zzcjt.onCustomRenderedAdLoaded(new zzabz(zzaccVar));
    }
}
