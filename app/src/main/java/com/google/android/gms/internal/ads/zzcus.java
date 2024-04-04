package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcus implements zzcqv<zzdno, zzcsn> {
    private final zzchu zzgle;
    private final Map<String, zzcqs<zzdno, zzcsn>> zzgtx = new HashMap();

    public zzcus(zzchu zzchuVar) {
        this.zzgle = zzchuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final zzcqs<zzdno, zzcsn> zzf(String str, JSONObject jSONObject) throws zzdnf {
        synchronized (this) {
            zzcqs<zzdno, zzcsn> zzcqsVar = this.zzgtx.get(str);
            if (zzcqsVar == null) {
                zzdno zzd = this.zzgle.zzd(str, jSONObject);
                if (zzd == null) {
                    return null;
                }
                zzcqsVar = new zzcqs<>(zzd, new zzcsn(), str);
                this.zzgtx.put(str, zzcqsVar);
            }
            return zzcqsVar;
        }
    }
}
