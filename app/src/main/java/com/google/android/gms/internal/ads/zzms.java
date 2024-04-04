package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzms implements Runnable {
    private final /* synthetic */ zzmr zzbdi;
    private final /* synthetic */ zzmx zzbej;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzms(zzmr zzmrVar, zzmx zzmxVar) {
        this.zzbdi = zzmrVar;
        this.zzbej = zzmxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.zzbej.release();
        sparseArray = this.zzbdi.zzbdu;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray2 = this.zzbdi.zzbdu;
            ((zznl) sparseArray2.valueAt(i)).disable();
        }
    }
}
