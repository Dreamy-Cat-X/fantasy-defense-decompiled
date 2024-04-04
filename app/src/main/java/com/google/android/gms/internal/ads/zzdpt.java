package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdpt implements ThreadFactory {
    private final AtomicInteger zzzj = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zzzj.getAndIncrement();
        StringBuilder sb = new StringBuilder(25);
        sb.append("AdWorker(NG) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
