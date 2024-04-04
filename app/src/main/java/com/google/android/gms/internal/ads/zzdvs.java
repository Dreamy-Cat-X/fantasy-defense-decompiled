package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdvs {
    private final String className;
    private final zzdvv zzhue;
    private zzdvv zzhuf;
    private boolean zzhug;

    private zzdvs(String str) {
        zzdvv zzdvvVar = new zzdvv();
        this.zzhue = zzdvvVar;
        this.zzhuf = zzdvvVar;
        this.zzhug = false;
        this.className = (String) zzdwa.checkNotNull(str);
    }

    public final zzdvs zzy(@NullableDecl Object obj) {
        zzdvv zzdvvVar = new zzdvv();
        this.zzhuf.zzhuh = zzdvvVar;
        this.zzhuf = zzdvvVar;
        zzdvvVar.value = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.className);
        sb.append('{');
        zzdvv zzdvvVar = this.zzhue.zzhuh;
        String str = "";
        while (zzdvvVar != null) {
            Object obj = zzdvvVar.value;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            zzdvvVar = zzdvvVar.zzhuh;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
