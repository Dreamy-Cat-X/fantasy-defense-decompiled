package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.kt.olleh.inapp.net.ResTags;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzayg {
    private final List<String> zzefy;
    private static Object lock = new Object();
    private static boolean zzefw = false;
    private static boolean enabled = false;
    private static Clock zzbpw = DefaultClock.getInstance();
    private static final Set<String> zzefx = new HashSet(Arrays.asList(new String[0]));

    public zzayg() {
        this(null);
    }

    public zzayg(String str) {
        List<String> asList;
        if (!isEnabled()) {
            asList = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            asList = Arrays.asList(strArr);
        }
        this.zzefy = asList;
    }

    public final void zza(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (isEnabled()) {
            zzb(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zza(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (isEnabled()) {
            zzb(str, str2, map, bArr);
        }
    }

    private final void zzb(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) {
        zza("onNetworkRequest", new zzayn(str, str2, map, bArr) { // from class: com.google.android.gms.internal.ads.zzayj
            private final String zzdhw;
            private final String zzdjy;
            private final Map zzegb;
            private final byte[] zzegc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = str;
                this.zzdhw = str2;
                this.zzegb = map;
                this.zzegc = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzayn
            public final void zzb(JsonWriter jsonWriter) {
                zzayg.zza(this.zzdjy, this.zzdhw, this.zzegb, this.zzegc, jsonWriter);
            }
        });
    }

    public final void zza(HttpURLConnection httpURLConnection, int i) {
        if (isEnabled()) {
            String str = null;
            zzb(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zzaym.zzex(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                zzet(str);
            }
        }
    }

    public final void zza(Map<String, ?> map, int i) {
        if (isEnabled()) {
            zzb(map, i);
            if (i < 200 || i >= 300) {
                zzet(null);
            }
        }
    }

    private final void zzb(final Map<String, ?> map, final int i) {
        zza("onNetworkResponse", new zzayn(i, map) { // from class: com.google.android.gms.internal.ads.zzayi
            private final int zzefz;
            private final Map zzega;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzefz = i;
                this.zzega = map;
            }

            @Override // com.google.android.gms.internal.ads.zzayn
            public final void zzb(JsonWriter jsonWriter) {
                zzayg.zza(this.zzefz, this.zzega, jsonWriter);
            }
        });
    }

    public final void zzes(String str) {
        if (isEnabled() && str != null) {
            zzi(str.getBytes());
        }
    }

    public final void zzi(final byte[] bArr) {
        zza("onNetworkResponseBody", new zzayn(bArr) { // from class: com.google.android.gms.internal.ads.zzayl
            private final byte[] zzegd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzegd = bArr;
            }

            @Override // com.google.android.gms.internal.ads.zzayn
            public final void zzb(JsonWriter jsonWriter) {
                zzayg.zza(this.zzegd, jsonWriter);
            }
        });
    }

    private final void zzet(final String str) {
        zza("onNetworkRequestError", new zzayn(str) { // from class: com.google.android.gms.internal.ads.zzayk
            private final String zzdjy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = str;
            }

            @Override // com.google.android.gms.internal.ads.zzayn
            public final void zzb(JsonWriter jsonWriter) {
                zzayg.zza(this.zzdjy, jsonWriter);
            }
        });
    }

    private static void zza(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!zzefx.contains(key)) {
                if (next.getValue() instanceof List) {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                } else if (next.getValue() instanceof String) {
                    jsonWriter.beginObject();
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    zzaym.zzev("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                    break;
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void zza(String str, zzayn zzaynVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zzbpw.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            Iterator<String> it = this.zzefy.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            zzaynVar.zzb(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzaym.zzc("unable to log", e);
        }
        zzeu(stringWriter.toString());
    }

    private static synchronized void zzeu(String str) {
        synchronized (zzayg.class) {
            zzaym.zzew("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                zzaym.zzew(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            zzaym.zzew("GMA Debug FINISH");
        }
    }

    public static void zzzx() {
        synchronized (lock) {
            zzefw = false;
            enabled = false;
            zzaym.zzex("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzar(boolean z) {
        synchronized (lock) {
            zzefw = true;
            enabled = z;
        }
    }

    public static boolean zzzy() {
        boolean z;
        synchronized (lock) {
            z = zzefw;
        }
        return z;
    }

    public static boolean isEnabled() {
        boolean z;
        synchronized (lock) {
            z = zzefw && enabled;
        }
        return z;
    }

    public static boolean zzbt(Context context) {
        if (Build.VERSION.SDK_INT < 17 || !zzacz.zzdcg.get().booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e) {
            zzaym.zzd("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String encode = Base64Utils.encode(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(encode);
        } else {
            String zzeq = zzayd.zzeq(encode);
            if (zzeq != null) {
                jsonWriter.name("bodydigest").value(zzeq);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name(ResTags.CODE).value(i);
        jsonWriter.endObject();
        zza(jsonWriter, (Map<String, ?>) map);
        jsonWriter.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zza(jsonWriter, (Map<String, ?>) map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }
}
