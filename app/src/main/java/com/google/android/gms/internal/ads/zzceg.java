package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzceg {
    private final Executor executor;
    private final zzcdw zzgft;

    public zzceg(Executor executor, zzcdw zzcdwVar) {
        this.executor = executor;
        this.zzgft = zzcdwVar;
    }

    public final zzdzl<List<zzcel>> zzg(JSONObject jSONObject, String str) {
        zzdzl zzag;
        final String optString;
        char c;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return zzdyz.zzag(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && (optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME)) != null) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    c = 1;
                } else {
                    c = "image".equals(optString2) ? (char) 2 : (char) 0;
                }
                if (c == 1) {
                    zzag = zzdyz.zzag(new zzcel(optString, optJSONObject.optString("string_value")));
                } else if (c == 2) {
                    zzag = zzdyz.zzb(this.zzgft.zzc(optJSONObject, "image_value"), new zzdvo(optString) { // from class: com.google.android.gms.internal.ads.zzcei
                        private final String zzdjy;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdjy = optString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzdvo
                        public final Object apply(Object obj) {
                            return new zzcel(this.zzdjy, (zzadv) obj);
                        }
                    }, this.executor);
                }
                arrayList.add(zzag);
            }
            zzag = zzdyz.zzag(null);
            arrayList.add(zzag);
        }
        return zzdyz.zzb(zzdyz.zzi(arrayList), zzcej.zzdyn, this.executor);
    }
}
