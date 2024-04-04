package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzams {
    private final long zzdle;
    public final List<zzamp> zzdlf;
    private final List<String> zzdlg;
    private final List<String> zzdlh;
    private final List<String> zzdli;
    private final List<String> zzdlj;
    private final List<String> zzdlk;
    private final boolean zzdll;
    private final String zzdlm;
    private final long zzdln;
    private final String zzdlo;
    private final int zzdlp;
    private final int zzdlq;
    private final long zzdlr;
    private final boolean zzdls;
    private final boolean zzdlt;
    private final boolean zzdlu;
    private final boolean zzdlv;
    private int zzdlw;
    private int zzdlx;
    private boolean zzdly;

    public zzams(JSONObject jSONObject) throws JSONException {
        if (com.google.android.gms.ads.internal.util.zzd.isLoggable(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            com.google.android.gms.ads.internal.util.zzd.zzeb(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzamp zzampVar = new zzamp(jSONArray.getJSONObject(i2));
                boolean z = true;
                if ("banner".equalsIgnoreCase(zzampVar.zzdld)) {
                    this.zzdly = true;
                }
                arrayList.add(zzampVar);
                if (i < 0) {
                    Iterator<String> it = zzampVar.zzdkk.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i = i2;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.zzdlw = i;
        this.zzdlx = jSONArray.length();
        this.zzdlf = Collections.unmodifiableList(arrayList);
        this.zzdlm = jSONObject.optString("qdata");
        this.zzdlq = jSONObject.optInt("fs_model_type", -1);
        this.zzdlr = jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.zzdle = optJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzp.zzli();
            this.zzdlg = zzamr.zza(optJSONObject, "click_urls");
            com.google.android.gms.ads.internal.zzp.zzli();
            this.zzdlh = zzamr.zza(optJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.zzp.zzli();
            this.zzdli = zzamr.zza(optJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.zzp.zzli();
            this.zzdlj = zzamr.zza(optJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.zzp.zzli();
            this.zzdlk = zzamr.zza(optJSONObject, "remote_ping_urls");
            this.zzdll = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1L);
            this.zzdln = optLong > 0 ? 1000 * optLong : -1L;
            zzaun zza = zzaun.zza(optJSONObject.optJSONArray("rewards"));
            if (zza == null) {
                this.zzdlo = null;
                this.zzdlp = 0;
            } else {
                this.zzdlo = zza.type;
                this.zzdlp = zza.zzdxh;
            }
            this.zzdls = optJSONObject.optBoolean("use_displayed_impression", false);
            this.zzdlt = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.zzdlu = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            this.zzdlv = optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.zzdle = -1L;
        this.zzdlg = null;
        this.zzdlh = null;
        this.zzdli = null;
        this.zzdlj = null;
        this.zzdlk = null;
        this.zzdln = -1L;
        this.zzdlo = null;
        this.zzdlp = 0;
        this.zzdls = false;
        this.zzdll = false;
        this.zzdlt = false;
        this.zzdlu = false;
        this.zzdlv = false;
    }
}
