package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdug {
    public static File zza(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(zza(str, file), str2);
    }

    public static boolean zza(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            IOUtils.closeQuietly(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            IOUtils.closeQuietly(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            IOUtils.closeQuietly(fileOutputStream2);
            throw th;
        }
    }

    public static File zza(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return zza(new File(file, str), false);
    }

    public static File zza(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean zze(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            z = true;
            for (int i = 0; i < length; i++) {
                File file2 = listFiles[i];
                z = file2 != null && zze(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    public static byte[] zzf(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] byteArray = zzejg.zzf(fileInputStream).toByteArray();
                IOUtils.closeQuietly(fileInputStream);
                return byteArray;
            } catch (IOException unused) {
                IOUtils.closeQuietly(fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                IOUtils.closeQuietly(fileInputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
