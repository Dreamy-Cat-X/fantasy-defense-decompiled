package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdxb<F, T> extends AbstractSequentialList<T> implements Serializable {
    private final List<F> zzhwl;
    final zzdvo<? super F, ? extends T> zzhwm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxb(List<F> list, zzdvo<? super F, ? extends T> zzdvoVar) {
        this.zzhwl = (List) zzdwa.checkNotNull(list);
        this.zzhwm = (zzdvo) zzdwa.checkNotNull(zzdvoVar);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.zzhwl.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzhwl.size();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new zzdxe(this, this.zzhwl.listIterator(i));
    }
}
