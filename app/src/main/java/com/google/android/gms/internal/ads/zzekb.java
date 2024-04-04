package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzekb extends zzeja<Double> implements zzela<Double>, zzemp, RandomAccess {
    private static final zzekb zzilo;
    private int size;
    private double[] zzilp;

    zzekb() {
        this(new double[10], 0);
    }

    private zzekb(double[] dArr, int i) {
        this.zzilp = dArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbgj();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzilp;
        System.arraycopy(dArr, i2, dArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzekb)) {
            return super.equals(obj);
        }
        zzekb zzekbVar = (zzekb) obj;
        if (this.size != zzekbVar.size) {
            return false;
        }
        double[] dArr = zzekbVar.zzilp;
        for (int i = 0; i < this.size; i++) {
            if (Double.doubleToLongBits(this.zzilp[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzeks.zzfq(Double.doubleToLongBits(this.zzilp[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzilp[i] == doubleValue) {
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

    public final void zze(double d) {
        zzbgj();
        int i = this.size;
        double[] dArr = this.zzilp;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzilp = dArr2;
        }
        double[] dArr3 = this.zzilp;
        int i2 = this.size;
        this.size = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zzbgj();
        zzeks.checkNotNull(collection);
        if (!(collection instanceof zzekb)) {
            return super.addAll(collection);
        }
        zzekb zzekbVar = (zzekb) collection;
        int i = zzekbVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzilp;
        if (i3 > dArr.length) {
            this.zzilp = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(zzekbVar.zzilp, 0, this.zzilp, this.size, zzekbVar.size);
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
        double doubleValue = ((Double) obj).doubleValue();
        zzbgj();
        zzfw(i);
        double[] dArr = this.zzilp;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzbgj();
        zzfw(i);
        double[] dArr = this.zzilp;
        double d = dArr[i];
        if (i < this.size - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        zzbgj();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfx(i));
        }
        double[] dArr = this.zzilp;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzilp, i, dArr2, i + 1, this.size - i);
            this.zzilp = dArr2;
        }
        this.zzilp[i] = doubleValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final /* synthetic */ zzela<Double> zzfy(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzekb(Arrays.copyOf(this.zzilp, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzfw(i);
        return Double.valueOf(this.zzilp[i]);
    }

    static {
        zzekb zzekbVar = new zzekb(new double[0], 0);
        zzilo = zzekbVar;
        zzekbVar.zzbgi();
    }
}
