package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpi {
    public static boolean zzbc(String str) {
        return "audio".equals(zzbe(str));
    }

    public static boolean zzbd(String str) {
        return "video".equals(zzbe(str));
    }

    private static String zzbe(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid mime type: ".concat(valueOf) : new String("Invalid mime type: "));
        }
        return str.substring(0, indexOf);
    }
}
