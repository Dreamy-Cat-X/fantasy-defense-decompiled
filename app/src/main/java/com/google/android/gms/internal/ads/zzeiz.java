package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeiz {
    private static final Class<?> zzika = zzhz("libcore.io.Memory");
    private static final boolean zzikb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbgf() {
        return (zzika == null || zzikb) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> zzbgg() {
        return zzika;
    }

    private static <T> Class<T> zzhz(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        zzikb = zzhz("org.robolectric.Robolectric") != null;
    }
}
