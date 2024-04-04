package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdxh<K, V> extends zzdws<Map.Entry<K, V>> {
    private final /* synthetic */ zzdxi zzhwu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxh(zzdxi zzdxiVar) {
        this.zzhwu = zzdxiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn
    public final boolean zzazo() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zzhwu.size;
        return i;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zzhwu.size;
        zzdwa.zzt(i, i2);
        objArr = this.zzhwu.zzhwr;
        int i3 = i * 2;
        Object obj = objArr[i3];
        objArr2 = this.zzhwu.zzhwr;
        return new AbstractMap.SimpleImmutableEntry(obj, objArr2[i3 + 1]);
    }
}
