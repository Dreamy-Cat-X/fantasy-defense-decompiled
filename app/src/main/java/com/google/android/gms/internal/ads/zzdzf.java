package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxz;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzdzf<V> implements zzdzl<V> {

    @NullableDecl
    private final V value;
    static final zzdzl<?> zzhyz = new zzdzf(null);
    private static final Logger zzhxm = Logger.getLogger(zzdzf.class.getName());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza<V> extends zzdxz.zzh<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public zza(Throwable th) {
            setException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzf(@NullableDecl V v) {
        this.value = v;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdzl
    public void addListener(Runnable runnable, Executor executor) {
        zzdwa.checkNotNull(runnable, "Runnable was null.");
        zzdwa.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzhxm;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        zzdwa.checkNotNull(timeUnit);
        return get();
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }
}
