package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbf implements zzder<Bundle> {
    private final double zzdwm;
    private final boolean zzdwn;

    public zzdbf(double d, boolean z) {
        this.zzdwm = d;
        this.zzdwn = z;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle zza = zzdnl.zza(bundle2, "device");
        bundle2.putBundle("device", zza);
        Bundle zza2 = zzdnl.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzdwn);
        zza2.putDouble("battery_level", this.zzdwm);
    }
}
