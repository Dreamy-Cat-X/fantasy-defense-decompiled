package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzend<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzima;
    private final int zzisw;
    private List<zzeni> zzisx;
    private Map<K, V> zzisy;
    private volatile zzenk zzisz;
    private Map<K, V> zzita;
    private volatile zzene zzitb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzekl<FieldDescriptorType>> zzend<FieldDescriptorType, Object> zzht(int i) {
        return new zzenc(i);
    }

    private zzend(int i) {
        this.zzisw = i;
        this.zzisx = Collections.emptyList();
        this.zzisy = Collections.emptyMap();
        this.zzita = Collections.emptyMap();
    }

    public void zzbgi() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzima) {
            return;
        }
        if (this.zzisy.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzisy);
        }
        this.zzisy = unmodifiableMap;
        if (this.zzita.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzita);
        }
        this.zzita = unmodifiableMap2;
        this.zzima = true;
    }

    public final boolean isImmutable() {
        return this.zzima;
    }

    public final int zzbkt() {
        return this.zzisx.size();
    }

    public final Map.Entry<K, V> zzhu(int i) {
        return this.zzisx.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzbku() {
        if (this.zzisy.isEmpty()) {
            return zzenh.zzbkz();
        }
        return this.zzisy.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzisx.size() + this.zzisy.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzend<K, V>) comparable) >= 0 || this.zzisy.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzend<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zzisx.get(zza).getValue();
        }
        return this.zzisy.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k, V v) {
        zzbkw();
        int zza = zza((zzend<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzisx.get(zza).setValue(v);
        }
        zzbkw();
        if (this.zzisx.isEmpty() && !(this.zzisx instanceof ArrayList)) {
            this.zzisx = new ArrayList(this.zzisw);
        }
        int i = -(zza + 1);
        if (i >= this.zzisw) {
            return zzbkx().put(k, v);
        }
        int size = this.zzisx.size();
        int i2 = this.zzisw;
        if (size == i2) {
            zzeni remove = this.zzisx.remove(i2 - 1);
            zzbkx().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.zzisx.add(i, new zzeni(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzbkw();
        if (!this.zzisx.isEmpty()) {
            this.zzisx.clear();
        }
        if (this.zzisy.isEmpty()) {
            return;
        }
        this.zzisy.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzbkw();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzend<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzhv(zza);
        }
        if (this.zzisy.isEmpty()) {
            return null;
        }
        return this.zzisy.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzhv(int i) {
        zzbkw();
        V v = (V) this.zzisx.remove(i).getValue();
        if (!this.zzisy.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzbkx().entrySet().iterator();
            this.zzisx.add(new zzeni(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int size = this.zzisx.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzisx.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzisx.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzisz == null) {
            this.zzisz = new zzenk(this, null);
        }
        return this.zzisz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzbkv() {
        if (this.zzitb == null) {
            this.zzitb = new zzene(this, null);
        }
        return this.zzitb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbkw() {
        if (this.zzima) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzbkx() {
        zzbkw();
        if (this.zzisy.isEmpty() && !(this.zzisy instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzisy = treeMap;
            this.zzita = treeMap.descendingMap();
        }
        return (SortedMap) this.zzisy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzend)) {
            return super.equals(obj);
        }
        zzend zzendVar = (zzend) obj;
        int size = size();
        if (size != zzendVar.size()) {
            return false;
        }
        int zzbkt = zzbkt();
        if (zzbkt != zzendVar.zzbkt()) {
            return entrySet().equals(zzendVar.entrySet());
        }
        for (int i = 0; i < zzbkt; i++) {
            if (!zzhu(i).equals(zzendVar.zzhu(i))) {
                return false;
            }
        }
        if (zzbkt != size) {
            return this.zzisy.equals(zzendVar.zzisy);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzbkt = zzbkt();
        int i = 0;
        for (int i2 = 0; i2 < zzbkt; i2++) {
            i += this.zzisx.get(i2).hashCode();
        }
        return this.zzisy.size() > 0 ? i + this.zzisy.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzend<K, V>) obj, (Comparable) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzend(int i, zzenc zzencVar) {
        this(i);
    }
}
