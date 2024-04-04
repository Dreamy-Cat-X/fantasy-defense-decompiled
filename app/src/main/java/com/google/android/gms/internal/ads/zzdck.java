package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdck implements zzder<Bundle> {
    private final Boolean zzhaj;

    public zzdck(Boolean bool) {
        this.zzhaj = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        Boolean bool = this.zzhaj;
        if (bool != null) {
            bundle2.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
