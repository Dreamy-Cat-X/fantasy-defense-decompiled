package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbb implements zzder<Bundle> {
    private final float zzdsy;
    private final int zzdwa;
    private final boolean zzdwb;
    private final boolean zzdwc;
    private final int zzdwd;
    private final int zzdwe;
    private final int zzdwf;
    private final boolean zzgzn;

    public zzdbb(int i, boolean z, boolean z2, int i2, int i3, int i4, float f, boolean z3) {
        this.zzdwa = i;
        this.zzdwb = z;
        this.zzdwc = z2;
        this.zzdwd = i2;
        this.zzdwe = i3;
        this.zzdwf = i4;
        this.zzdsy = f;
        this.zzgzn = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.zzdwa);
        bundle2.putBoolean("ma", this.zzdwb);
        bundle2.putBoolean("sp", this.zzdwc);
        bundle2.putInt("muv", this.zzdwd);
        bundle2.putInt("rm", this.zzdwe);
        bundle2.putInt("riv", this.zzdwf);
        bundle2.putFloat("android_app_volume", this.zzdsy);
        bundle2.putBoolean("android_app_muted", this.zzgzn);
    }
}
