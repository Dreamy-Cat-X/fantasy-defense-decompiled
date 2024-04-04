package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjt implements zzepq<JSONObject> {
    private final zzeqd<zzdmi> zzfrj;

    private zzbjt(zzeqd<zzdmi> zzeqdVar) {
        this.zzfrj = zzeqdVar;
    }

    public static zzbjt zzc(zzeqd<zzdmi> zzeqdVar) {
        return new zzbjt(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzbjq.zza(this.zzfrj.get());
    }
}
