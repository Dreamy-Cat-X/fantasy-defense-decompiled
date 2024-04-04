package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzckj {
    private final Clock zzbpw;

    public zzckj(Clock clock) {
        this.zzbpw = clock;
    }

    public final void zza(List<Object> list, String str, String str2, Object... objArr) {
        if (zzadd.zzdda.get().booleanValue()) {
            long currentTimeMillis = this.zzbpw.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(currentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str2);
                jsonWriter.name("components").beginArray();
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("unable to log", e);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            com.google.android.gms.ads.internal.util.zzd.zzew(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
        }
    }
}
