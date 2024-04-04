package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdzf;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdyz extends zzdzg {
    public static <V> zzdzl<V> zzag(@NullableDecl V v) {
        if (v == null) {
            return (zzdzl<V>) zzdzf.zzhyz;
        }
        return new zzdzf(v);
    }

    public static <V> zzdzl<V> immediateFailedFuture(Throwable th) {
        zzdwa.checkNotNull(th);
        return new zzdzf.zza(th);
    }

    public static <O> zzdzl<O> zza(Callable<O> callable, Executor executor) {
        zzdzw zzf = zzdzw.zzf(callable);
        executor.execute(zzf);
        return zzf;
    }

    public static <O> zzdzl<O> zza(zzdyk<O> zzdykVar, Executor executor) {
        zzdzw zzdzwVar = new zzdzw(zzdykVar);
        executor.execute(zzdzwVar);
        return zzdzwVar;
    }

    public static <V, X extends Throwable> zzdzl<V> zzb(zzdzl<? extends V> zzdzlVar, Class<X> cls, zzdyj<? super X, ? extends V> zzdyjVar, Executor executor) {
        return zzdxv.zza(zzdzlVar, cls, zzdyjVar, executor);
    }

    public static <V> zzdzl<V> zza(zzdzl<V> zzdzlVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzdzlVar.isDone() ? zzdzlVar : zzdzs.zzb(zzdzlVar, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> zzdzl<O> zzb(zzdzl<I> zzdzlVar, zzdyj<? super I, ? extends O> zzdyjVar, Executor executor) {
        return zzdyc.zza(zzdzlVar, zzdyjVar, executor);
    }

    public static <I, O> zzdzl<O> zzb(zzdzl<I> zzdzlVar, zzdvo<? super I, ? extends O> zzdvoVar, Executor executor) {
        return zzdyc.zza(zzdzlVar, zzdvoVar, executor);
    }

    public static <V> zzdzl<List<V>> zzi(Iterable<? extends zzdzl<? extends V>> iterable) {
        return new zzdyl(zzdws.zzh(iterable), true);
    }

    @SafeVarargs
    public static <V> zzdze<V> zza(zzdzl<? extends V>... zzdzlVarArr) {
        return new zzdze<>(false, zzdws.zzb(zzdzlVarArr), null);
    }

    public static <V> zzdze<V> zzj(Iterable<? extends zzdzl<? extends V>> iterable) {
        return new zzdze<>(false, zzdws.zzh(iterable), null);
    }

    @SafeVarargs
    public static <V> zzdze<V> zzb(zzdzl<? extends V>... zzdzlVarArr) {
        return new zzdze<>(true, zzdws.zzb(zzdzlVarArr), null);
    }

    public static <V> zzdze<V> zzk(Iterable<? extends zzdzl<? extends V>> iterable) {
        return new zzdze<>(true, zzdws.zzh(iterable), null);
    }

    public static <V> void zza(zzdzl<V> zzdzlVar, zzdza<? super V> zzdzaVar, Executor executor) {
        zzdwa.checkNotNull(zzdzaVar);
        zzdzlVar.addListener(new zzdzb(zzdzlVar, zzdzaVar), executor);
    }

    public static <V> V zza(Future<V> future) throws ExecutionException {
        if (!future.isDone()) {
            throw new IllegalStateException(zzdwi.zzb("Future was expected to be done: %s", future));
        }
        return (V) zzeaa.getUninterruptibly(future);
    }

    public static <V> V zzb(Future<V> future) {
        zzdwa.checkNotNull(future);
        try {
            return (V) zzeaa.getUninterruptibly(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzdyr((Error) cause);
            }
            throw new zzeab(cause);
        }
    }
}
