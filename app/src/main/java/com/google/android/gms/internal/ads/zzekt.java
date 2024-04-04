package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzekt extends zzeja<Integer> implements zzekw, zzemp, RandomAccess {
    private static final zzekt zzipm;
    private int size;
    private int[] zzipn;

    public static zzekt zzbjc() {
        return zzipm;
    }

    zzekt() {
        this(new int[10], 0);
    }

    private zzekt(int[] iArr, int i) {
        this.zzipn = iArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbgj();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzipn;
        System.arraycopy(iArr, i2, iArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzekt)) {
            return super.equals(obj);
        }
        zzekt zzektVar = (zzekt) obj;
        if (this.size != zzektVar.size) {
            return false;
        }
        int[] iArr = zzektVar.zzipn;
        for (int i = 0; i < this.size; i++) {
            if (this.zzipn[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzipn[i2];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    /* renamed from: zzhg, reason: merged with bridge method [inline-methods] */
    public final zzekw zzfy(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzekt(Arrays.copyOf(this.zzipn, i), this.size);
    }

    public final int getInt(int i) {
        zzfw(i);
        return this.zzipn[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzipn[i] == intValue) {
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

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzhh(int i) {
        zzbgj();
        int i2 = this.size;
        int[] iArr = this.zzipn;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zzipn = iArr2;
        }
        int[] iArr3 = this.zzipn;
        int i3 = this.size;
        this.size = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        zzbgj();
        zzeks.checkNotNull(collection);
        if (!(collection instanceof zzekt)) {
            return super.addAll(collection);
        }
        zzekt zzektVar = (zzekt) collection;
        int i = zzektVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzipn;
        if (i3 > iArr.length) {
            this.zzipn = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(zzektVar.zzipn, 0, this.zzipn, this.size, zzektVar.size);
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
        int intValue = ((Integer) obj).intValue();
        zzbgj();
        zzfw(i);
        int[] iArr = this.zzipn;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzbgj();
        zzfw(i);
        int[] iArr = this.zzipn;
        int i2 = iArr[i];
        if (i < this.size - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zzbgj();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfx(i));
        }
        int[] iArr = this.zzipn;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zzipn, i, iArr2, i + 1, this.size - i);
            this.zzipn = iArr2;
        }
        this.zzipn[i] = intValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzhh(((Integer) obj).intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    static {
        zzekt zzektVar = new zzekt(new int[0], 0);
        zzipm = zzektVar;
        zzektVar.zzbgi();
    }
}
