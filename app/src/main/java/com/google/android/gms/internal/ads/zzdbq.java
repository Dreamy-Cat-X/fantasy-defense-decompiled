package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbq implements zzder<Bundle> {
    private final String zzgyn;

    public zzdbq(@Nullable String str) {
        this.zzgyn = str;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(this.zzgyn)) {
            return;
        }
        bundle2.putString("fwd_cld", this.zzgyn);
    }
}
