package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaqb {
    private final boolean zzdos;
    private final boolean zzdot;
    private final boolean zzdou;
    private final boolean zzdov;
    private final boolean zzdow;

    private zzaqb(zzaqd zzaqdVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        z = zzaqdVar.zzdos;
        this.zzdos = z;
        z2 = zzaqdVar.zzdot;
        this.zzdot = z2;
        z3 = zzaqdVar.zzdou;
        this.zzdou = z3;
        z4 = zzaqdVar.zzdov;
        this.zzdov = z4;
        z5 = zzaqdVar.zzdow;
        this.zzdow = z5;
    }

    public final JSONObject zzdq() {
        try {
            return new JSONObject().put("sms", this.zzdos).put("tel", this.zzdot).put("calendar", this.zzdou).put("storePicture", this.zzdov).put("inlineVideo", this.zzdow);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
