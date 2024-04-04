package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public class zzazc<T> implements zzdzl<T> {
    private final zzdzt<T> zzegs = zzdzt.zzbaj();

    public final boolean set(T t) {
        return zzas(this.zzegs.set(t));
    }

    public final boolean setException(Throwable th) {
        return zzas(this.zzegs.setException(th));
    }

    private static boolean zzas(boolean z) {
        if (!z) {
            com.google.android.gms.ads.internal.zzp.zzku().zzb(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzdzl
    public void addListener(Runnable runnable, Executor executor) {
        this.zzegs.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.zzegs.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.zzegs.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.zzegs.isDone();
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        return this.zzegs.get();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zzegs.get(j, timeUnit);
    }
}
