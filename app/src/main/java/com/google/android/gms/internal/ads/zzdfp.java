package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfp implements zzder<JSONObject> {
    private final JSONObject zzhck;

    public zzdfp(JSONObject jSONObject) {
        this.zzhck = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            JSONObject zzb = com.google.android.gms.ads.internal.util.zzbk.zzb(jSONObject, "content_info");
            JSONObject jSONObject2 = this.zzhck;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzb.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("Failed putting app indexing json.");
        }
    }
}
