package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcam implements zzepq<JSONObject> {
    private final zzeqd<zzcbm> zzexs;
    private final zzcan zzgbi;

    public zzcam(zzcan zzcanVar, zzeqd<zzcbm> zzeqdVar) {
        this.zzgbi = zzcanVar;
        this.zzexs = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return this.zzexs.get().zzaod();
    }
}
