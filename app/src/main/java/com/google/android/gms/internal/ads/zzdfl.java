package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfl implements zzder<JSONObject> {
    private final String zzhci;

    public zzdfl(String str) {
        this.zzhci = str;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            jSONObject.put("ms", this.zzhci);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zza("Failed putting Ad ID.", e);
        }
    }
}
