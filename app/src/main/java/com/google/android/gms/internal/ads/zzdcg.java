package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.kt.olleh.inapp.net.InAppError;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdcg implements zzder<Bundle> {
    private final String zzdth;
    private final boolean zzdtj;

    public zzdcg(String str, boolean z) {
        this.zzdth = str;
        this.zzdtj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.zzdth);
        if (this.zzdtj) {
            bundle2.putString("de", InAppError.FAILED);
        }
    }
}
