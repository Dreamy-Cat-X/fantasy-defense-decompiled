package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzow {
    private final Map<String, String> zzbjc = new HashMap();
    private Map<String, String> zzbjd;

    public final synchronized Map<String, String> zzis() {
        if (this.zzbjd == null) {
            this.zzbjd = Collections.unmodifiableMap(new HashMap(this.zzbjc));
        }
        return this.zzbjd;
    }
}
