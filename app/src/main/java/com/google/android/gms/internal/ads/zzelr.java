package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzelr extends zzeja<Long> implements zzelb, zzemp, RandomAccess {
    private static final zzelr zziqr;
    private int size;
    private long[] zziqs;

    public static zzelr zzbju() {
        return zziqr;
    }

    zzelr() {
        this(new long[10], 0);
    }

    private zzelr(long[] jArr, int i) {
        this.zziqs = jArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbgj();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zziqs;
        System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzelr)) {
            return super.equals(obj);
        }
        zzelr zzelrVar = (zzelr) obj;
        if (this.size != zzelrVar.size) {
            return false;
        }
        long[] jArr = zzelrVar.zziqs;
        for (int i = 0; i < this.size; i++) {
            if (this.zziqs[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzeks.zzfq(this.zziqs[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    /* renamed from: zzhi, reason: merged with bridge method [inline-methods] */
    public final zzelb zzfy(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzelr(Arrays.copyOf(this.zziqs, i), this.size);
    }

    public final long getLong(int i) {
        zzfw(i);
        return this.zziqs[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zziqs[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzfr(long j) {
        zzbgj();
        int i = this.size;
        long[] jArr = this.zziqs;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zziqs = jArr2;
        }
        long[] jArr3 = this.zziqs;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zzbgj();
        zzeks.checkNotNull(collection);
        if (!(collection instanceof zzelr)) {
            return super.addAll(collection);
        }
        zzelr zzelrVar = (zzelr) collection;
        int i = zzelrVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zziqs;
        if (i3 > jArr.length) {
            this.zziqs = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzelrVar.zziqs, 0, this.zziqs, this.size, zzelrVar.size);
        this.size = i3;
        this.modCount++;
        return true;
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

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbgj();
        zzfw(i);
        long[] jArr = this.zziqs;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzbgj();
        zzfw(i);
        long[] jArr = this.zziqs;
        long j = jArr[i];
        if (i < this.size - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        zzbgj();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfx(i));
        }
        long[] jArr = this.zziqs;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zziqs, i, jArr2, i + 1, this.size - i);
            this.zziqs = jArr2;
        }
        this.zziqs[i] = longValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzfr(((Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    static {
        zzelr zzelrVar = new zzelr(new long[0], 0);
        zziqr = zzelrVar;
        zzelrVar.zzbgi();
    }
}
