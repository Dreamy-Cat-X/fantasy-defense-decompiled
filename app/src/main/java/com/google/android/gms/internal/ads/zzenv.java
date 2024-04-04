package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzenv extends AbstractList<String> implements zzelk, RandomAccess {
    private final zzelk zzito;

    public zzenv(zzelk zzelkVar) {
        this.zzito = zzelkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelk
    public final zzelk zzbjq() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzelk
    public final Object zzhj(int i) {
        return this.zzito.zzhj(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzito.size();
    }

    @Override // com.google.android.gms.internal.ads.zzelk
    public final void zzak(zzejg zzejgVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzenu(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzenx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzelk
    public final List<?> zzbjp() {
        return this.zzito.zzbjp();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zzito.get(i);
    }
}
