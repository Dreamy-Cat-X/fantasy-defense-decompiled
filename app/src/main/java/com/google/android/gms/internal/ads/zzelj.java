package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzelj<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zziqi;

    public zzelj(Iterator<Map.Entry<K, Object>> it) {
        this.zziqi = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zziqi.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zziqi.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.zziqi.next();
        return next.getValue() instanceof zzele ? new zzelg(next) : next;
    }
}
