package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdxa {
    public static <E> ArrayList<E> zzet(int i) {
        zzdwm.zzh(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    public static <F, T> List<T> zza(List<F> list, zzdvo<? super F, ? extends T> zzdvoVar) {
        if (list instanceof RandomAccess) {
            return new zzdwz(list, zzdvoVar);
        }
        return new zzdxb(list, zzdvoVar);
    }
}
