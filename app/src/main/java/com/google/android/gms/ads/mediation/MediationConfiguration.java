package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class MediationConfiguration {
    private final Bundle zzesv;
    private final AdFormat zzesz;

    public MediationConfiguration(AdFormat adFormat, Bundle bundle) {
        this.zzesz = adFormat;
        this.zzesv = bundle;
    }

    public AdFormat getFormat() {
        return this.zzesz;
    }

    public Bundle getServerParameters() {
        return this.zzesv;
    }
}
