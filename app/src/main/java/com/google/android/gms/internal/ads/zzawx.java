package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzawx implements ThreadFactory {
    private final AtomicInteger zzzj = new AtomicInteger(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawx(zzawg zzawgVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zzzj.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
