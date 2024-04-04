package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzdex implements zzder<Bundle> {
    private final boolean zzdwq;
    private final boolean zzdwr;
    private final String zzdws;
    private final boolean zzdwt;
    private final boolean zzdwu;
    private final boolean zzdwv;
    private final String zzdww;
    private final String zzdwx;
    private final String zzdwy;
    private final boolean zzdwz;
    private final ArrayList<String> zzhbw;
    private final String zzhbx;
    private final String zzhby;
    private final long zzhbz;

    public zzdex(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j) {
        this.zzdwq = z;
        this.zzdwr = z2;
        this.zzdws = str;
        this.zzdwt = z3;
        this.zzdwu = z4;
        this.zzdwv = z5;
        this.zzdww = str2;
        this.zzhbw = arrayList;
        this.zzdwx = str3;
        this.zzdwy = str4;
        this.zzhbx = str5;
        this.zzdwz = z6;
        this.zzhby = str6;
        this.zzhbz = j;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("cog", this.zzdwq);
        bundle2.putBoolean("coh", this.zzdwr);
        bundle2.putString("gl", this.zzdws);
        bundle2.putBoolean("simulator", this.zzdwt);
        bundle2.putBoolean("is_latchsky", this.zzdwu);
        bundle2.putBoolean("is_sidewinder", this.zzdwv);
        bundle2.putString("hl", this.zzdww);
        if (!this.zzhbw.isEmpty()) {
            bundle2.putStringArrayList("hl_list", this.zzhbw);
        }
        bundle2.putString("mv", this.zzdwx);
        bundle2.putString("submodel", this.zzhby);
        Bundle zza = zzdnl.zza(bundle2, "device");
        bundle2.putBundle("device", zza);
        zza.putString("build", this.zzhbx);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcry)).booleanValue()) {
            zza.putLong("remaining_data_partition_space", this.zzhbz);
        }
        Bundle zza2 = zzdnl.zza(zza, "browser");
        zza.putBundle("browser", zza2);
        zza2.putBoolean("is_browser_custom_tabs_capable", this.zzdwz);
        if (TextUtils.isEmpty(this.zzdwy)) {
            return;
        }
        Bundle zza3 = zzdnl.zza(zza, "play_store");
        zza.putBundle("play_store", zza3);
        zza3.putString("package_version", this.zzdwy);
    }
}
