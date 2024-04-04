package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzepn<K, V, V2> implements zzepq<Map<K, V2>> {
    private final Map<K, zzeqd<V>> zzjag;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepn(Map<K, zzeqd<V>> map) {
        this.zzjag = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, zzeqd<V>> zzbmp() {
        return this.zzjag;
    }
}
