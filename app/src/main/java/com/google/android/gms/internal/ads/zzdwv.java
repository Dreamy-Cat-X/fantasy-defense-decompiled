package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdwv<E> extends zzdwn<E> implements Set<E> {

    @NullableDecl
    private transient zzdws<E> zzhwd;

    public static <E> zzdwv<E> zzad(E e) {
        return new zzdxo(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    boolean zzazq() {
        return false;
    }

    @SafeVarargs
    public static <E> zzdwv<E> zza(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        zzdwa.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return zza(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> zzdwv<E> zza(int i, Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return zzad(objArr[0]);
            }
            int zzer = zzer(i);
            Object[] objArr2 = new Object[zzer];
            int i2 = zzer - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object zzd = zzdxd.zzd(objArr[i5], i5);
                int hashCode = zzd.hashCode();
                int zzep = zzdwo.zzep(hashCode);
                while (true) {
                    int i6 = zzep & i2;
                    Object obj = objArr2[i6];
                    if (obj == null) {
                        objArr[i4] = zzd;
                        objArr2[i6] = zzd;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                    if (!obj.equals(zzd)) {
                        zzep++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new zzdxo(objArr[0], i3);
            }
            if (zzer(i4) >= zzer / 2) {
                if (zzw(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzdxm(objArr, i3, objArr2, i2, i4);
            }
            i = i4;
        }
        return zzdxm.zzhwx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzer(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= max) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            zzdwa.checkArgument(max < 1073741824, "collection too large");
            return 1073741824;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdwv) && zzazq() && ((zzdwv) obj).zzazq() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzdxl.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzdxl.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdwn
    public zzdws<E> zzazn() {
        zzdws<E> zzdwsVar = this.zzhwd;
        if (zzdwsVar != null) {
            return zzdwsVar;
        }
        zzdws<E> zzazr = zzazr();
        this.zzhwd = zzazr;
        return zzazr;
    }

    zzdws<E> zzazr() {
        return zzdws.zzc(toArray());
    }

    public static <E> zzdwy<E> zzes(int i) {
        zzdwm.zzh(i, "expectedSize");
        return new zzdwy<>(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdwn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
