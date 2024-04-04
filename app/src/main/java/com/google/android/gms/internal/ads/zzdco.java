package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdco implements zzder<Bundle> {
    private final Bundle zzdtg;

    public zzdco(Bundle bundle) {
        this.zzdtg = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle zza = zzdnl.zza(bundle2, "device");
        zza.putBundle("android_mem_info", this.zzdtg);
        bundle2.putBundle("device", zza);
    }
}
