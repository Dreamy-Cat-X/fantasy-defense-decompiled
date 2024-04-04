package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjl implements zzepq<zzqs> {
    private final zzeqd<JSONObject> zzext;
    private final zzeqd<zzdmi> zzfrj;
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<String> zzfrl;

    private zzbjl(zzeqd<zzdmi> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<JSONObject> zzeqdVar3, zzeqd<String> zzeqdVar4) {
        this.zzfrj = zzeqdVar;
        this.zzfrk = zzeqdVar2;
        this.zzext = zzeqdVar3;
        this.zzfrl = zzeqdVar4;
    }

    public static zzbjl zza(zzeqd<zzdmi> zzeqdVar, zzeqd<zzayt> zzeqdVar2, zzeqd<JSONObject> zzeqdVar3, zzeqd<String> zzeqdVar4) {
        return new zzbjl(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        this.zzfrj.get();
        zzayt zzaytVar = this.zzfrk.get();
        JSONObject jSONObject = this.zzext.get();
        String str = this.zzfrl.get();
        boolean equals = "native".equals(str);
        com.google.android.gms.ads.internal.zzp.zzkq();
        return (zzqs) zzepw.zza(new zzqs(com.google.android.gms.ads.internal.util.zzm.zzyw(), zzaytVar, str, jSONObject, false, equals), "Cannot return null from a non-@Nullable @Provides method");
    }
}
