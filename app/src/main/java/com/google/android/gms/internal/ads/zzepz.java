package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzepz<T> implements zzepq<Set<T>> {
    private static final zzepq<Set<Object>> zzjam = zzept.zzbb(Collections.emptySet());
    private final List<zzeqd<T>> zzjan;
    private final List<zzeqd<Collection<T>>> zzjao;

    public static <T> zzeqb<T> zzas(int i, int i2) {
        return new zzeqb<>(i, i2);
    }

    private zzepz(List<zzeqd<T>> list, List<zzeqd<Collection<T>>> list2) {
        this.zzjan = list;
        this.zzjao = list2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        int size = this.zzjan.size();
        ArrayList arrayList = new ArrayList(this.zzjao.size());
        int size2 = this.zzjao.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collection = this.zzjao.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zzie = zzepp.zzie(size);
        int size3 = this.zzjan.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzie.add(zzepw.checkNotNull(this.zzjan.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            Iterator it = ((Collection) arrayList.get(i3)).iterator();
            while (it.hasNext()) {
                zzie.add(zzepw.checkNotNull(it.next()));
            }
        }
        return Collections.unmodifiableSet(zzie);
    }
}
