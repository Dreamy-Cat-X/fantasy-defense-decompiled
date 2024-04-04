package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final /* synthetic */ class zzajz {
    public static void zza(zzaka zzakaVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzakaVar.zzi(str, jSONObject.toString());
    }

    public static void zza(zzaka zzakaVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzakaVar.zzcv(sb.toString());
    }

    public static void zzb(zzaka zzakaVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        com.google.android.gms.ads.internal.util.zzd.zzdy(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzakaVar.zzcv(sb.toString());
    }

    public static void zza(zzaka zzakaVar, String str, Map map) {
        try {
            zzakaVar.zza(str, com.google.android.gms.ads.internal.zzp.zzkq().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Could not convert parameters to JSON.");
        }
    }
}
