package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbcs {
    private final ArrayList<zzot> zzeol = new ArrayList<>();
    private long zzeom;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzack() {
        Iterator<zzot> it = this.zzeol.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> responseHeaders = it.next().getResponseHeaders();
            if (responseHeaders != null) {
                for (Map.Entry<String, List<String>> entry : responseHeaders.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.zzeom = Math.max(this.zzeom, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.zzeom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzot zzotVar) {
        this.zzeol.add(zzotVar);
    }
}
