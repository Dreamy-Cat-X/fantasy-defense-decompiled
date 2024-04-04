package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzdzk extends ExecutorService {
    <T> zzdzl<T> zze(Callable<T> callable);

    zzdzl<?> zzg(Runnable runnable);
}
