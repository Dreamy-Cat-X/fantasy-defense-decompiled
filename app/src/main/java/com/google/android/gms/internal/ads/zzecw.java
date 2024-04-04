package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzecw {
    public static void zza(zzeez zzeezVar) throws GeneralSecurityException {
        zzehm.zza(zza(zzeezVar.zzbcz().zzbdm()));
        zza(zzeezVar.zzbcz().zzbdn());
        if (zzeezVar.zzbdb() == zzeet.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzebb.zza(zzeezVar.zzbda().zzbcu());
    }

    public static String zza(zzefi zzefiVar) throws NoSuchAlgorithmException {
        int i = zzecz.zzicd[zzefiVar.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(zzefiVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static zzeho zza(zzefh zzefhVar) throws GeneralSecurityException {
        int i = zzecz.zzice[zzefhVar.ordinal()];
        if (i == 1) {
            return zzeho.NIST_P256;
        }
        if (i == 2) {
            return zzeho.NIST_P384;
        }
        if (i == 3) {
            return zzeho.NIST_P521;
        }
        String valueOf = String.valueOf(zzefhVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static zzehr zza(zzeet zzeetVar) throws GeneralSecurityException {
        int i = zzecz.zzicf[zzeetVar.ordinal()];
        if (i == 1) {
            return zzehr.UNCOMPRESSED;
        }
        if (i == 2) {
            return zzehr.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i == 3) {
            return zzehr.COMPRESSED;
        }
        String valueOf = String.valueOf(zzeetVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }
}
