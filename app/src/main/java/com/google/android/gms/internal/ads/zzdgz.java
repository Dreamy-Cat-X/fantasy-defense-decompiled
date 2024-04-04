package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgz implements zzder<JSONObject> {
    private final Map<String, Object> zzhde;

    public zzdgz(Map<String, Object> map) {
        this.zzhde = map;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(JSONObject jSONObject) {
        try {
            jSONObject.put("video_decoders", com.google.android.gms.ads.internal.zzp.zzkq().zzj(this.zzhde));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            com.google.android.gms.ads.internal.util.zzd.zzeb(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
