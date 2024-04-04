package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzduu implements zzdut {
    private zzduu() {
    }

    @Override // com.google.android.gms.internal.ads.zzdut
    public final ExecutorService zzel(int i) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    @Override // com.google.android.gms.internal.ads.zzdut
    public final ExecutorService zza(ThreadFactory threadFactory, int i) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory));
    }

    @Override // com.google.android.gms.internal.ads.zzdut
    public final ExecutorService zza(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzdut
    public final ExecutorService zzem(int i) {
        return zza(1, Executors.defaultThreadFactory(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzdut
    public final ExecutorService zzb(ThreadFactory threadFactory, int i) {
        return zza(1, threadFactory, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdut
    public final ScheduledExecutorService zzb(int i, ThreadFactory threadFactory, int i2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
    }
}
