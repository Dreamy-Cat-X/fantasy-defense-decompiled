package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdya extends AbstractExecutorService implements zzdzk {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return zzdzw.zza(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return zzdzw.zzf(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzdzl<?> submit(Runnable runnable) {
        return (zzdzl) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final <T> zzdzl<T> submit(Callable<T> callable) {
        return (zzdzl) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* synthetic */ Future submit(Runnable runnable, @NullableDecl Object obj) {
        return (zzdzl) super.submit(runnable, obj);
    }
}
