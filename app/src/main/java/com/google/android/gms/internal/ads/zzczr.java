package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzczr {
    public final String zzgym;
    public String zzgyn;
    public Bundle zzgyo = new Bundle();

    public zzczr(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        Map<String, String> hashMap = new HashMap<>();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c = 1;
                }
            } else if (nextName.equals("params")) {
                c = 0;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                hashMap = com.google.android.gms.ads.internal.util.zzbk.zzb(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        this.zzgym = str;
        jsonReader.endObject();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzgyo.putString(entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzczr zzn(Bundle bundle) {
        try {
            this.zzgyn = com.google.android.gms.ads.internal.zzp.zzkq().zzc(bundle).toString();
        } catch (JSONException unused) {
            this.zzgyn = "{}";
        }
        return this;
    }
}
