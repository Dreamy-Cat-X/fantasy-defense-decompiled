package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzenu implements ListIterator<String> {
    private final /* synthetic */ int zzhyh;
    private ListIterator<String> zzitm;
    private final /* synthetic */ zzenv zzitn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenu(zzenv zzenvVar, int i) {
        zzelk zzelkVar;
        this.zzitn = zzenvVar;
        this.zzhyh = i;
        zzelkVar = this.zzitn.zzito;
        this.zzitm = zzelkVar.listIterator(this.zzhyh);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzitm.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzitm.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzitm.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzitm.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zzitm.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.zzitm.next();
    }
}
