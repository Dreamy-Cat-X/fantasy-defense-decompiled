package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzav {
    public final int count;
    public final String name;
    private final double zzeeb;
    private final double zzeec;
    public final double zzeed;

    public zzav(String str, double d, double d2, double d3, int i) {
        this.name = str;
        this.zzeec = d;
        this.zzeeb = d2;
        this.zzeed = d3;
        this.count = i;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.name).add("minBound", Double.valueOf(this.zzeec)).add("maxBound", Double.valueOf(this.zzeeb)).add("percent", Double.valueOf(this.zzeed)).add("count", Integer.valueOf(this.count)).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzav)) {
            return false;
        }
        zzav zzavVar = (zzav) obj;
        return Objects.equal(this.name, zzavVar.name) && this.zzeeb == zzavVar.zzeeb && this.zzeec == zzavVar.zzeec && this.count == zzavVar.count && Double.compare(this.zzeed, zzavVar.zzeed) == 0;
    }

    public final int hashCode() {
        return Objects.hashCode(this.name, Double.valueOf(this.zzeeb), Double.valueOf(this.zzeec), Double.valueOf(this.zzeed), Integer.valueOf(this.count));
    }
}
