package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzat {
    private final String[] zzedw;
    private final double[] zzedx;
    private final double[] zzedy;
    private final int[] zzedz;
    private int zzeea;

    private zzat(zzay zzayVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzayVar.zzeei;
        int size = list.size();
        list2 = zzayVar.zzeeh;
        this.zzedw = (String[]) list2.toArray(new String[size]);
        list3 = zzayVar.zzeei;
        this.zzedx = zzg(list3);
        list4 = zzayVar.zzeej;
        this.zzedy = zzg(list4);
        this.zzedz = new int[size];
        this.zzeea = 0;
    }

    private static double[] zzg(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final void zza(double d) {
        this.zzeea++;
        int i = 0;
        while (true) {
            double[] dArr = this.zzedy;
            if (i >= dArr.length) {
                return;
            }
            if (dArr[i] <= d && d < this.zzedx[i]) {
                int[] iArr = this.zzedz;
                iArr[i] = iArr[i] + 1;
            }
            if (d < this.zzedy[i]) {
                return;
            } else {
                i++;
            }
        }
    }

    public final List<zzav> zzzl() {
        ArrayList arrayList = new ArrayList(this.zzedw.length);
        for (int i = 0; i < this.zzedw.length; i++) {
            String str = this.zzedw[i];
            double d = this.zzedy[i];
            double d2 = this.zzedx[i];
            int[] iArr = this.zzedz;
            double d3 = iArr[i];
            double d4 = this.zzeea;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new zzav(str, d, d2, d3 / d4, iArr[i]));
        }
        return arrayList;
    }
}
