package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdwx<T> extends zzdxp<T> {
    private boolean zzhwi;
    private final /* synthetic */ Object zzhwj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwx(Object obj) {
        this.zzhwj = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzhwi;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.zzhwi) {
            throw new NoSuchElementException();
        }
        this.zzhwi = true;
        return (T) this.zzhwj;
    }
}
