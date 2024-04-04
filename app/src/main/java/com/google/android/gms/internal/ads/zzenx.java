package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzenx implements Iterator<String> {
    private final /* synthetic */ zzenv zzitn;
    private Iterator<String> zziuj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenx(zzenv zzenvVar) {
        zzelk zzelkVar;
        this.zzitn = zzenvVar;
        zzelkVar = this.zzitn.zzito;
        this.zziuj = zzelkVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zziuj.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zziuj.next();
    }
}
