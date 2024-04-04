package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzekz<F, T> extends AbstractList<T> {
    private final List<F> zzhwl;
    private final zzeky<F, T> zzipo;

    public zzekz(List<F> list, zzeky<F, T> zzekyVar) {
        this.zzhwl = list;
        this.zzipo = zzekyVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.zzipo.convert(this.zzhwl.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzhwl.size();
    }
}
