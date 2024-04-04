package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzemq<E> extends zzeja<E> implements RandomAccess {
    private static final zzemq<Object> zzirx;
    private int size;
    private E[] zzhwt;

    public static <E> zzemq<E> zzbkh() {
        return (zzemq<E>) zzirx;
    }

    zzemq() {
        this(new Object[10], 0);
    }

    private zzemq(E[] eArr, int i) {
        this.zzhwt = eArr;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zzbgj();
        int i = this.size;
        E[] eArr = this.zzhwt;
        if (i == eArr.length) {
            this.zzhwt = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzhwt;
        int i2 = this.size;
        this.size = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zzbgj();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfx(i));
        }
        E[] eArr = this.zzhwt;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzhwt, i, eArr2, i + 1, this.size - i);
            this.zzhwt = eArr2;
        }
        this.zzhwt[i] = e;
        this.size++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzfw(i);
        return this.zzhwt[i];
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zzbgj();
        zzfw(i);
        E[] eArr = this.zzhwt;
        E e = eArr[i];
        if (i < this.size - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzbgj();
        zzfw(i);
        E[] eArr = this.zzhwt;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    private final void zzfw(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzfx(i));
        }
    }

    private final String zzfx(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final /* synthetic */ zzela zzfy(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzemq(Arrays.copyOf(this.zzhwt, i), this.size);
    }

    static {
        zzemq<Object> zzemqVar = new zzemq<>(new Object[0], 0);
        zzirx = zzemqVar;
        zzemqVar.zzbgi();
    }
}
