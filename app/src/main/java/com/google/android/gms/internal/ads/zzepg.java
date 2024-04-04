package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzepg<E> extends AbstractList<E> {
    private static final zzepi zzcz = zzepi.zzn(zzepg.class);
    List<E> zzizu;
    Iterator<E> zzizv;

    public zzepg(List<E> list, Iterator<E> it) {
        this.zzizu = list;
        this.zzizv = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        if (this.zzizu.size() > i) {
            return this.zzizu.get(i);
        }
        if (this.zzizv.hasNext()) {
            this.zzizu.add(this.zzizv.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new zzepj(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        zzcz.zziq("potentially expensive size() call");
        zzcz.zziq("blowup running");
        while (this.zzizv.hasNext()) {
            this.zzizu.add(this.zzizv.next());
        }
        return this.zzizu.size();
    }
}
