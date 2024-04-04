package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX WARN: Incorrect field signature: TK; */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeni<K, V> implements Comparable<zzeni>, Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ zzend zzitc;
    private final Comparable zzitg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeni(zzend zzendVar, Map.Entry<K, V> entry) {
        this(zzendVar, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zzeni(zzend zzendVar, K k, V v) {
        this.zzitc = zzendVar;
        this.zzitg = k;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.zzitc.zzbkw();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.zzitg, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzitg;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.value;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzitg);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzitg;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzeni zzeniVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzeniVar.getKey());
    }
}
