package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgn<T> {
    private final Map<String, AtomicReference<T>> zzabm = new HashMap();

    public final AtomicReference<T> zzas(String str) {
        synchronized (this) {
            if (!this.zzabm.containsKey(str)) {
                this.zzabm.put(str, new AtomicReference<>());
            }
        }
        return this.zzabm.get(str);
    }
}
