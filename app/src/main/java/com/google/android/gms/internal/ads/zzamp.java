package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzamp {
    private final String zzdki;
    private final String zzdkj;
    public final List<String> zzdkk;
    private final String zzdkl;
    private final String zzdkm;
    private final List<String> zzdkn;
    private final List<String> zzdko;
    private final List<String> zzdkp;
    private final List<String> zzdkq;
    private final List<String> zzdkr;
    public final String zzdks;
    private final List<String> zzdkt;
    private final List<String> zzdku;
    private final List<String> zzdkv;
    private final String zzdkw;
    private final String zzdkx;
    private final String zzdky;
    private final String zzdkz;
    private final String zzdla;
    private final List<String> zzdlb;
    private final String zzdlc;
    public final String zzdld;
    private final long zzdle;

    public zzamp(JSONObject jSONObject) throws JSONException {
        List<String> list;
        this.zzdkj = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.zzdkk = Collections.unmodifiableList(arrayList);
        this.zzdkl = jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzp.zzli();
        this.zzdkn = zzamr.zza(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzp.zzli();
        this.zzdko = zzamr.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzp.zzli();
        this.zzdkp = zzamr.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzp.zzli();
        this.zzdkr = zzamr.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzp.zzli();
        this.zzdkt = zzamr.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzp.zzli();
        this.zzdkv = zzamr.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzp.zzli();
        this.zzdku = zzamr.zza(jSONObject, "video_reward_urls");
        this.zzdkw = jSONObject.optString("transaction_id");
        this.zzdkx = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzp.zzli();
            list = zzamr.zza(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.zzdkq = list;
        this.zzdki = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.zzdks = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.zzdkm = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.zzdky = jSONObject.optString("html_template", null);
        this.zzdkz = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.zzdla = optJSONObject3 != null ? optJSONObject3.toString() : null;
        com.google.android.gms.ads.internal.zzp.zzli();
        this.zzdlb = zzamr.zza(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.zzdlc = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.zzdld = jSONObject.optString("response_type", null);
        this.zzdle = jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
