package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdzw<V> extends zzdyt<V> implements RunnableFuture<V> {
    private volatile zzdzh<?> zzhzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzdzw<V> zzf(Callable<V> callable) {
        return new zzdzw<>(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzdzw<V> zza(Runnable runnable, @NullableDecl V v) {
        return new zzdzw<>(Executors.callable(runnable, v));
    }

    private zzdzw(Callable<V> callable) {
        this.zzhzm = new zzdzy(this, callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzw(zzdyk<V> zzdykVar) {
        this.zzhzm = new zzdzz(this, zzdykVar);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzdzh<?> zzdzhVar = this.zzhzm;
        if (zzdzhVar != null) {
            zzdzhVar.run();
        }
        this.zzhzm = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdxz
    public final void afterDone() {
        zzdzh<?> zzdzhVar;
        super.afterDone();
        if (wasInterrupted() && (zzdzhVar = this.zzhzm) != null) {
            zzdzhVar.interruptTask();
        }
        this.zzhzm = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdxz
    public final String pendingToString() {
        zzdzh<?> zzdzhVar = this.zzhzm;
        if (zzdzhVar != null) {
            String valueOf = String.valueOf(zzdzhVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("task=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return super.pendingToString();
    }
}
