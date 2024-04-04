package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzdxq<F, T> extends zzdxn<F, T> implements ListIterator<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxq(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.zzhxa).hasPrevious();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final T previous() {
        return (T) zzae(((ListIterator) this.zzhxa).previous());
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.zzhxa).nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.zzhxa).previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        throw new UnsupportedOperationException();
    }
}
