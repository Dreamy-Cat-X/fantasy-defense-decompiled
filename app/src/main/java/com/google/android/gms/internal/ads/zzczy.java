package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzczy implements zzder<Bundle> {
    private final zzdmx zzfve;

    public zzczy(zzdmx zzdmxVar) {
        Preconditions.checkNotNull(zzdmxVar, "the targeting must not be null");
        this.zzfve = zzdmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzvi zzviVar = this.zzfve.zzhjd;
        bundle2.putInt("http_timeout_millis", this.zzfve.zzhjd.zzchm);
        bundle2.putString("slotname", this.zzfve.zzhje);
        int i = zzczx.zzgib[this.zzfve.zzhjl.zzhir - 1];
        if (i == 1) {
            bundle2.putBoolean("is_new_rewarded", true);
        } else if (i == 2) {
            bundle2.putBoolean("is_rewarded_interstitial", true);
        }
        zzdnl.zza(bundle2, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzviVar.zzcgx)), zzviVar.zzcgx != -1);
        zzdnl.zza(bundle2, "extras", zzviVar.extras);
        zzdnl.zza(bundle2, "cust_gender", Integer.valueOf(zzviVar.zzcgy), zzviVar.zzcgy != -1);
        zzdnl.zza(bundle2, "kw", zzviVar.zzcgz);
        zzdnl.zza(bundle2, "tag_for_child_directed_treatment", Integer.valueOf(zzviVar.zzadl), zzviVar.zzadl != -1);
        if (zzviVar.zzcha) {
            bundle2.putBoolean("test_request", zzviVar.zzcha);
        }
        zzdnl.zza(bundle2, "d_imp_hdr", (Integer) 1, zzviVar.versionCode >= 2 && zzviVar.zzbnf);
        zzdnl.zza(bundle2, "ppid", zzviVar.zzchb, zzviVar.versionCode >= 2 && !TextUtils.isEmpty(zzviVar.zzchb));
        if (zzviVar.zzmy != null) {
            Location location = zzviVar.zzmy;
            Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
            Long valueOf2 = Long.valueOf(location.getTime() * 1000);
            Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
            Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", valueOf.floatValue());
            bundle3.putLong("lat", valueOf3.longValue());
            bundle3.putLong("long", valueOf4.longValue());
            bundle3.putLong("time", valueOf2.longValue());
            bundle2.putBundle("uule", bundle3);
        }
        zzdnl.zza(bundle2, ImagesContract.URL, zzviVar.zzchd);
        zzdnl.zza(bundle2, "neighboring_content_urls", zzviVar.zzchl);
        zzdnl.zza(bundle2, "custom_targeting", zzviVar.zzchf);
        zzdnl.zza(bundle2, "category_exclusions", zzviVar.zzchg);
        zzdnl.zza(bundle2, "request_agent", zzviVar.zzchh);
        zzdnl.zza(bundle2, "request_pkg", zzviVar.zzchi);
        zzdnl.zza(bundle2, "is_designed_for_families", Boolean.valueOf(zzviVar.zzchj), zzviVar.versionCode >= 7);
        if (zzviVar.versionCode >= 8) {
            zzdnl.zza(bundle2, "tag_for_under_age_of_consent", Integer.valueOf(zzviVar.zzadm), zzviVar.zzadm != -1);
            zzdnl.zza(bundle2, "max_ad_content_rating", zzviVar.zzadn);
        }
    }
}
