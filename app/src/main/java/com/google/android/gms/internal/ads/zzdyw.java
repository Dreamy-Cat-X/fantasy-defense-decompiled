package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdyw<V> extends zzdyu<V> {
    private final zzdzl<V> zzhyv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyw(zzdzl<V> zzdzlVar) {
        this.zzhyv = (zzdzl) zzdwa.checkNotNull(zzdzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdxz, com.google.android.gms.internal.ads.zzdzl
    public final void addListener(Runnable runnable, Executor executor) {
        this.zzhyv.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdxz, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zzhyv.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzdxz, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzhyv.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzdxz, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzhyv.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzdxz, java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return this.zzhyv.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdxz, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzhyv.get(j, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.zzdxz
    public final String toString() {
        return this.zzhyv.toString();
    }
}
