package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdrs {
    private final Clock zzbpw;
    private final Map<String, List<String>> zzhqb = new HashMap();
    private final Map<String, Long> zzhqc = new HashMap();

    public zzdrs(Clock clock) {
        this.zzbpw = clock;
    }

    public final void zzhc(String str) {
        if (this.zzhqc.containsKey(str)) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime() - this.zzhqc.remove(str).longValue();
            StringBuilder sb = new StringBuilder(20);
            sb.append(elapsedRealtime);
            zzx(str, sb.toString());
            return;
        }
        this.zzhqc.put(str, Long.valueOf(this.zzbpw.elapsedRealtime()));
    }

    public final void zzw(String str, String str2) {
        if (this.zzhqc.containsKey(str)) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime() - this.zzhqc.remove(str).longValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 20);
            sb.append(str2);
            sb.append(elapsedRealtime);
            zzx(str, sb.toString());
            return;
        }
        this.zzhqc.put(str, Long.valueOf(this.zzbpw.elapsedRealtime()));
    }

    public final List<zzdrv> zzaxo() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.zzhqb.entrySet()) {
            int i = 0;
            if (entry.getValue().size() > 1) {
                for (String str : entry.getValue()) {
                    String key = entry.getKey();
                    i++;
                    StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 12);
                    sb.append(key);
                    sb.append(".");
                    sb.append(i);
                    arrayList.add(new zzdrv(sb.toString(), str));
                }
            } else {
                arrayList.add(new zzdrv(entry.getKey(), entry.getValue().get(0)));
            }
        }
        return arrayList;
    }

    private final void zzx(String str, String str2) {
        if (!this.zzhqb.containsKey(str)) {
            this.zzhqb.put(str, new ArrayList());
        }
        this.zzhqb.get(str).add(str2);
    }
}
