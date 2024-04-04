package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdmj {
    public final int responseCode;
    public final String zzbvf;
    public final List<String> zzdlj;
    public final String zzdvd;
    public final boolean zzecf;
    public final long zzgom;
    public final int zzhio;
    public final zzdmk zzhip;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdmj(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        long j = 0;
        zzdmk zzdmkVar = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczc)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzdmkVar = new zzdmk(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.zzdlj = emptyList;
        this.zzhio = i;
        this.zzbvf = str;
        this.zzdvd = str2;
        this.responseCode = i2;
        this.zzgom = j;
        this.zzhip = zzdmkVar;
        this.zzecf = z;
    }
}
