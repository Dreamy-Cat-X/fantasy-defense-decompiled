package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    private final Context context;
    private final String zzadn;
    private final int zzdmh;
    private final String zzdnh;
    private final String zzesu;
    private final Bundle zzesv;
    private final Bundle zzesw;
    private final int zzesx;
    private final boolean zzmx;
    private final Location zzmy;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: D:\decomp\classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, Location location, int i, int i2, String str2, String str3) {
        this.zzesu = str;
        this.zzesv = bundle;
        this.zzesw = bundle2;
        this.context = context;
        this.zzmx = z;
        this.zzmy = location;
        this.zzdmh = i;
        this.zzesx = i2;
        this.zzadn = str2;
        this.zzdnh = str3;
    }

    public String getBidResponse() {
        return this.zzesu;
    }

    public Bundle getServerParameters() {
        return this.zzesv;
    }

    public Bundle getMediationExtras() {
        return this.zzesw;
    }

    public Context getContext() {
        return this.context;
    }

    public Location getLocation() {
        return this.zzmy;
    }

    public int taggedForChildDirectedTreatment() {
        return this.zzdmh;
    }

    public boolean isTestRequest() {
        return this.zzmx;
    }

    public int taggedForUnderAgeTreatment() {
        return this.zzesx;
    }

    public String getMaxAdContentRating() {
        return this.zzadn;
    }

    public String getWatermark() {
        return this.zzdnh;
    }
}
