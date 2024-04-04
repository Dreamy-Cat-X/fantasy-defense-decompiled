package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdml implements com.google.android.gms.ads.internal.util.zzbl {
    public final String zzdrb;
    public final String zzdrd;
    public final JSONObject zzgam;
    private final JSONObject zzhiq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdml(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbk.zzc(jsonReader);
        this.zzhiq = zzc;
        this.zzdrd = zzc.optString("ad_html", null);
        this.zzdrb = this.zzhiq.optString("ad_base_url", null);
        this.zzgam = this.zzhiq.optJSONObject("ad_json");
    }

    @Override // com.google.android.gms.ads.internal.util.zzbl
    public final void zza(JsonWriter jsonWriter) throws IOException {
        com.google.android.gms.ads.internal.util.zzbk.zza(jsonWriter, this.zzhiq);
    }
}
