package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdxk<K> extends zzdwv<K> {
    private final transient zzdws<K> zzhwc;
    private final transient zzdww<K, ?> zzhwv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxk(zzdww<K, ?> zzdwwVar, zzdws<K> zzdwsVar) {
        this.zzhwv = zzdwwVar;
        this.zzhwc = zzdwsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final boolean zzazo() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn
    /* renamed from: zzazj */
    public final zzdxp<K> iterator() {
        return (zzdxp) zzazn().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final int zza(Object[] objArr, int i) {
        return zzazn().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdwv, com.google.android.gms.internal.ads.zzdwn
    public final zzdws<K> zzazn() {
        return this.zzhwc;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.zzhwv.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzhwv.size();
    }

    @Override // com.google.android.gms.internal.ads.zzdwv, com.google.android.gms.internal.ads.zzdwn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
