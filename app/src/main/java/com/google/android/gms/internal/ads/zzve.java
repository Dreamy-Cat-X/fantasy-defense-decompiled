package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzve extends zzwu {
    private final AdListener zzcgw;

    public zzve(AdListener adListener) {
        this.zzcgw = adListener;
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdClosed() {
        this.zzcgw.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdFailedToLoad(int i) {
        this.zzcgw.onAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzc(zzvc zzvcVar) {
        this.zzcgw.onAdFailedToLoad(zzvcVar.zzqb());
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdLeftApplication() {
        this.zzcgw.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdLoaded() {
        this.zzcgw.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdOpened() {
        this.zzcgw.onAdOpened();
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdClicked() {
        this.zzcgw.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void onAdImpression() {
        this.zzcgw.onAdImpression();
    }

    public final AdListener getAdListener() {
        return this.zzcgw;
    }
}
