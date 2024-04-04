package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzayq implements zzayh {
    private final String zzbiq;

    public zzayq() {
        this(null);
    }

    public zzayq(String str) {
        this.zzbiq = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzayh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzel(String str) {
        try {
            try {
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                String valueOf = String.valueOf(str);
                zzaym.zzdy(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    zzwo.zzqm();
                    zzayd.zza(true, httpURLConnection, this.zzbiq);
                    zzayg zzaygVar = new zzayg();
                    zzaygVar.zza(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzaygVar.zza(httpURLConnection, responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                        sb.append("Received non-success response code ");
                        sb.append(responseCode);
                        sb.append(" from pinging URL: ");
                        sb.append(str);
                        zzaym.zzex(sb.toString());
                    }
                    if (ClientLibraryUtils.isPackageSide()) {
                        TrafficStats.clearThreadStatsTag();
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
                sb2.append("Error while pinging URL: ");
                sb2.append(str);
                sb2.append(". ");
                sb2.append(message);
                zzaym.zzex(sb2.toString());
                if (ClientLibraryUtils.isPackageSide()) {
                    return;
                }
                TrafficStats.clearThreadStatsTag();
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
                sb3.append("Error while parsing ping URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                zzaym.zzex(sb3.toString());
                if (ClientLibraryUtils.isPackageSide()) {
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (RuntimeException e3) {
                e = e3;
                String message3 = e.getMessage();
                StringBuilder sb22 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
                sb22.append("Error while pinging URL: ");
                sb22.append(str);
                sb22.append(". ");
                sb22.append(message3);
                zzaym.zzex(sb22.toString());
                if (ClientLibraryUtils.isPackageSide()) {
                }
            }
        } catch (Throwable th) {
            if (ClientLibraryUtils.isPackageSide()) {
                TrafficStats.clearThreadStatsTag();
            }
            throw th;
        }
    }
}
