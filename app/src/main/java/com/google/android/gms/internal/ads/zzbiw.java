package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbiw {
    private final Executor executor;
    private final String zzbre;
    private final zzamd zzfpy;
    private zzbjf zzfpz;
    private final zzahv<Object> zzfqa = new zzbiz(this);
    private final zzahv<Object> zzfqb = new zzbjb(this);

    public zzbiw(String str, zzamd zzamdVar, Executor executor) {
        this.zzbre = str;
        this.zzfpy = zzamdVar;
        this.executor = executor;
    }

    public final void zza(zzbjf zzbjfVar) {
        this.zzfpy.zzc("/updateActiveView", this.zzfqa);
        this.zzfpy.zzc("/untrackActiveViewUnit", this.zzfqb);
        this.zzfpz = zzbjfVar;
    }

    public final void zza(zzbdh zzbdhVar) {
        zzbdhVar.zza("/updateActiveView", this.zzfqa);
        zzbdhVar.zza("/untrackActiveViewUnit", this.zzfqb);
    }

    public final void zzb(zzbdh zzbdhVar) {
        zzbdhVar.zzb("/updateActiveView", this.zzfqa);
        zzbdhVar.zzb("/untrackActiveViewUnit", this.zzfqb);
    }

    public final void zzaiu() {
        this.zzfpy.zzd("/updateActiveView", this.zzfqa);
        this.zzfpy.zzd("/untrackActiveViewUnit", this.zzfqb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzn(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zzbre);
    }
}
