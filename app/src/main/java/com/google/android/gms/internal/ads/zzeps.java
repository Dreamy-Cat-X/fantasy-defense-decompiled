package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeps<K, V> extends zzepn<K, V, V> {
    private static final zzeqd<Map<Object, Object>> zzjak = zzept.zzbb(Collections.emptyMap());

    public static <K, V> zzepu<K, V> zzih(int i) {
        return new zzepu<>(i);
    }

    private zzeps(Map<K, zzeqd<V>> map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        LinkedHashMap zzif = zzepp.zzif(zzbmp().size());
        for (Map.Entry<K, zzeqd<V>> entry : zzbmp().entrySet()) {
            zzif.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(zzif);
    }
}
