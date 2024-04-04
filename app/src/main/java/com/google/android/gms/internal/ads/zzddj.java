package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddj implements zzder<Bundle> {
    private final Bundle zzfxd;

    public zzddj(Bundle bundle) {
        this.zzfxd = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = this.zzfxd;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
    }
}
