package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdcs implements zzder<Bundle> {
    private final zzdmg zzfph;

    public zzdcs(zzdmg zzdmgVar) {
        this.zzfph = zzdmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzdmg zzdmgVar = this.zzfph;
        if (zzdmgVar != null) {
            bundle2.putBoolean("render_in_browser", zzdmgVar.zzauz());
            bundle2.putBoolean("disable_ml", this.zzfph.zzava());
        }
    }
}
