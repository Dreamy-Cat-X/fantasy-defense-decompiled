package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdeg implements zzder<Bundle> {
    private final String zzbrf;
    private final int zzdsz;
    private final boolean zzdtv;
    private final boolean zzegh;
    private final boolean zzhbh;
    private final int zzhbi;
    private final int zzhbj;

    public zzdeg(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.zzhbh = z;
        this.zzegh = z2;
        this.zzbrf = str;
        this.zzdtv = z3;
        this.zzdsz = i;
        this.zzhbi = i2;
        this.zzhbj = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.zzbrf);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) zzwo.zzqq().zzd(zzabh.zzcsa));
        bundle2.putInt("target_api", this.zzdsz);
        bundle2.putInt("dv", this.zzhbi);
        bundle2.putInt("lv", this.zzhbj);
        Bundle zza = zzdnl.zza(bundle2, "sdk_env");
        zza.putBoolean("mf", zzade.zzddb.get().booleanValue());
        zza.putBoolean("instant_app", this.zzhbh);
        zza.putBoolean("lite", this.zzegh);
        zza.putBoolean("is_privileged_process", this.zzdtv);
        bundle2.putBundle("sdk_env", zza);
        Bundle zza2 = zzdnl.zza(zza, "build_meta");
        zza2.putString("cl", "341976203");
        zza2.putString("rapid_rc", "dev");
        zza2.putString("rapid_rollup", "HEAD");
        zza.putBundle("build_meta", zza2);
    }
}
