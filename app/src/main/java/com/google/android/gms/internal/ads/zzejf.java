package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzejf extends zzejh {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ zzejg zziki;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejf(zzejg zzejgVar) {
        this.zziki = zzejgVar;
        this.limit = this.zziki.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.android.gms.internal.ads.zzejl
    public final byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new NoSuchElementException();
        }
        this.position = i + 1;
        return this.zziki.zzga(i);
    }
}
