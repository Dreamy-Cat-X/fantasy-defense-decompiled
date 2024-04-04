package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdmr {
    public final zzdmj zzera;
    public final List<zzdmi> zzhiw;
    public final List<zzdmu> zzhix;

    public static zzdmr zza(Reader reader) throws zzdmm {
        try {
            try {
                return new zzdmr(new JsonReader(reader));
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
                throw new zzdmm("unable to parse ServerResponse", e);
            }
        } finally {
            IOUtils.closeQuietly(reader);
        }
    }

    private zzdmr(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        List<zzdmi> emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzdmj zzdmjVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzdmi(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzdmjVar = new zzdmj(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    Map<String, String> map = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if (AppMeasurementSdk.ConditionalUserProperty.NAME.equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            map = com.google.android.gms.ads.internal.util.zzbk.zzb(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzdmu(str, map));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzhix = arrayList;
        this.zzhiw = emptyList;
        this.zzera = zzdmjVar == null ? new zzdmj(new JsonReader(new StringReader("{}"))) : zzdmjVar;
    }
}
