package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzdvf<T> implements Iterator<T> {
    private int zzhtv = zzdvh.zzhty;

    @NullableDecl
    private T zzhtw;

    protected abstract T zzazd();

    /* JADX INFO: Access modifiers changed from: protected */
    @NullableDecl
    public final T zzaze() {
        this.zzhtv = zzdvh.zzhtz;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!(this.zzhtv != zzdvh.zzhua)) {
            throw new IllegalStateException();
        }
        int i = zzdve.zzhtu[this.zzhtv - 1];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        this.zzhtv = zzdvh.zzhua;
        this.zzhtw = zzazd();
        if (this.zzhtv == zzdvh.zzhtz) {
            return false;
        }
        this.zzhtv = zzdvh.zzhtx;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zzhtv = zzdvh.zzhty;
        T t = this.zzhtw;
        this.zzhtw = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
