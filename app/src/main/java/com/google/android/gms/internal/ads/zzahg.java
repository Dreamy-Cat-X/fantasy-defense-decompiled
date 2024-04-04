package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzahg {
    public static final zzahv<zzbdh> zzdfz = zzahf.zzdfy;
    public static final zzahv<zzbdh> zzdga = zzahi.zzdfy;
    public static final zzahv<zzbdh> zzdgb = zzahh.zzdfy;
    public static final zzahv<zzbdh> zzdgc = zzahk.zzdfy;
    public static final zzahv<zzbdh> zzdgd = new zzahl();
    public static final zzahv<zzbdh> zzdge = new zzahn();
    public static final zzahv<zzbdh> zzdgf = zzahj.zzdfy;
    public static final zzahv<Object> zzdgg = new zzahq();
    public static final zzahv<zzbdh> zzdgh = new zzahp();
    public static final zzahv<zzbdh> zzdgi = zzahm.zzdfy;
    public static final zzahv<zzbdh> zzdgj = new zzahs();
    public static final zzahv<zzbdh> zzdgk = new zzahr();
    public static final zzahv<zzbaq> zzdgl = new zzbcc();
    public static final zzahv<zzbaq> zzdgm = new zzbcf();
    public static final zzahv<zzbdh> zzdgn = new zzahd();
    public static final zzaib zzdgo = new zzaib();
    public static final zzahv<zzbdh> zzdgp = new zzahu();
    public static final zzahv<zzbdh> zzdgq = new zzaht();
    public static final zzahv<zzbdh> zzdgr = new zzahw();
    public static final zzahv<zzbdh> zzdgs = new zzaho();

    public static <T extends zzbej & zzbeo & zzbeq> String zza(T t, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzef zzadl = t.zzadl();
            if (zzadl != null && zzadl.zzb(parse)) {
                parse = zzadl.zza(parse, t.getContext(), t.getView(), t.zzaba());
            }
        } catch (zzei unused) {
            String valueOf = String.valueOf(str);
            com.google.android.gms.ads.internal.util.zzd.zzex(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        return zzawy.zzb(parse, t.getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzbeo zzbeoVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzef zzadl = zzbeoVar.zzadl();
            if (zzadl != null) {
                zzadl.zzca().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Could not parse touch parameters from gmsg.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzbej zzbejVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("URL missing from httpTrack GMSG.");
        } else {
            new com.google.android.gms.ads.internal.util.zzbp(zzbejVar.getContext(), ((zzber) zzbejVar).zzabf().zzbrf, str).zzyc();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void zza(zzbcw zzbcwVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("URL missing from click GMSG.");
        } else {
            new com.google.android.gms.ads.internal.util.zzbp(((zzbej) zzbcwVar).getContext(), ((zzber) zzbcwVar).zzabf().zzbrf, zza(zzbcwVar, str)).zzyc();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzb(zzbej zzbejVar, Map map) {
        PackageManager packageManager = zzbejVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                String valueOf = String.valueOf(optString7);
                                com.google.android.gms.ads.internal.util.zzd.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                            }
                        }
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                        } catch (JSONException e2) {
                            com.google.android.gms.ads.internal.util.zzd.zzc("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        com.google.android.gms.ads.internal.util.zzd.zzc("Error parsing the intent data.", e3);
                    }
                }
                ((zzajx) zzbejVar).zza("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzajx) zzbejVar).zza("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzajx) zzbejVar).zza("openableIntents", new JSONObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzc(zzbej zzbejVar, Map map) {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcyz)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzd.zzex("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzbejVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        String valueOf2 = String.valueOf(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(valueOf2).length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(valueOf2);
        com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
        ((zzajx) zzbejVar).zza("openableApp", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzd(zzbej zzbejVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzd.zzex("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzbejVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zzajx) zzbejVar).zza("openableURLs", hashMap);
    }
}
