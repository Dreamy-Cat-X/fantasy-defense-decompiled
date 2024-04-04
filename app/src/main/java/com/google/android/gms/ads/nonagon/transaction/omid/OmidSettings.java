package com.google.android.gms.ads.nonagon.transaction.omid;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class OmidSettings {
    private final JSONObject zzhjp;

    public OmidSettings(JSONObject jSONObject) {
        this.zzhjp = jSONObject;
    }

    public OmidMediaType getMediaType() {
        int optInt = this.zzhjp.optInt("media_type", -1);
        if (optInt == 0) {
            return OmidMediaType.DISPLAY;
        }
        if (optInt == 1) {
            return OmidMediaType.VIDEO;
        }
        return OmidMediaType.UNKNOWN;
    }

    public String getVideoEventsOwner() {
        if (zza.zzhjr[getMediaType().ordinal()] != 1) {
            return "javascript";
        }
        return null;
    }
}
