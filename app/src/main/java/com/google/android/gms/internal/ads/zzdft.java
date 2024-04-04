package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdft implements zzder<JSONObject> {
    private String zzhco;

    public zzdft(String str) {
        this.zzhco = str;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            JSONObject zzb = com.google.android.gms.ads.internal.util.zzbk.zzb(jSONObject, "pii");
            if (TextUtils.isEmpty(this.zzhco)) {
                return;
            }
            zzb.put("attok", this.zzhco);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zza("Failed putting attestation token.", e);
        }
    }
}
