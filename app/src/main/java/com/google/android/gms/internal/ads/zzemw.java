package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzemw implements Iterator<zzejn> {
    private final ArrayDeque<zzemv> zzisk;
    private zzejn zzisl;

    private zzemw(zzejg zzejgVar) {
        zzejg zzejgVar2;
        if (zzejgVar instanceof zzemv) {
            zzemv zzemvVar = (zzemv) zzejgVar;
            ArrayDeque<zzemv> arrayDeque = new ArrayDeque<>(zzemvVar.zzbgp());
            this.zzisk = arrayDeque;
            arrayDeque.push(zzemvVar);
            zzejgVar2 = zzemvVar.zzisg;
            this.zzisl = zzal(zzejgVar2);
            return;
        }
        this.zzisk = null;
        this.zzisl = (zzejn) zzejgVar;
    }

    private final zzejn zzal(zzejg zzejgVar) {
        while (zzejgVar instanceof zzemv) {
            zzemv zzemvVar = (zzemv) zzejgVar;
            this.zzisk.push(zzemvVar);
            zzejgVar = zzemvVar.zzisg;
        }
        return (zzejn) zzejgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzisl != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzejn next() {
        zzejn zzejnVar;
        zzejg zzejgVar;
        zzejn zzejnVar2 = this.zzisl;
        if (zzejnVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque<zzemv> arrayDeque = this.zzisk;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                zzejnVar = null;
                break;
            }
            zzejgVar = this.zzisk.pop().zzish;
            zzejnVar = zzal(zzejgVar);
        } while (zzejnVar.isEmpty());
        this.zzisl = zzejnVar;
        return zzejnVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzemw(zzejg zzejgVar, zzemu zzemuVar) {
        this(zzejgVar);
    }
}
