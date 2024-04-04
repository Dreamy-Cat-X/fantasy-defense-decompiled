package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzwr extends AdListener {
    private final Object lock = new Object();
    private AdListener zzcjf;

    public final void zza(AdListener adListener) {
        synchronized (this.lock) {
            this.zzcjf = adListener;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        synchronized (this.lock) {
            if (this.zzcjf != null) {
                this.zzcjf.onAdClosed();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(int i) {
        synchronized (this.lock) {
            if (this.zzcjf != null) {
                this.zzcjf.onAdFailedToLoad(i);
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.lock) {
            if (this.zzcjf != null) {
                this.zzcjf.onAdFailedToLoad(loadAdError);
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLeftApplication() {
        synchronized (this.lock) {
            if (this.zzcjf != null) {
                this.zzcjf.onAdLeftApplication();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        synchronized (this.lock) {
            if (this.zzcjf != null) {
                this.zzcjf.onAdOpened();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.lock) {
            if (this.zzcjf != null) {
                this.zzcjf.onAdLoaded();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        synchronized (this.lock) {
            if (this.zzcjf != null) {
                this.zzcjf.onAdImpression();
            }
        }
    }
}
