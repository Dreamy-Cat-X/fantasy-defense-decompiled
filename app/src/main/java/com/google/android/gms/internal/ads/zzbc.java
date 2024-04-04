package com.google.android.gms.internal.ads;

import com.kt.olleh.inapp.net.InAppError;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbc {
    public static zzn zzb(zzy zzyVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = zzyVar.zzal;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long zzg = str != null ? zzg(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = map.get("Expires");
        long zzg2 = str3 != null ? zzg(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long zzg3 = str4 != null ? zzg(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (zzg <= 0 || zzg2 < zzg) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (zzg2 - zzg);
                j3 = j4;
            }
        }
        zzn zznVar = new zzn();
        zznVar.data = zzyVar.data;
        zznVar.zzr = str5;
        zznVar.zzv = j4;
        zznVar.zzu = j3;
        zznVar.zzs = zzg;
        zznVar.zzt = zzg3;
        zznVar.zzw = map;
        zznVar.zzx = zzyVar.allHeaders;
        return zznVar;
    }

    private static long zzg(String str) {
        try {
            return zzh("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if (InAppError.SUCCESS.equals(str) || "-1".equals(str)) {
                zzaq.v("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzaq.zza(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzb(long j) {
        return zzh("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzh(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
