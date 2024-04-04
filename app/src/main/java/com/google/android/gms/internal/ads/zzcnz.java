package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzcnz implements zzdqj {
    static final zzdqj zzgmf = new zzcnz();

    private zzcnz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.google.android.gms.ads.internal.util.zzd.zzeb("Ad request signals:");
        com.google.android.gms.ads.internal.util.zzd.zzeb(jSONObject.toString(2));
        return jSONObject;
    }
}
