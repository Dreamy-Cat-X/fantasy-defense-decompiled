package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.kt.olleh.inapp.net.ResTags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaxt {
    private String zzdte;
    private final long zzeap;
    private final List<String> zzeaq = new ArrayList();
    private final List<String> zzear = new ArrayList();
    private final Map<String, zzams> zzeas = new HashMap();
    private String zzeat;
    private JSONObject zzeau;
    private boolean zzeav;

    public zzaxt(String str, long j) {
        JSONObject optJSONObject;
        this.zzeav = false;
        this.zzdte = str;
        this.zzeap = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzeau = jSONObject;
            if (jSONObject.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                this.zzeav = false;
                com.google.android.gms.ads.internal.util.zzd.zzex("App settings could not be fetched successfully.");
                return;
            }
            this.zzeav = true;
            this.zzeat = this.zzeau.optString(ResTags.APP_ID);
            JSONArray optJSONArray = this.zzeau.optJSONArray("ad_unit_id_settings");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    String optString = jSONObject2.optString("format");
                    String optString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.zzear.add(optString2);
                        } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.zzeas.put(optString2, new zzams(optJSONObject));
                        }
                    }
                }
            }
            JSONArray optJSONArray2 = this.zzeau.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    this.zzeaq.add(optJSONArray2.optString(i2));
                }
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.zzp.zzku().zza(e, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long zzxu() {
        return this.zzeap;
    }

    public final boolean zzxv() {
        return this.zzeav;
    }

    public final String zzxw() {
        return this.zzdte;
    }

    public final String zzxx() {
        return this.zzeat;
    }

    public final Map<String, zzams> zzxy() {
        return this.zzeas;
    }

    public final JSONObject zzxz() {
        return this.zzeau;
    }
}
