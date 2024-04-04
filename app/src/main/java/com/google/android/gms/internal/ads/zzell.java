package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzell extends zzeja<String> implements zzelk, RandomAccess {
    private static final zzell zziqj;
    private static final zzelk zziqk;
    private final List<Object> zziql;

    public zzell() {
        this(10);
    }

    public zzell(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private zzell(ArrayList<Object> arrayList) {
        this.zziql = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zziql.size();
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzbgj();
        if (collection instanceof zzelk) {
            collection = ((zzelk) collection).zzbjp();
        }
        boolean addAll = this.zziql.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbgj();
        this.zziql.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzelk
    public final void zzak(zzejg zzejgVar) {
        zzbgj();
        this.zziql.add(zzejgVar);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzelk
    public final Object zzhj(int i) {
        return this.zziql.get(i);
    }

    private static String zzam(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzejg) {
            return ((zzejg) obj).zzbgl();
        }
        return zzeks.zzy((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzelk
    public final List<?> zzbjp() {
        return Collections.unmodifiableList(this.zziql);
    }

    @Override // com.google.android.gms.internal.ads.zzelk
    public final zzelk zzbjq() {
        return zzbgh() ? new zzenv(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zzbgj();
        return zzam(this.zziql.set(i, (String) obj));
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzbgj();
        Object remove = this.zziql.remove(i);
        this.modCount++;
        return zzam(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, com.google.android.gms.internal.ads.zzela
    public final /* bridge */ /* synthetic */ boolean zzbgh() {
        return super.zzbgh();
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzbgj();
        this.zziql.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzeja, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final /* synthetic */ zzela zzfy(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zziql);
        return new zzell((ArrayList<Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zziql.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzejg) {
            zzejg zzejgVar = (zzejg) obj;
            String zzbgl = zzejgVar.zzbgl();
            if (zzejgVar.zzbgm()) {
                this.zziql.set(i, zzbgl);
            }
            return zzbgl;
        }
        byte[] bArr = (byte[]) obj;
        String zzy = zzeks.zzy(bArr);
        if (zzeks.zzx(bArr)) {
            this.zziql.set(i, zzy);
        }
        return zzy;
    }

    static {
        zzell zzellVar = new zzell();
        zziqj = zzellVar;
        zzellVar.zzbgi();
        zziqk = zziqj;
    }
}
