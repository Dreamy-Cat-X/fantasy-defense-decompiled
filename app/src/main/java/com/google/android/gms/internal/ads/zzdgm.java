package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgm implements zzder<JSONObject> {
    private List<String> zzdst;

    public zzdgm(List<String> list) {
        this.zzdst = list;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            jSONObject.put("eid", TextUtils.join(",", this.zzdst));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("Failed putting experiment ids.");
        }
    }
}
