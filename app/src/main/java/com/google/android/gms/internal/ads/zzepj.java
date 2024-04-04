package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzepj<E> implements Iterator<E> {
    private int pos = 0;
    private final /* synthetic */ zzepg zzizw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepj(zzepg zzepgVar) {
        this.zzizw = zzepgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.pos < this.zzizw.zzizu.size() || this.zzizw.zzizv.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        while (this.pos >= this.zzizw.zzizu.size()) {
            this.zzizw.zzizu.add(this.zzizw.zzizv.next());
        }
        List<E> list = this.zzizw.zzizu;
        int i = this.pos;
        this.pos = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
