package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdwp<E> {
    public abstract zzdwp<E> zzaa(E e);

    public zzdwp<E> zzg(Iterable<? extends E> iterable) {
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            zzaa(it.next());
        }
        return this;
    }

    public zzdwp<E> zza(Iterator<? extends E> it) {
        while (it.hasNext()) {
            zzaa(it.next());
        }
        return this;
    }
}
