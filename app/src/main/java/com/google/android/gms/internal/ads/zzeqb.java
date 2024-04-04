package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeqb<T> {
    private final List<zzeqd<T>> zzjan;
    private final List<zzeqd<Collection<T>>> zzjao;

    private zzeqb(int i, int i2) {
        this.zzjan = zzepp.zzid(i);
        this.zzjao = zzepp.zzid(i2);
    }

    public final zzeqb<T> zzaw(zzeqd<? extends T> zzeqdVar) {
        this.zzjan.add(zzeqdVar);
        return this;
    }

    public final zzeqb<T> zzax(zzeqd<? extends Collection<? extends T>> zzeqdVar) {
        this.zzjao.add(zzeqdVar);
        return this;
    }

    public final zzepz<T> zzbmr() {
        return new zzepz<>(this.zzjan, this.zzjao);
    }
}
