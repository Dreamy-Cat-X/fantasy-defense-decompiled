package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbar {
    public final boolean zzekk;
    public final int zzekl;
    public final int zzekm;
    public final int zzekn;
    private final String zzeko;
    public final int zzekp;
    public final int zzekq;
    public final int zzekr;
    public final int zzeks;
    public final boolean zzekt;
    public final int zzeku;

    public zzbar(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zzekk = zza(jSONObject, "aggressive_media_codec_release", zzabh.zzcms);
        this.zzekl = zzb(jSONObject, "byte_buffer_precache_limit", zzabh.zzcma);
        this.zzekm = zzb(jSONObject, "exo_cache_buffer_size", zzabh.zzcmh);
        this.zzekn = zzb(jSONObject, "exo_connect_timeout_millis", zzabh.zzclw);
        this.zzeko = zzc(jSONObject, "exo_player_version", zzabh.zzclv);
        this.zzekp = zzb(jSONObject, "exo_read_timeout_millis", zzabh.zzclx);
        this.zzekq = zzb(jSONObject, "load_check_interval_bytes", zzabh.zzcly);
        this.zzekr = zzb(jSONObject, "player_precache_limit", zzabh.zzclz);
        this.zzeks = zzb(jSONObject, "socket_receive_buffer_size", zzabh.zzcmb);
        this.zzekt = zza(jSONObject, "use_cache_data_source", zzabh.zzctl);
        this.zzeku = zzb(jSONObject, "min_retry_count", zzabh.zzcmd);
    }

    private static boolean zza(JSONObject jSONObject, String str, zzaaw<Boolean> zzaawVar) {
        return zza(jSONObject, str, ((Boolean) zzwo.zzqq().zzd(zzaawVar)).booleanValue());
    }

    private static boolean zza(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    private static int zzb(JSONObject jSONObject, String str, zzaaw<Integer> zzaawVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzwo.zzqq().zzd(zzaawVar)).intValue();
    }

    private static String zzc(JSONObject jSONObject, String str, zzaaw<String> zzaawVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) zzwo.zzqq().zzd(zzaawVar);
    }
}
