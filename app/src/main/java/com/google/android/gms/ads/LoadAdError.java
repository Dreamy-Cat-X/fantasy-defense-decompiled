package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzwo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class LoadAdError extends AdError {
    private final ResponseInfo zzadi;

    public LoadAdError(int i, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.zzadi = responseInfo;
    }

    public final ResponseInfo getResponseInfo() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcze)).booleanValue()) {
            return this.zzadi;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.AdError
    public final JSONObject zzdq() throws JSONException {
        JSONObject zzdq = super.zzdq();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            zzdq.put("Response Info", "null");
        } else {
            zzdq.put("Response Info", responseInfo.zzdq());
        }
        return zzdq;
    }

    @Override // com.google.android.gms.ads.AdError
    public final String toString() {
        try {
            return zzdq().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
