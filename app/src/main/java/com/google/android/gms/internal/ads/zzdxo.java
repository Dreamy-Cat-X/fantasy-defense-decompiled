package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdxo<E> extends zzdwv<E> {
    private final transient E zzhxb;
    private transient int zzhxc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxo(E e) {
        this.zzhxb = (E) zzdwa.checkNotNull(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final boolean zzazo() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxo(E e, int i) {
        this.zzhxb = e;
        this.zzhxc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zzhxb.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdwn
    /* renamed from: zzazj */
    public final zzdxp<E> iterator() {
        return new zzdwx(this.zzhxb);
    }

    @Override // com.google.android.gms.internal.ads.zzdwv
    final zzdws<E> zzazr() {
        return zzdws.zzac(this.zzhxb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zzhxb;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdwv, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.zzhxc;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zzhxb.hashCode();
        this.zzhxc = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzdwv
    final boolean zzazq() {
        return this.zzhxc != 0;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zzhxb.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdwv, com.google.android.gms.internal.ads.zzdwn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
