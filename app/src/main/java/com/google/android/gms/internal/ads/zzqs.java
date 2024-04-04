package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqs {
    private final String zzbrc;
    private final JSONObject zzbrd;
    private final String zzbre;
    private final String zzbrf;
    private final boolean zzbrg = false;
    private final boolean zzbrh;

    public zzqs(String str, zzayt zzaytVar, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        this.zzbrf = zzaytVar.zzbrf;
        this.zzbrd = jSONObject;
        this.zzbre = str;
        this.zzbrc = str2;
        this.zzbrh = z2;
    }

    public final String zzlu() {
        return this.zzbrc;
    }

    public final String zzlv() {
        return this.zzbrf;
    }

    public final JSONObject zzlw() {
        return this.zzbrd;
    }

    public final String getUniqueId() {
        return this.zzbre;
    }

    public final boolean isNative() {
        return this.zzbrh;
    }
}
