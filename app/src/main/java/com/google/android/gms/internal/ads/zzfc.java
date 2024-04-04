package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzfc implements ThreadFactory {
    private final ThreadFactory zzzi = Executors.defaultThreadFactory();
    private final AtomicInteger zzzj = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.zzzi.newThread(runnable);
        int andIncrement = this.zzzj.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
