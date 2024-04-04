package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdwn<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zzhvx = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@NullableDecl Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzazj, reason: merged with bridge method [inline-methods] */
    public abstract zzdxp<E> iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    @NullableDecl
    public Object[] zzazk() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzazo();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(zzhvx);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        zzdwa.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzazk = zzazk();
            if (zzazk != null) {
                return (T[]) Arrays.copyOfRange(zzazk, zzazl(), zzazm(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzazl() {
        throw new UnsupportedOperationException();
    }

    int zzazm() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public zzdws<E> zzazn() {
        return isEmpty() ? zzdws.zzazp() : zzdws.zzc(toArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        zzdxp zzdxpVar = (zzdxp) iterator();
        while (zzdxpVar.hasNext()) {
            objArr[i] = zzdxpVar.next();
            i++;
        }
        return i;
    }
}
