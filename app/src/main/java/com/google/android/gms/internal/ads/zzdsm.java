package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdsm {
    private static final byte[] zzhqu = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    private static final byte[] zzhqv = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};
    private final byte[] zzhqs = zzhqv;
    private final byte[] zzhqt = zzhqu;

    public final boolean zzb(File file) throws GeneralSecurityException {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(zzhf(file.getAbsolutePath()).getEncoded());
        if (Arrays.equals(this.zzhqt, digest)) {
            return true;
        }
        return !"user".equals(Build.TYPE) && Arrays.equals(this.zzhqs, digest);
    }

    private static X509Certificate zzhf(String str) throws GeneralSecurityException {
        try {
            X509Certificate[][] zza = zzb.zza(str);
            if (zza.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            return zza[0][0];
        } catch (zzh e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
