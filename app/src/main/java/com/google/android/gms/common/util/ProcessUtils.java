package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public class ProcessUtils {
    private static String zza;
    private static int zzb;

    private ProcessUtils() {
    }

    @Nullable
    public static String getMyProcessName() {
        if (zza == null) {
            if (zzb == 0) {
                zzb = Process.myPid();
            }
            zza = zza(zzb);
        }
        return zza;
    }

    @Nullable
    private static String zza(int i) {
        Throwable th;
        BufferedReader bufferedReader;
        String str = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = zza(sb.toString());
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            str = bufferedReader.readLine().trim();
            IOUtils.closeQuietly(bufferedReader);
        } catch (IOException unused2) {
            IOUtils.closeQuietly(bufferedReader);
            return str;
        } catch (Throwable th3) {
            th = th3;
            IOUtils.closeQuietly(bufferedReader);
            throw th;
        }
        return str;
    }

    private static BufferedReader zza(String str) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
