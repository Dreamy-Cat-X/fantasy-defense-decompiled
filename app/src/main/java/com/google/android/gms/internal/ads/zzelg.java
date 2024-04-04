package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzelg<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzele> zziqe;

    private zzelg(Map.Entry<K, zzele> entry) {
        this.zziqe = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zziqe.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zziqe.getValue() == null) {
            return null;
        }
        return zzele.zzbjm();
    }

    public final zzele zzbjo() {
        return this.zziqe.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzemd)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.zziqe.getValue().zzn((zzemd) obj);
    }
}
