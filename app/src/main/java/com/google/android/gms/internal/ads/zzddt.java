package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddt implements zzder<Bundle> {
    private final String zzhaw;

    public zzddt(String str) {
        this.zzhaw = str;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        bundle.putString("rtb", this.zzhaw);
    }
}
