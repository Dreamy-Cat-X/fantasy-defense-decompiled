package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzapp implements MediationInterstitialAdapter {
    private Uri uri;
    private Activity zzdnp;
    private MediationInterstitialListener zzdnq;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzdnq = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzaym.zzex("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            zzaym.zzex("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzdnq.onAdFailedToLoad(this, 0);
            return;
        }
        if (!(PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzach.zzj(context))) {
            zzaym.zzex("Default browser does not support custom tabs. Bailing out.");
            this.zzdnq.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            zzaym.zzex("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.zzdnq.onAdFailedToLoad(this, 0);
        } else {
            this.zzdnp = (Activity) context;
            this.uri = Uri.parse(string);
            this.zzdnq.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        build.intent.setData(this.uri);
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzapr(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzb(build.intent), null, new zzaps(this), null, new zzayt(0, 0, false))));
        com.google.android.gms.ads.internal.zzp.zzku().zzxm();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzaym.zzdy("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzaym.zzdy("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzaym.zzdy("Resuming AdMobCustomTabsAdapter adapter.");
    }
}
