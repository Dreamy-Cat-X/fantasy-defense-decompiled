package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdal implements zzder<Bundle> {
    private final Bundle zzgze;

    private zzdal(Bundle bundle) {
        this.zzgze = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.zzgze.isEmpty()) {
            return;
        }
        bundle2.putBundle("installed_adapter_data", this.zzgze);
    }
}
