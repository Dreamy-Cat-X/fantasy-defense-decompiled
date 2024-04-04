package com.google.android.gms.ads.query;

import com.google.android.gms.internal.ads.zzaym;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class AdInfo {
    private final QueryInfo zzhqk;
    private final String zzhql;

    public static String getRequestId(String str) {
        if (str == null) {
            zzaym.zzex("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            zzaym.zzex("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    public AdInfo(QueryInfo queryInfo, String str) {
        this.zzhqk = queryInfo;
        this.zzhql = str;
    }

    public QueryInfo getQueryInfo() {
        return this.zzhqk;
    }

    public String getAdString() {
        return this.zzhql;
    }
}
