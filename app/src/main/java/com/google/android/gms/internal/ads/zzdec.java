package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdec implements zzder<Bundle> {
    private final String zzdze;
    private final String zzhbc;
    private final String zzhbd;
    private final String zzhbe;
    private final Long zzhbf;

    public zzdec(String str, String str2, String str3, String str4, Long l) {
        this.zzdze = str;
        this.zzhbc = str2;
        this.zzhbd = str3;
        this.zzhbe = str4;
        this.zzhbf = l;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzdnl.zza(bundle2, "gmp_app_id", this.zzdze);
        zzdnl.zza(bundle2, "fbs_aiid", this.zzhbc);
        zzdnl.zza(bundle2, "fbs_aeid", this.zzhbd);
        zzdnl.zza(bundle2, "apm_id_origin", this.zzhbe);
        Long l = this.zzhbf;
        if (l != null) {
            bundle2.putLong("sai_timeout", l.longValue());
        }
    }
}
