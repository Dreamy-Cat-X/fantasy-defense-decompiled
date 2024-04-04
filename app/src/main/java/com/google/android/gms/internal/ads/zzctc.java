package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzctc implements zzcqv<zzdno, zzcsk> {
    private final zzchu zzgle;

    public zzctc(zzchu zzchuVar) {
        this.zzgle = zzchuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final zzcqs<zzdno, zzcsk> zzf(String str, JSONObject jSONObject) throws zzdnf {
        zzdno zzd = this.zzgle.zzd(str, jSONObject);
        if (zzd == null) {
            return null;
        }
        return new zzcqs<>(zzd, new zzcsk(), str);
    }
}
