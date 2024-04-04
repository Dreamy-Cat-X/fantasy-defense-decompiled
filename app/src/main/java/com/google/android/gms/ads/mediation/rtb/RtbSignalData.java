package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class RtbSignalData {
    private final Context context;
    private final Bundle zzche;
    private final AdSize zzdq;
    private final List<MediationConfiguration> zzeue;

    public RtbSignalData(Context context, List<MediationConfiguration> list, Bundle bundle, AdSize adSize) {
        this.context = context;
        this.zzeue = list;
        this.zzche = bundle;
        this.zzdq = adSize;
    }

    public Context getContext() {
        return this.context;
    }

    @Deprecated
    public MediationConfiguration getConfiguration() {
        List<MediationConfiguration> list = this.zzeue;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.zzeue.get(0);
    }

    public List<MediationConfiguration> getConfigurations() {
        return this.zzeue;
    }

    public Bundle getNetworkExtras() {
        return this.zzche;
    }

    public AdSize getAdSize() {
        return this.zzdq;
    }
}
