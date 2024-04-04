package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzp implements Runnable {
    private final /* synthetic */ zzaa zzaa;
    private final /* synthetic */ zzm zzab;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(zzm zzmVar, zzaa zzaaVar) {
        this.zzab = zzmVar;
        this.zzaa = zzaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzab.zzm;
            blockingQueue.put(this.zzaa);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
