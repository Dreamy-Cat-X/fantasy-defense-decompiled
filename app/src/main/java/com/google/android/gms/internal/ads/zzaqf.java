package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzaqf {
    private final zzbdh zzdhu;
    private final String zzdox;

    public zzaqf(zzbdh zzbdhVar) {
        this(zzbdhVar, "");
    }

    public zzaqf(zzbdh zzbdhVar, String str) {
        this.zzdhu = zzbdhVar;
        this.zzdox = str;
    }

    public final void zzds(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzdox);
            if (this.zzdhu != null) {
                this.zzdhu.zza("onError", put);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzdt(String str) {
        try {
            this.zzdhu.zza("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zza(int i, int i2, int i3, int i4) {
        try {
            this.zzdhu.zza("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        try {
            this.zzdhu.zza("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzdu(String str) {
        try {
            this.zzdhu.zza("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Error occurred while dispatching state change.", e);
        }
    }

    public final void zza(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zzdhu.zza("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Error occurred while obtaining screen information.", e);
        }
    }
}
