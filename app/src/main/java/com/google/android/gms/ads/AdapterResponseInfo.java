package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzvt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class AdapterResponseInfo {
    private final zzvt zzadd;
    private final AdError zzade;

    private AdapterResponseInfo(zzvt zzvtVar) {
        this.zzadd = zzvtVar;
        this.zzade = zzvtVar.zzcia == null ? null : zzvtVar.zzcia.zzqa();
    }

    public static AdapterResponseInfo zza(zzvt zzvtVar) {
        if (zzvtVar != null) {
            return new AdapterResponseInfo(zzvtVar);
        }
        return null;
    }

    public final String getAdapterClassName() {
        return this.zzadd.zzchy;
    }

    public final long getLatencyMillis() {
        return this.zzadd.zzchz;
    }

    public final AdError getAdError() {
        return this.zzade;
    }

    public final Bundle getCredentials() {
        return this.zzadd.zzcib;
    }

    public final JSONObject zzdq() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.zzadd.zzchy);
        jSONObject.put("Latency", this.zzadd.zzchz);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.zzadd.zzcib.keySet()) {
            jSONObject2.put(str, this.zzadd.zzcib.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.zzade;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.zzdq());
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return zzdq().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
