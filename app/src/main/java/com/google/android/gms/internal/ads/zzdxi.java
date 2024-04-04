package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdxi<K, V> extends zzdwv<Map.Entry<K, V>> {
    private final transient int size;
    private final transient Object[] zzhwr;
    private final transient zzdww<K, V> zzhwv;
    private final transient int zzhww = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxi(zzdww<K, V> zzdwwVar, Object[] objArr, int i, int i2) {
        this.zzhwv = zzdwwVar;
        this.zzhwr = objArr;
        this.size = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final boolean zzazo() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn
    /* renamed from: zzazj */
    public final zzdxp<Map.Entry<K, V>> iterator() {
        return (zzdxp) zzazn().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final int zza(Object[] objArr, int i) {
        return zzazn().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdwv
    final zzdws<Map.Entry<K, V>> zzazr() {
        return new zzdxh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdwn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zzhwv.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdwv, com.google.android.gms.internal.ads.zzdwn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
