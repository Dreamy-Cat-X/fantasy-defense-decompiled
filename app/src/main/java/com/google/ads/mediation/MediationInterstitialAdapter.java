package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends MediationAdapter<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, SERVER_PARAMETERS server_parameters, MediationAdRequest mediationAdRequest, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
