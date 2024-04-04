package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class AdUrlAdapter extends AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, MediationNativeAdapter {
    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    public final String getAdUnitId(Bundle bundle) {
        return "adurl";
    }

    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    protected final Bundle zza(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("sdk_less_server_data", bundle2);
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
