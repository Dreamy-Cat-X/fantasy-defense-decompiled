package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcol implements zzdqj<zzcok, zzcon> {
    private final Context context;
    private final String zzdtc;
    private final zzatl zzgnt;
    private final String zzgoj;
    private final int zzgok;

    public zzcol(Context context, String str, zzatl zzatlVar, String str2, int i) {
        this.context = context;
        this.zzgoj = str;
        this.zzgnt = zzatlVar;
        this.zzdtc = str2;
        this.zzgok = i;
    }

    private final zzcon zza(String str, zzata zzataVar, JSONObject jSONObject, String str2) throws zzcli {
        HttpURLConnection httpURLConnection;
        byte[] bArr;
        int responseCode;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        JSONObject jSONObject2 = jSONObject;
        try {
            int optInt = jSONObject2.optInt("http_timeout_millis", 60000);
            if (zzataVar.getErrorCode() != -2) {
                if (zzataVar.getErrorCode() == 1) {
                    if (zzataVar.zzwj() != null) {
                        com.google.android.gms.ads.internal.util.zzd.zzev(TextUtils.join(", ", zzataVar.zzwj()));
                    }
                    throw new zzcli(zzdnu.INVALID_REQUEST, "Error building request URL.");
                }
                throw new zzcli(zzdnu.INTERNAL_ERROR);
            }
            zzcon zzconVar = new zzcon();
            String valueOf = String.valueOf(this.zzgoj);
            com.google.android.gms.ads.internal.util.zzd.zzew(valueOf.length() != 0 ? "SDK version: ".concat(valueOf) : new String("SDK version: "));
            String valueOf2 = String.valueOf(str);
            com.google.android.gms.ads.internal.util.zzd.zzdy(valueOf2.length() != 0 ? "AdRequestServiceImpl: Sending request: ".concat(valueOf2) : new String("AdRequestServiceImpl: Sending request: "));
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
            int i = 0;
            while (true) {
                this.zzgnt.zzdd(this.zzgok);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                try {
                    httpURLConnection = httpURLConnection2;
                } catch (zzcli e) {
                    e = e;
                    httpURLConnection = httpURLConnection2;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                }
                try {
                    try {
                        com.google.android.gms.ads.internal.zzp.zzkq().zza(this.context, this.zzgoj, false, httpURLConnection2, false, optInt);
                        if (zzataVar.zzwn() && !TextUtils.isEmpty(str2)) {
                            httpURLConnection.addRequestProperty("Cookie", str2);
                        }
                        if (zzataVar.zzwm()) {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("pii");
                            if (optJSONObject != null) {
                                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                                    httpURLConnection.addRequestProperty("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                                }
                                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                                    httpURLConnection.addRequestProperty("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.zzd.zzeb("DSID signal does not exist.");
                            }
                        }
                        if (zzataVar == null || TextUtils.isEmpty(zzataVar.zzwl())) {
                            bArr = null;
                        } else {
                            httpURLConnection.setDoOutput(true);
                            bArr = zzataVar.zzwl().getBytes();
                            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                            try {
                                bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedOutputStream = null;
                            }
                            try {
                                bufferedOutputStream2.write(bArr);
                                IOUtils.closeQuietly(bufferedOutputStream2);
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = bufferedOutputStream2;
                                IOUtils.closeQuietly(bufferedOutputStream);
                                throw th;
                            }
                        }
                        zzayg zzaygVar = new zzayg();
                        zzaygVar.zza(httpURLConnection, bArr);
                        responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry.getKey();
                            List<String> value = entry.getValue();
                            if (hashMap.containsKey(key)) {
                                ((List) hashMap.get(key)).addAll(value);
                            } else {
                                hashMap.put(key, new ArrayList(value));
                            }
                        }
                        zzaygVar.zza(httpURLConnection, responseCode);
                        zzconVar.zzgol = responseCode;
                        zzconVar.zzal = hashMap;
                        zzconVar.zzdub = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                            } catch (Throwable th4) {
                                th = th4;
                                inputStreamReader = null;
                            }
                            try {
                                com.google.android.gms.ads.internal.zzp.zzkq();
                                String zza = com.google.android.gms.ads.internal.util.zzm.zza(inputStreamReader2);
                                IOUtils.closeQuietly(inputStreamReader2);
                                zzaygVar.zzes(zza);
                                zzconVar.zzdub = zza;
                                if (TextUtils.isEmpty(zza)) {
                                    if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcvn)).booleanValue()) {
                                        throw new zzcli(zzdnu.NO_FILL);
                                    }
                                }
                                zzconVar.zzgom = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - elapsedRealtime;
                                httpURLConnection.disconnect();
                                this.zzgnt.zzws();
                                return zzconVar;
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = inputStreamReader2;
                                IOUtils.closeQuietly(inputStreamReader);
                                throw th;
                            }
                        }
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (TextUtils.isEmpty(headerField)) {
                            com.google.android.gms.ads.internal.util.zzd.zzex("No location header to follow redirect.");
                            throw new zzcli(zzdnu.INTERNAL_ERROR, "No location header to follow redirect");
                        }
                        url = new URL(headerField);
                        int i2 = i + 1;
                        if (i2 > ((Integer) zzwo.zzqq().zzd(zzabh.zzcuo)).intValue()) {
                            com.google.android.gms.ads.internal.util.zzd.zzex("Too many redirects.");
                            throw new zzcli(zzdnu.INTERNAL_ERROR, "Too many redirects");
                        }
                        httpURLConnection.disconnect();
                        this.zzgnt.zzws();
                        jSONObject2 = jSONObject;
                        i = i2;
                    } catch (Throwable th6) {
                        th = th6;
                        httpURLConnection.disconnect();
                        this.zzgnt.zzws();
                        throw th;
                    }
                } catch (zzcli e2) {
                    e = e2;
                    if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczd)).booleanValue()) {
                        zzconVar.zzgom = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - elapsedRealtime;
                        httpURLConnection.disconnect();
                        this.zzgnt.zzws();
                        return zzconVar;
                    }
                    throw e;
                }
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("Received error HTTP response code: ");
            sb.append(responseCode);
            com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
            zzdnu zzdnuVar = zzdnu.INTERNAL_ERROR;
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Received error HTTP response code: ");
            sb2.append(responseCode);
            throw new zzcli(zzdnuVar, sb2.toString());
        } catch (IOException e3) {
            String valueOf3 = String.valueOf(e3.getMessage());
            String concat = valueOf3.length() != 0 ? "Error while connecting to ad server: ".concat(valueOf3) : new String("Error while connecting to ad server: ");
            com.google.android.gms.ads.internal.util.zzd.zzex(concat);
            throw new zzcli(zzdnu.INTERNAL_ERROR, concat, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final /* synthetic */ zzcon apply(zzcok zzcokVar) throws Exception {
        zzata zzataVar;
        zzata zzataVar2;
        JSONObject jSONObject;
        zzcok zzcokVar2 = zzcokVar;
        zzataVar = zzcokVar2.zzgod;
        String url = zzataVar.getUrl();
        zzataVar2 = zzcokVar2.zzgod;
        jSONObject = zzcokVar2.zzgoc;
        return zza(url, zzataVar2, jSONObject, this.zzdtc);
    }
}
