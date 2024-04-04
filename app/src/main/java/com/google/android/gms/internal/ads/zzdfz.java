package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfz implements zzder<JSONObject> {
    private JSONObject zzhcq;

    public zzdfz(JSONObject jSONObject) {
        this.zzhcq = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            jSONObject.put("cache_state", this.zzhcq);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("Unable to get cache_state");
        }
    }
}
