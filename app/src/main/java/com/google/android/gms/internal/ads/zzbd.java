package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbd extends zzar {
    private final zzbf zzcs;
    private final SSLSocketFactory zzct;

    public zzbd() {
        this(null);
    }

    private zzbd(zzbf zzbfVar) {
        this(null, null);
    }

    private zzbd(zzbf zzbfVar, SSLSocketFactory sSLSocketFactory) {
        this.zzcs = null;
        this.zzct = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0062. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[Catch: all -> 0x00fd, TryCatch #1 {all -> 0x00fd, blocks: (B:3:0x0040, B:4:0x0048, B:6:0x004e, B:8:0x005e, B:9:0x0062, B:10:0x0065, B:11:0x00f7, B:12:0x00fc, B:14:0x0069, B:15:0x0072, B:16:0x0078, B:17:0x007e, B:18:0x0084, B:19:0x008a, B:20:0x0093, B:21:0x009c, B:22:0x00a1, B:24:0x00a8, B:36:0x00c4, B:49:0x00ef, B:50:0x00f6), top: B:2:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef A[Catch: all -> 0x00fd, TRY_ENTER, TryCatch #1 {all -> 0x00fd, blocks: (B:3:0x0040, B:4:0x0048, B:6:0x004e, B:8:0x005e, B:9:0x0062, B:10:0x0065, B:11:0x00f7, B:12:0x00fc, B:14:0x0069, B:15:0x0072, B:16:0x0078, B:17:0x007e, B:18:0x0084, B:19:0x008a, B:20:0x0093, B:21:0x009c, B:22:0x00a1, B:24:0x00a8, B:36:0x00c4, B:49:0x00ef, B:50:0x00f6), top: B:2:0x0040 }] */
    @Override // com.google.android.gms.internal.ads.zzar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbb zza(zzaa<?> zzaaVar, Map<String, String> map) throws IOException, zzl {
        int responseCode;
        String url = zzaaVar.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzaaVar.getHeaders());
        URL url2 = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzi = zzaaVar.zzi();
        httpURLConnection.setConnectTimeout(zzi);
        httpURLConnection.setReadTimeout(zzi);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url2.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            switch (zzaaVar.getMethod()) {
                case -1:
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                    }
                    if (!((zzaaVar.getMethod() == 4 || (100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) ? false : true)) {
                        zzbb zzbbVar = new zzbb(responseCode, zza(httpURLConnection.getHeaderFields()));
                        httpURLConnection.disconnect();
                        return zzbbVar;
                    }
                    try {
                        return new zzbb(responseCode, zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzbg(httpURLConnection));
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                case 0:
                    httpURLConnection.setRequestMethod("GET");
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 1:
                    httpURLConnection.setRequestMethod("POST");
                    zza(httpURLConnection, zzaaVar);
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 2:
                    httpURLConnection.setRequestMethod("PUT");
                    zza(httpURLConnection, zzaaVar);
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 3:
                    httpURLConnection.setRequestMethod("DELETE");
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 4:
                    httpURLConnection.setRequestMethod("HEAD");
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 5:
                    httpURLConnection.setRequestMethod("OPTIONS");
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 6:
                    httpURLConnection.setRequestMethod("TRACE");
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                case 7:
                    httpURLConnection.setRequestMethod("PATCH");
                    zza(httpURLConnection, zzaaVar);
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static List<zzu> zza(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzu(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream zza(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static void zza(HttpURLConnection httpURLConnection, zzaa<?> zzaaVar) throws IOException, zzl {
        byte[] zzg = zzaaVar.zzg();
        if (zzg != null) {
            httpURLConnection.setDoOutput(true);
            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                httpURLConnection.setRequestProperty("Content-Type", "UTF-8".length() != 0 ? "application/x-www-form-urlencoded; charset=".concat("UTF-8") : new String("application/x-www-form-urlencoded; charset="));
            }
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(zzg);
            dataOutputStream.close();
        }
    }
}
