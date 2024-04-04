package com.google.android.gms.common.internal;

import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static LibraryVersion zzb = new LibraryVersion();
    private ConcurrentHashMap<String, String> zzc = new ConcurrentHashMap<>();

    public static LibraryVersion getInstance() {
        return zzb;
    }

    protected LibraryVersion() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getVersion(String str) {
        String str2;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzc.containsKey(str)) {
            return this.zzc.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        String str3 = null;
        InputStream inputStream2 = null;
        try {
            try {
                InputStream resourceAsStream = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        str3 = properties.getProperty("version", null);
                        GmsLogger gmsLogger = zza;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str3).length());
                        sb.append(str);
                        sb.append(" version is ");
                        sb.append(str3);
                        gmsLogger.v("LibraryVersion", sb.toString());
                    } else {
                        GmsLogger gmsLogger2 = zza;
                        String valueOf = String.valueOf(str);
                        gmsLogger2.w("LibraryVersion", valueOf.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf) : new String("Failed to get app version for libraryName: "));
                    }
                    if (resourceAsStream != null) {
                        IOUtils.closeQuietly(resourceAsStream);
                    }
                } catch (IOException e) {
                    e = e;
                    str2 = null;
                    inputStream = resourceAsStream;
                    GmsLogger gmsLogger3 = zza;
                    String valueOf2 = String.valueOf(str);
                    gmsLogger3.e("LibraryVersion", valueOf2.length() != 0 ? "Failed to get app version for libraryName: ".concat(valueOf2) : new String("Failed to get app version for libraryName: "), e);
                    if (inputStream != null) {
                        IOUtils.closeQuietly(inputStream);
                    }
                    str3 = str2;
                    if (str3 == null) {
                    }
                    this.zzc.put(str, str3);
                    return str3;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = resourceAsStream;
                    if (inputStream2 != null) {
                        IOUtils.closeQuietly(inputStream2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                str2 = null;
            }
            if (str3 == null) {
                zza.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                str3 = "UNKNOWN";
            }
            this.zzc.put(str, str3);
            return str3;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
