package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzelx<K, V> extends LinkedHashMap<K, V> {
    private static final zzelx zziqx;
    private boolean zzijy;

    private zzelx() {
        this.zzijy = true;
    }

    private zzelx(Map<K, V> map) {
        super(map);
        this.zzijy = true;
    }

    public static <K, V> zzelx<K, V> zzbjv() {
        return zziqx;
    }

    public final void zza(zzelx<K, V> zzelxVar) {
        zzbjx();
        if (zzelxVar.isEmpty()) {
            return;
        }
        putAll(zzelxVar);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzbjx();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zzbjx();
        zzeks.checkNotNull(k);
        zzeks.checkNotNull(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zzbjx();
        for (K k : map.keySet()) {
            zzeks.checkNotNull(k);
            zzeks.checkNotNull(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zzbjx();
        return (V) super.remove(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                equals = value.equals(obj2);
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
            z = true;
            if (!z) {
            }
        }
        return false;
    }

    private static int zzat(Object obj) {
        if (obj instanceof byte[]) {
            return zzeks.hashCode((byte[]) obj);
        }
        if (obj instanceof zzekv) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += zzat(entry.getValue()) ^ zzat(entry.getKey());
        }
        return i;
    }

    public final zzelx<K, V> zzbjw() {
        return isEmpty() ? new zzelx<>() : new zzelx<>(this);
    }

    public final void zzbgi() {
        this.zzijy = false;
    }

    public final boolean isMutable() {
        return this.zzijy;
    }

    private final void zzbjx() {
        if (!this.zzijy) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        zzelx zzelxVar = new zzelx();
        zziqx = zzelxVar;
        zzelxVar.zzijy = false;
    }
}
