package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdwz<F, T> extends AbstractList<T> implements Serializable, RandomAccess {
    private final List<F> zzhwl;
    final zzdvo<? super F, ? extends T> zzhwm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwz(List<F> list, zzdvo<? super F, ? extends T> zzdvoVar) {
        this.zzhwl = (List) zzdwa.checkNotNull(list);
        this.zzhwm = (zzdvo) zzdwa.checkNotNull(zzdvoVar);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.zzhwl.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.zzhwm.apply(this.zzhwl.get(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new zzdxc(this, this.zzhwl.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zzhwl.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        return this.zzhwm.apply(this.zzhwl.remove(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzhwl.size();
    }
}
