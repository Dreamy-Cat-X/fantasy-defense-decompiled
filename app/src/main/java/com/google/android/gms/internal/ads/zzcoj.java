package com.google.android.gms.internal.ads;

import com.kt.olleh.inapp.net.ResTags;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcoj implements zzalr<zzcog> {
    @Override // com.google.android.gms.internal.ads.zzalr
    public final /* synthetic */ JSONObject zzi(zzcog zzcogVar) throws JSONException {
        zzcog zzcogVar2 = zzcogVar;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzcogVar2.zzgod.zzwk());
        jSONObject2.put("signals", zzcogVar2.zzgoc);
        jSONObject3.put("body", zzcogVar2.zzgob.zzdub);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.zzp.zzkq().zzj(zzcogVar2.zzgob.zzal));
        jSONObject3.put("response_code", zzcogVar2.zzgob.zzgol);
        jSONObject3.put("latency", zzcogVar2.zzgob.zzgom);
        jSONObject.put("request", jSONObject2);
        jSONObject.put(ResTags.RESPONSE, jSONObject3);
        jSONObject.put("flags", zzcogVar2.zzgod.zzwo());
        return jSONObject;
    }
}
