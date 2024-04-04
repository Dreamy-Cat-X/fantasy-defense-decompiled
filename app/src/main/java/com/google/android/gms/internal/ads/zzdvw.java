package com.google.android.gms.internal.ads;

import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdvw {
    private static final Logger logger = Logger.getLogger(zzdvw.class.getName());
    private static final zzdvx zzhui = new zza();

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static final class zza {
        private zza() {
        }
    }

    private zzdvw() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzho(@NullableDecl String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzhn(@NullableDecl String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String emptyToNull(@NullableDecl String str) {
        if (zzhn(str)) {
            return null;
        }
        return str;
    }
}
