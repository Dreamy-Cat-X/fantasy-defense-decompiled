package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcbp extends zzcbm {
    private final boolean zzdlt;
    private final boolean zzdlu;
    private final boolean zzdvb;
    private final JSONObject zzgdc;
    private final boolean zzgdd;

    public zzcbp(zzdmi zzdmiVar, JSONObject jSONObject) {
        super(zzdmiVar);
        this.zzgdc = com.google.android.gms.ads.internal.util.zzbk.zza(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.zzdlu = com.google.android.gms.ads.internal.util.zzbk.zza(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzdlt = com.google.android.gms.ads.internal.util.zzbk.zza(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zzdvb = com.google.android.gms.ads.internal.util.zzbk.zza(false, jSONObject, "enable_omid");
        if (jSONObject != null && jSONObject.optJSONObject("overlay") != null) {
            z = true;
        }
        this.zzgdd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final JSONObject zzaod() {
        JSONObject jSONObject = this.zzgdc;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zzgdb.zzdul);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final boolean zzaoe() {
        return this.zzgdd;
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final boolean zzaof() {
        return this.zzdlu;
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final boolean zzano() {
        return this.zzdvb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final boolean zzaog() {
        return this.zzdlt;
    }
}
