package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzekp extends zzeja<Float> implements zzela<Float>, zzemp, RandomAccess {
    private static final zzekp zzios;
    private int size;
    private float[] zziot;

    zzekp() {
        this(new float[10], 0);
    }

    private zzekp(float[] fArr, int i) {
        this.zziot = fArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbgj();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zziot;
        System.arraycopy(fArr, i2, fArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzekp)) {
            return super.equals(obj);
        }
        zzekp zzekpVar = (zzekp) obj;
        if (this.size != zzekpVar.size) {
            return false;
        }
        float[] fArr = zzekpVar.zziot;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.zziot[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zziot[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zziot[i] == floatValue) {
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

    public final void zzh(float f) {
        zzbgj();
        int i = this.size;
        float[] fArr = this.zziot;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zziot = fArr2;
        }
        float[] fArr3 = this.zziot;
        int i2 = this.size;
        this.size = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zzbgj();
        zzeks.checkNotNull(collection);
        if (!(collection instanceof zzekp)) {
            return super.addAll(collection);
        }
        zzekp zzekpVar = (zzekp) collection;
        int i = zzekpVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.zziot;
        if (i3 > fArr.length) {
            this.zziot = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(zzekpVar.zziot, 0, this.zziot, this.size, zzekpVar.size);
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
        float floatValue = ((Float) obj).floatValue();
        zzbgj();
        zzfw(i);
        float[] fArr = this.zziot;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzbgj();
        zzfw(i);
        float[] fArr = this.zziot;
        float f = fArr[i];
        if (i < this.size - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zzbgj();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfx(i));
        }
        float[] fArr = this.zziot;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zziot, i, fArr2, i + 1, this.size - i);
            this.zziot = fArr2;
        }
        this.zziot[i] = floatValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final /* synthetic */ zzela<Float> zzfy(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzekp(Arrays.copyOf(this.zziot, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzfw(i);
        return Float.valueOf(this.zziot[i]);
    }

    static {
        zzekp zzekpVar = new zzekp(new float[0], 0);
        zzios = zzekpVar;
        zzekpVar.zzbgi();
    }
}
