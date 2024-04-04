package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdyv<V> extends zzdwl implements Future<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdwl
    /* renamed from: zzbag, reason: merged with bridge method [inline-methods] */
    public abstract Future<? extends V> zzazi();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return zzazi().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return zzazi().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return zzazi().isDone();
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return zzazi().get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return zzazi().get(j, timeUnit);
    }
}
