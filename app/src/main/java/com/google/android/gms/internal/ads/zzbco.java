package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbco implements zzahv<zzbaq> {
    private static Integer zza(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbaq zzbaqVar, Map map) {
        zzbcj zzbcjVar;
        zzbaq zzbaqVar2 = zzbaqVar;
        if (com.google.android.gms.ads.internal.util.zzd.isLoggable(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zzd.zzdy(sb.toString());
        }
        com.google.android.gms.ads.internal.zzp.zzlm();
        if (map.containsKey("abort")) {
            if (zzbcg.zzc(zzbaqVar2)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zzd.zzex("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zza = zza((Map<String, String>) map, "periodicReportIntervalMs");
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    String valueOf2 = String.valueOf(str2);
                    com.google.android.gms.ads.internal.util.zzd.zzex(valueOf2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(valueOf2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (zzbcg.zzd(zzbaqVar2) != null) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Precache task is already running.");
                return;
            }
            if (zzbaqVar2.zzabb() == null) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Precache requires a dependency provider.");
                return;
            }
            zzbar zzbarVar = new zzbar((String) map.get("flags"));
            Integer zza2 = zza((Map<String, String>) map, "player");
            if (zza2 == null) {
                zza2 = 0;
            }
            if (zza != null) {
                zzbaqVar2.zzdq(zza.intValue());
            }
            zzbcjVar = zzbaqVar2.zzabb().zzboh.zza(zzbaqVar2, zza2.intValue(), null, zzbarVar);
            new zzbce(zzbaqVar2, zzbcjVar, str, strArr).zzyc();
        } else {
            zzbce zzd = zzbcg.zzd(zzbaqVar2);
            if (zzd != null) {
                zzbcjVar = zzd.zzenr;
            } else {
                com.google.android.gms.ads.internal.util.zzd.zzex("Precache must specify a source.");
                return;
            }
        }
        Integer zza3 = zza((Map<String, String>) map, "minBufferMs");
        if (zza3 != null) {
            zzbcjVar.zzdl(zza3.intValue());
        }
        Integer zza4 = zza((Map<String, String>) map, "maxBufferMs");
        if (zza4 != null) {
            zzbcjVar.zzdm(zza4.intValue());
        }
        Integer zza5 = zza((Map<String, String>) map, "bufferForPlaybackMs");
        if (zza5 != null) {
            zzbcjVar.zzdn(zza5.intValue());
        }
        Integer zza6 = zza((Map<String, String>) map, "bufferForPlaybackAfterRebufferMs");
        if (zza6 != null) {
            zzbcjVar.zzdo(zza6.intValue());
        }
    }
}
