package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzabv {
    private final Map<String, zzabw> zzdac = new HashMap();
    private final zzaby zzdad;

    public zzabv(zzaby zzabyVar) {
        this.zzdad = zzabyVar;
    }

    public final void zza(String str, zzabw zzabwVar) {
        this.zzdac.put(str, zzabwVar);
    }

    public final void zzb(String str, String str2, long j) {
        zzaby zzabyVar = this.zzdad;
        zzabw zzabwVar = this.zzdac.get(str2);
        String[] strArr = {str};
        if (zzabyVar != null && zzabwVar != null) {
            zzabyVar.zza(zzabwVar, j, strArr);
        }
        Map<String, zzabw> map = this.zzdac;
        zzaby zzabyVar2 = this.zzdad;
        map.put(str, zzabyVar2 == null ? null : zzabyVar2.zzex(j));
    }

    public final zzaby zzsk() {
        return this.zzdad;
    }
}
