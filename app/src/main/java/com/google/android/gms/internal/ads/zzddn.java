package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddn implements zzder<Bundle> {
    private String zzdss;

    public zzddn(String str) {
        this.zzdss = str;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        bundle.putString("request_id", this.zzdss);
    }
}
