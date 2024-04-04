package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public interface MediationRewardedVideoAdAdapter extends MediationAdapter {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2);

    void showVideo();
}
