package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.instream.InstreamAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzajw extends zzajs {
    private final InstreamAd.InstreamAdLoadCallback zzdht;

    public zzajw(InstreamAd.InstreamAdLoadCallback instreamAdLoadCallback) {
        this.zzdht = instreamAdLoadCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzajp
    public final void zza(zzajj zzajjVar) {
        this.zzdht.onInstreamAdLoaded(new zzaju(zzajjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzajp
    public final void onInstreamAdFailedToLoad(int i) {
        this.zzdht.onInstreamAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.ads.zzajp
    public final void zze(zzvc zzvcVar) {
        this.zzdht.onInstreamAdFailedToLoad(zzvcVar.zzqb());
    }
}
