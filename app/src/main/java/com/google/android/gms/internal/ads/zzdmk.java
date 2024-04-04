package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.kt.olleh.inapp.net.ResTags;
import java.io.IOException;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdmk {
    private int code;
    private String description;

    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdmk(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        jsonReader.beginObject();
        int i = 3;
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals(ResTags.CODE)) {
                    c = 0;
                }
            } else if (nextName.equals("description")) {
                c = 1;
            }
            if (c == 0) {
                i = jsonReader.nextInt();
            } else if (c == 1) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.code = i;
        this.description = str;
    }
}
