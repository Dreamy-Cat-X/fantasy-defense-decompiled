package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdvr {
    private final String separator;

    public static zzdvr zzhm(String str) {
        return new zzdvr(str);
    }

    private zzdvr(String str) {
        this.separator = (String) zzdwa.checkNotNull(str);
    }

    public final StringBuilder zza(StringBuilder sb, Iterator<?> it) {
        try {
            zzdwa.checkNotNull(sb);
            if (it.hasNext()) {
                sb.append(zzx(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.separator);
                    sb.append(zzx(it.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private static CharSequence zzx(Object obj) {
        zzdwa.checkNotNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
