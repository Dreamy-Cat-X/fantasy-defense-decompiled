package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzenl<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzend zzitc;
    private Iterator<Map.Entry<K, V>> zzitd;
    private boolean zzith;

    private zzenl(zzend zzendVar) {
        this.zzitc = zzendVar;
        this.pos = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.zzitc.zzisx;
        if (i >= list.size()) {
            map = this.zzitc.zzisy;
            if (map.isEmpty() || !zzbky().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzith) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzith = false;
        this.zzitc.zzbkw();
        int i = this.pos;
        list = this.zzitc.zzisx;
        if (i < list.size()) {
            zzend zzendVar = this.zzitc;
            int i2 = this.pos;
            this.pos = i2 - 1;
            zzendVar.zzhv(i2);
            return;
        }
        zzbky().remove();
    }

    private final Iterator<Map.Entry<K, V>> zzbky() {
        Map map;
        if (this.zzitd == null) {
            map = this.zzitc.zzisy;
            this.zzitd = map.entrySet().iterator();
        }
        return this.zzitd;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzith = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzitc.zzisx;
        if (i >= list.size()) {
            return zzbky().next();
        }
        list2 = this.zzitc.zzisx;
        return (Map.Entry) list2.get(this.pos);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzenl(zzend zzendVar, zzenc zzencVar) {
        this(zzendVar);
    }
}
