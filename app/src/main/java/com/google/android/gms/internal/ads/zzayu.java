package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzayu extends ScheduledThreadPoolExecutor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayu(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(zzduw.zzazb().zzf(runnable));
    }
}
