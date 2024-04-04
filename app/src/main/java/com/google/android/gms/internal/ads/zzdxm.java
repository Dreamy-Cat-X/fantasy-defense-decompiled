package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdxm<E> extends zzdwv<E> {
    static final zzdxm<Object> zzhwx = new zzdxm<>(new Object[0], 0, null, 0, 0);
    private final transient int mask;
    private final transient int size;
    private final transient int zzahu;
    private final transient Object[] zzhwy;
    private final transient Object[] zzhwz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxm(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzhwy = objArr;
        this.zzhwz = objArr2;
        this.mask = i2;
        this.zzahu = i;
        this.size = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final int zzazl() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final boolean zzazo() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdwv
    final boolean zzazq() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.zzhwz;
        if (obj == null || objArr == null) {
            return false;
        }
        int zzep = zzdwo.zzep(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i = zzep & this.mask;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzep = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn
    /* renamed from: zzazj */
    public final zzdxp<E> iterator() {
        return (zzdxp) zzazn().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final Object[] zzazk() {
        return this.zzhwy;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn
    final int zzazm() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzhwy, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdwv
    final zzdws<E> zzazr() {
        return zzdws.zzb(this.zzhwy, this.size);
    }

    @Override // com.google.android.gms.internal.ads.zzdwv, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzahu;
    }

    @Override // com.google.android.gms.internal.ads.zzdwv, com.google.android.gms.internal.ads.zzdwn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
