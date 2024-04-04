package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdql<E, V> implements zzdzl<V> {
    private final E zzhof;
    private final String zzhog;
    private final zzdzl<V> zzhoh;

    public zzdql(E e, String str, zzdzl<V> zzdzlVar) {
        this.zzhof = e;
        this.zzhog = str;
        this.zzhoh = zzdzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdzl
    public final void addListener(Runnable runnable, Executor executor) {
        this.zzhoh.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zzhoh.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return this.zzhoh.get();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzhoh.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzhoh.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzhoh.isDone();
    }

    public final E zzaxk() {
        return this.zzhof;
    }

    public final String zzaxl() {
        return this.zzhog;
    }

    public final String toString() {
        String str = this.zzhog;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }
}
