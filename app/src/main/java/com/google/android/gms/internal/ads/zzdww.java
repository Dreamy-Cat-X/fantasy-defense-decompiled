package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdww<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zzhwe = new Map.Entry[0];
    private transient zzdwv<Map.Entry<K, V>> zzhwf;
    private transient zzdwv<K> zzhwg;
    private transient zzdwn<V> zzhwh;

    public static <K, V> zzdww<K, V> zzc(K k, V v) {
        zzdwm.zzb(k, v);
        return zzdxf.zzc(1, new Object[]{k, v});
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    abstract zzdwv<Map.Entry<K, V>> zzazs();

    abstract zzdwv<K> zzazt();

    abstract zzdwn<V> zzazu();

    public static <K, V> zzdww<K, V> zza(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        zzdwm.zzb(k, v);
        zzdwm.zzb(k2, v2);
        zzdwm.zzb(k3, v3);
        zzdwm.zzb(k4, v4);
        zzdwm.zzb(k5, v5);
        return zzdxf.zzc(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return ((zzdwn) values()).contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzdxl.zzg((zzdwv) entrySet());
    }

    public String toString() {
        int size = size();
        zzdwm.zzh(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzdwv<Map.Entry<K, V>> zzdwvVar = this.zzhwf;
        if (zzdwvVar != null) {
            return zzdwvVar;
        }
        zzdwv<Map.Entry<K, V>> zzazs = zzazs();
        this.zzhwf = zzazs;
        return zzazs;
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzdwn<V> zzdwnVar = this.zzhwh;
        if (zzdwnVar != null) {
            return zzdwnVar;
        }
        zzdwn<V> zzazu = zzazu();
        this.zzhwh = zzazu;
        return zzazu;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzdwv<K> zzdwvVar = this.zzhwg;
        if (zzdwvVar != null) {
            return zzdwvVar;
        }
        zzdwv<K> zzazt = zzazt();
        this.zzhwg = zzazt;
        return zzazt;
    }
}
