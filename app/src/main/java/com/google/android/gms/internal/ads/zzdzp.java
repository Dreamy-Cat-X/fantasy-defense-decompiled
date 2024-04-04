package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
class zzdzp extends zzdya {
    private final ExecutorService zzhzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzp(ExecutorService executorService) {
        this.zzhzg = (ExecutorService) zzdwa.checkNotNull(executorService);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.zzhzg.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.zzhzg.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.zzhzg.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.zzhzg.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.zzhzg.shutdownNow();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zzhzg.execute(runnable);
    }
}
