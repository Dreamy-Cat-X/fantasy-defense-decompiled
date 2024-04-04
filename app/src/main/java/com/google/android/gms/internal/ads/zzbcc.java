package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbcc implements zzahv<zzbaq> {
    private boolean zzenp;

    private static int zza(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            zzwo.zzqm();
            return zzayd.zze(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
            return i;
        }
    }

    private static Integer zza(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41 + String.valueOf(str2).length());
            sb.append("Video gmsg invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
            return null;
        }
    }

    private static void zza(zzbad zzbadVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzbadVar.zzdl(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.zzd.zzex(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzbadVar.zzdm(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzbadVar.zzdn(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzbadVar.zzdo(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzbadVar.zzdp(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbaq zzbaqVar, Map map) {
        int i;
        zzbaq zzbaqVar2 = zzbaqVar;
        String str = (String) map.get("action");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Action missing from video GMSG.");
            return;
        }
        if (com.google.android.gms.ads.internal.util.zzd.isLoggable(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            com.google.android.gms.ads.internal.util.zzd.zzdy(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                zzbaqVar2.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Invalid color parameter in video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str3 = (String) map.get("mimeTypes");
            if (str3 == null) {
                com.google.android.gms.ads.internal.util.zzd.zzex("No MIME types specified for decoder properties inspection.");
                zzbad.zza(zzbaqVar2, "missingMimeTypes");
                return;
            }
            HashMap hashMap = new HashMap();
            for (String str4 : str3.split(",")) {
                hashMap.put(str4, com.google.android.gms.ads.internal.util.zzca.zzep(str4.trim()));
            }
            zzbad.zza(zzbaqVar2, hashMap);
            return;
        }
        zzbaj zzaax = zzbaqVar2.zzaax();
        if (zzaax == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        if (equals || equals2) {
            Context context = zzbaqVar2.getContext();
            int zza = zza(context, map, "x", 0);
            int zza2 = zza(context, map, "y", 0);
            int zza3 = zza(context, map, "w", -1);
            int zza4 = zza(context, map, "h", -1);
            int min = Math.min(zza3, zzbaqVar2.zzabh() - zza);
            int min2 = Math.min(zza4, zzbaqVar2.zzabg() - zza2);
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused2) {
                i = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (equals && zzaax.zzaat() == null) {
                zzaax.zza(zza, zza2, min, min2, i, parseBoolean, new zzbar((String) map.get("flags")));
                zzbad zzaat = zzaax.zzaat();
                if (zzaat != null) {
                    zza(zzaat, (Map<String, String>) map);
                    return;
                }
                return;
            }
            zzaax.zze(zza, zza2, min, min2);
            return;
        }
        zzbeb zzaay = zzbaqVar2.zzaay();
        if (zzaay != null) {
            if ("timeupdate".equals(str)) {
                String str5 = (String) map.get("currentTime");
                if (str5 == null) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzaay.zze(Float.parseFloat(str5));
                    return;
                } catch (NumberFormatException unused3) {
                    String valueOf = String.valueOf(str5);
                    com.google.android.gms.ads.internal.util.zzd.zzex(valueOf.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(valueOf) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                    return;
                }
            }
            if ("skip".equals(str)) {
                zzaay.zzaeh();
                return;
            }
        }
        zzbad zzaat2 = zzaax.zzaat();
        if (zzaat2 == null) {
            zzbad.zzb(zzbaqVar2);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = zzbaqVar2.getContext();
            int zza5 = zza(context2, map, "x", 0);
            int zza6 = zza(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zza5, zza6, 0);
            zzaat2.zze(obtain);
            obtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str6 = (String) map.get("time");
            if (str6 == null) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzaat2.seekTo((int) (Float.parseFloat(str6) * 1000.0f));
                return;
            } catch (NumberFormatException unused4) {
                String valueOf2 = String.valueOf(str6);
                com.google.android.gms.ads.internal.util.zzd.zzex(valueOf2.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(valueOf2) : new String("Could not parse time parameter from currentTime video GMSG: "));
                return;
            }
        }
        if ("hide".equals(str)) {
            zzaat2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            zzaat2.zzhy();
            return;
        }
        if ("loadControl".equals(str)) {
            zza(zzaat2, (Map<String, String>) map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzaat2.zzaan();
                return;
            } else {
                zzaat2.zzaao();
                return;
            }
        }
        if ("pause".equals(str)) {
            zzaat2.pause();
            return;
        }
        if ("play".equals(str)) {
            zzaat2.play();
            return;
        }
        if ("show".equals(str)) {
            zzaat2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str7 = (String) map.get("src");
            Integer zza7 = zza((Map<String, String>) map, "periodicReportIntervalMs");
            String[] strArr = {str7};
            String str8 = (String) map.get("demuxed");
            if (str8 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str8);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        strArr2[i2] = jSONArray.getString(i2);
                    }
                    strArr = strArr2;
                } catch (JSONException unused5) {
                    String valueOf3 = String.valueOf(str8);
                    com.google.android.gms.ads.internal.util.zzd.zzex(valueOf3.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(valueOf3) : new String("Malformed demuxed URL list for playback: "));
                    strArr = new String[]{str7};
                }
            }
            if (zza7 != null) {
                zzbaqVar2.zzdq(zza7.intValue());
            }
            zzaat2.zzc(str7, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = zzbaqVar2.getContext();
            zzaat2.zza(zza(context3, map, "dx", 0), zza(context3, map, "dy", 0));
            if (this.zzenp) {
                return;
            }
            zzbaqVar2.zzwa();
            this.zzenp = true;
            return;
        }
        if ("volume".equals(str)) {
            String str9 = (String) map.get("volume");
            if (str9 == null) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzaat2.setVolume(Float.parseFloat(str9));
                return;
            } catch (NumberFormatException unused6) {
                String valueOf4 = String.valueOf(str9);
                com.google.android.gms.ads.internal.util.zzd.zzex(valueOf4.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(valueOf4) : new String("Could not parse volume parameter from volume video GMSG: "));
                return;
            }
        }
        if ("watermark".equals(str)) {
            zzaat2.zzaap();
        } else {
            String valueOf5 = String.valueOf(str);
            com.google.android.gms.ads.internal.util.zzd.zzex(valueOf5.length() != 0 ? "Unknown video action: ".concat(valueOf5) : new String("Unknown video action: "));
        }
    }
}
