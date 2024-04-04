package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzsg extends zzsl {
    private final WeakReference<AppOpenAd.AppOpenAdLoadCallback> zzbui;

    public zzsg(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzbui = new WeakReference<>(appOpenAdLoadCallback);
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final void zza(zzsh zzshVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zzbui.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdLoaded(new zzss(zzshVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final void onAppOpenAdFailedToLoad(int i) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zzbui.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final void zza(zzvc zzvcVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zzbui.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(zzvcVar.zzqb());
        }
    }
}
