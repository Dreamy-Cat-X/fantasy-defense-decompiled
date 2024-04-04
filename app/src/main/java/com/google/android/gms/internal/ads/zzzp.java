package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.query.QueryInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzzp {
    private final String zzbqr;
    private final Bundle zzckq;

    public zzzp(String str, Bundle bundle) {
        this.zzbqr = str;
        this.zzckq = bundle;
    }

    public final String getQuery() {
        return this.zzbqr;
    }

    public static String zza(QueryInfo queryInfo) {
        String str = zzwo.zzqu().get(queryInfo);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final Bundle getQueryBundle() {
        return this.zzckq;
    }
}
