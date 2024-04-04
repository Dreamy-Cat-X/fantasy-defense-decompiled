package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzdxn<F, T> implements Iterator<T> {
    final Iterator<? extends F> zzhxa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxn(Iterator<? extends F> it) {
        this.zzhxa = (Iterator) zzdwa.checkNotNull(it);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzae(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzhxa.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return zzae(this.zzhxa.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzhxa.remove();
    }
}
