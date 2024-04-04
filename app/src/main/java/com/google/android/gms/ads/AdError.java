package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzvc;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int code;
    private final String zzack;
    private final String zzacl;
    private final AdError zzacm;

    public AdError(int i, String str, String str2) {
        this.code = i;
        this.zzack = str;
        this.zzacl = str2;
        this.zzacm = null;
    }

    public AdError(int i, String str, String str2, AdError adError) {
        this.code = i;
        this.zzack = str;
        this.zzacl = str2;
        this.zzacm = adError;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.zzack;
    }

    public String getDomain() {
        return this.zzacl;
    }

    public AdError getCause() {
        return this.zzacm;
    }

    public final zzvc zzdp() {
        zzvc zzvcVar;
        if (this.zzacm == null) {
            zzvcVar = null;
        } else {
            AdError adError = this.zzacm;
            zzvcVar = new zzvc(adError.code, adError.zzack, adError.zzacl, null, null);
        }
        return new zzvc(this.code, this.zzack, this.zzacl, zzvcVar, null);
    }

    public JSONObject zzdq() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.code);
        jSONObject.put("Message", this.zzack);
        jSONObject.put("Domain", this.zzacl);
        AdError adError = this.zzacm;
        if (adError == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", adError.zzdq());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return zzdq().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
