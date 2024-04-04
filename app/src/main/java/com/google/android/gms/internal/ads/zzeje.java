package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeje extends zzeja<Boolean> implements zzela<Boolean>, zzemp, RandomAccess {
    private static final zzeje zzikg;
    private int size;
    private boolean[] zzikh;

    zzeje() {
        this(new boolean[10], 0);
    }

    private zzeje(boolean[] zArr, int i) {
        this.zzikh = zArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbgj();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzikh;
        System.arraycopy(zArr, i2, zArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzeje)) {
            return super.equals(obj);
        }
        zzeje zzejeVar = (zzeje) obj;
        if (this.size != zzejeVar.size) {
            return false;
        }
        boolean[] zArr = zzejeVar.zzikh;
        for (int i = 0; i < this.size; i++) {
            if (this.zzikh[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzeks.zzbs(this.zzikh[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzikh[i] == booleanValue) {
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

    public final void addBoolean(boolean z) {
        zzbgj();
        int i = this.size;
        boolean[] zArr = this.zzikh;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.zzikh = zArr2;
        }
        boolean[] zArr3 = this.zzikh;
        int i2 = this.size;
        this.size = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zzbgj();
        zzeks.checkNotNull(collection);
        if (!(collection instanceof zzeje)) {
            return super.addAll(collection);
        }
        zzeje zzejeVar = (zzeje) collection;
        int i = zzejeVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.zzikh;
        if (i3 > zArr.length) {
            this.zzikh = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(zzejeVar.zzikh, 0, this.zzikh, this.size, zzejeVar.size);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbgj();
        zzfw(i);
        boolean[] zArr = this.zzikh;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzbgj();
        zzfw(i);
        boolean[] zArr = this.zzikh;
        boolean z = zArr[i];
        if (i < this.size - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbgj();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfx(i));
        }
        boolean[] zArr = this.zzikh;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.zzikh, i, zArr2, i + 1, this.size - i);
            this.zzikh = zArr2;
        }
        this.zzikh[i] = booleanValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final /* synthetic */ zzela<Boolean> zzfy(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzeje(Arrays.copyOf(this.zzikh, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzfw(i);
        return Boolean.valueOf(this.zzikh[i]);
    }

    static {
        zzeje zzejeVar = new zzeje(new boolean[0], 0);
        zzikg = zzejeVar;
        zzejeVar.zzbgi();
    }
}
