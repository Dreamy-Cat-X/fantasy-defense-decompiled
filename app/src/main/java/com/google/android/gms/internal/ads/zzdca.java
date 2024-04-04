package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdca implements zzder<Bundle> {
    private final String zzdtx;
    private final String zzhad;
    private final Bundle zzhae;

    private zzdca(String str, String str2, Bundle bundle) {
        this.zzdtx = str;
        this.zzhad = str2;
        this.zzhae = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.zzdtx);
        bundle2.putString("fc_consent", this.zzhad);
        bundle2.putBundle("iab_consent_info", this.zzhae);
    }
}
