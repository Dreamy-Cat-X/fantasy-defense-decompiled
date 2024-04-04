package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcbr implements zzepq<zzcbp> {
    private final zzeqd<JSONObject> zzexq;
    private final zzeqd<zzdmi> zzfrj;

    public zzcbr(zzeqd<zzdmi> zzeqdVar, zzeqd<JSONObject> zzeqdVar2) {
        this.zzfrj = zzeqdVar;
        this.zzexq = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcbp(this.zzfrj.get(), this.zzexq.get());
    }
}
