package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.ImagesContract;
import com.kt.olleh.inapp.net.InAppError;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzata {
    private final int errorCode;
    private final String type;
    private String url;
    private final String zzdss;
    private final String zzdvd;
    private final boolean zzdve;
    private final String zzdvq;
    private final List<String> zzdvs;
    private final String zzdvt;
    private final String zzdvu;
    private final boolean zzdvv;
    private final boolean zzdvw;
    private final String zzdvx;
    private final boolean zzdvy;
    private final JSONObject zzdvz;

    private static boolean parseBoolean(String str) {
        if (str != null) {
            return str.equals(InAppError.FAILED) || str.equals("true");
        }
        return false;
    }

    public zzata(JSONObject jSONObject) {
        this.url = jSONObject.optString(ImagesContract.URL);
        this.zzdvt = jSONObject.optString("base_uri");
        this.zzdvu = jSONObject.optString("post_parameters");
        this.zzdvv = parseBoolean(jSONObject.optString("drt_include"));
        this.zzdvw = parseBoolean(jSONObject.optString("cookies_include", "true"));
        this.zzdss = jSONObject.optString("request_id");
        this.type = jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.zzdvs = optString == null ? null : Arrays.asList(optString.split(","));
        this.errorCode = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.zzdvx = jSONObject.optString("fetched_ad");
        this.zzdvy = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.zzdvz = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.zzdvd = jSONObject.optString("analytics_query_ad_event_id");
        this.zzdve = jSONObject.optBoolean("is_analytics_logging_enabled");
        this.zzdvq = jSONObject.optString("pool_key");
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final List<String> zzwj() {
        return this.zzdvs;
    }

    public final String zzwk() {
        return this.zzdvt;
    }

    public final String zzwl() {
        return this.zzdvu;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean zzwm() {
        return this.zzdvv;
    }

    public final boolean zzwn() {
        return this.zzdvw;
    }

    public final JSONObject zzwo() {
        return this.zzdvz;
    }

    public final String zzwp() {
        return this.zzdvq;
    }
}
