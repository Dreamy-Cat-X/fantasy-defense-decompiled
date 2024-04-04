package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcvl implements zzcqv<zzaoz, zzcsk> {
    private final zzcwo zzgum;

    public zzcvl(zzcwo zzcwoVar) {
        this.zzgum = zzcwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final zzcqs<zzaoz, zzcsk> zzf(String str, JSONObject jSONObject) throws zzdnf {
        zzaoz zzgo = this.zzgum.zzgo(str);
        if (zzgo == null) {
            return null;
        }
        return new zzcqs<>(zzgo, new zzcsk(), str);
    }
}
