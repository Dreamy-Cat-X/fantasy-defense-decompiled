package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzay {
    private final List<String> zzeeh = new ArrayList();
    private final List<Double> zzeei = new ArrayList();
    private final List<Double> zzeej = new ArrayList();

    public final zzay zza(String str, double d, double d2) {
        int i = 0;
        while (i < this.zzeeh.size()) {
            double doubleValue = this.zzeej.get(i).doubleValue();
            double doubleValue2 = this.zzeei.get(i).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.zzeeh.add(i, str);
        this.zzeej.add(i, Double.valueOf(d));
        this.zzeei.add(i, Double.valueOf(d2));
        return this;
    }

    public final zzat zzzm() {
        return new zzat(this);
    }
}
