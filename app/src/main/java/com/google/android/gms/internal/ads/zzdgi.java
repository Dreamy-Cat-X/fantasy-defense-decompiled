package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgi implements zzder<JSONObject> {
    private String zzhcw;
    private String zzhcx;

    public zzdgi(String str, String str2) {
        this.zzhcw = str;
        this.zzhcx = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            JSONObject zzb = com.google.android.gms.ads.internal.util.zzbk.zzb(jSONObject, "pii");
            zzb.put("doritos", this.zzhcw);
            zzb.put("doritos_v2", this.zzhcx);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("Failed putting doritos string.");
        }
    }
}
