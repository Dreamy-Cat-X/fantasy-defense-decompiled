package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzenf<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzend zzitc;
    private Iterator<Map.Entry<K, V>> zzitd;

    private zzenf(zzend zzendVar) {
        List list;
        this.zzitc = zzendVar;
        list = this.zzitc.zzisx;
        this.pos = list.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.pos;
        if (i > 0) {
            list = this.zzitc.zzisx;
            if (i <= list.size()) {
                return true;
            }
        }
        return zzbky().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzbky() {
        Map map;
        if (this.zzitd == null) {
            map = this.zzitc.zzita;
            this.zzitd = map.entrySet().iterator();
        }
        return this.zzitd;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (zzbky().hasNext()) {
            return zzbky().next();
        }
        list = this.zzitc.zzisx;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) list.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzenf(zzend zzendVar, zzenc zzencVar) {
        this(zzendVar);
    }
}
