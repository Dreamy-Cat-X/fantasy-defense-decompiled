package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfb implements zzder<Bundle> {
    private final String zzdwg;
    private final int zzdwh;
    private final int zzdwi;
    private final int zzdwj;
    private final boolean zzdwk;
    private final int zzdwl;

    public zzdfb(String str, int i, int i2, int i3, boolean z, int i4) {
        this.zzdwg = str;
        this.zzdwh = i;
        this.zzdwi = i2;
        this.zzdwj = i3;
        this.zzdwk = z;
        this.zzdwl = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzdnl.zza(bundle2, "carrier", this.zzdwg, !TextUtils.isEmpty(r0));
        zzdnl.zza(bundle2, "cnt", Integer.valueOf(this.zzdwh), this.zzdwh != -2);
        bundle2.putInt("gnt", this.zzdwi);
        bundle2.putInt("pt", this.zzdwj);
        Bundle zza = zzdnl.zza(bundle2, "device");
        bundle2.putBundle("device", zza);
        Bundle zza2 = zzdnl.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzdwl);
        zza2.putBoolean("active_network_metered", this.zzdwk);
    }
}
