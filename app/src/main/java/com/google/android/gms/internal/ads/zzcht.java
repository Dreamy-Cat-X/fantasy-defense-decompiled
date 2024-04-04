package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcht {
    private final Map<String, zzchq> zzgis = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zza(String str, zzdno zzdnoVar) {
        if (this.zzgis.containsKey(str)) {
            return;
        }
        try {
            this.zzgis.put(str, new zzchq(str, zzdnoVar.zzvb(), zzdnoVar.zzvc()));
        } catch (zzdnf unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zza(String str, zzaoz zzaozVar) {
        if (this.zzgis.containsKey(str)) {
            return;
        }
        try {
            this.zzgis.put(str, new zzchq(str, zzaozVar.zzvb(), zzaozVar.zzvc()));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    private final synchronized zzchq zzgd(String str) {
        return this.zzgis.get(str);
    }

    @Nullable
    public final zzchq zzi(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            zzchq zzgd = zzgd(it.next());
            if (zzgd != null) {
                return zzgd;
            }
        }
        return null;
    }
}
